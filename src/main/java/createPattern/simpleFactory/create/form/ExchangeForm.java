package createPattern.simpleFactory.create.form;

import org.apache.commons.lang3.StringUtils;

public class ExchangeForm implements Form{
    @Override
    public Boolean check(Application application) {
        ExchangeApplication exchangeApplication = (ExchangeApplication) application;
        if (exchangeApplication == null
                || StringUtils.isBlank(exchangeApplication.getApplicant())
                || StringUtils.isBlank(exchangeApplication.getFormType())
                || StringUtils.isBlank(exchangeApplication.getReason())) {
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
        System.out.println("创建领用任务");
        System.out.println("创建归还任务");
    }
}
