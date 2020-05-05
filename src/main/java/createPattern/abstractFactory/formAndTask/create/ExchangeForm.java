package createPattern.abstractFactory.formAndTask.create;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class ExchangeForm implements FormService{
    @Override
    public Boolean check(Application application) {
        if(!"exchangeForm".equals(application.getFormType())){
            return false;
        }
        ExchangeApplication exchangeApplication = (ExchangeApplication) application;
        if (exchangeApplication == null
                || StringUtils.isBlank(exchangeApplication.getApplicant())
                || StringUtils.isBlank(exchangeApplication.getFormType())
                || StringUtils.isBlank(exchangeApplication.getReason())
                || StringUtils.isBlank(exchangeApplication.getReceiveLocation())
                || StringUtils.isBlank(exchangeApplication.getReturnLocation())) {
            return false;
        }
        System.out.println("更换申请单校验通过");
        return true;
    }

    @Override
    public void createAudit(Application application) {
        System.out.println("创建更换审批单");
    }

    @Override
    public void saveForm(Application application) {
        System.out.println("保存更换申请单");
    }

    @Override
    public void createTask(Application application) {
        ReceiveTaskDTO receiveTaskDTO = new ReceiveTaskDTO();
        ReturnTaskDTO returnTaskDTO = new ReturnTaskDTO();

        receiveTaskDTO.setTaskId(UUID.randomUUID().toString());
        receiveTaskDTO.setReceiveLocation("alibaba");
        receiveTaskDTO.setTaskType("receive");
        returnTaskDTO.setTaskId(UUID.randomUUID().toString());
        returnTaskDTO.setReturnAssetCode("TD12983892374");
        returnTaskDTO.setReturnLocal("蚂蚁 Z 空间");

        if("alibaba".equals(application.getTenant())){
            AlibabaFormFactory alibabaFormFactory = new AlibabaFormFactory();
            alibabaFormFactory.createTask(receiveTaskDTO);
            System.out.println("创建领用任务");
            alibabaFormFactory.createTask(returnTaskDTO);
            System.out.println("创建归还任务");
        }
    }
}
