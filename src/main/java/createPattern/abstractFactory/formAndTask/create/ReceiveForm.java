package createPattern.abstractFactory.formAndTask.create;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class ReceiveForm implements FormService{
    @Override
    public Boolean check(Application application) {
        ReceiveApplication receiveApplication = (ReceiveApplication) application;
        if (receiveApplication == null
                || StringUtils.isBlank(receiveApplication.getApplicant())
                || StringUtils.isBlank(receiveApplication.getFormType())
                || StringUtils.isBlank(receiveApplication.getReason())) {
            return false;
        }
        System.out.println("校验通过");
        return true;
    }

    @Override
    public void createAudit(Application application) {
        System.out.println("创建领用审批单");
    }

    @Override
    public void saveForm(Application application) {
        System.out.println("保存领用申请单");
    }

    @Override
    public void createTask(Application application) {
        if("alibaba".equals(application.getTenant())){
            AlibabaFormFactory alibabaFormFactory = new AlibabaFormFactory();
            ReceiveTaskDTO taskDTO = new ReceiveTaskDTO();
            taskDTO.setTaskId(UUID.randomUUID().toString());
            taskDTO.setTaskType("receive");
            taskDTO.setReceiveLocation("alibaba");
            alibabaFormFactory.createTask(taskDTO);
            System.out.println("创建领用任务");
        }

    }
}
