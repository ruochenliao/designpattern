package createPattern.simpleFactory.create.form;

public class Test {
    public static void main(String[] args) {
        //注入 formService
        FormService formService = new FormService();
        //创建更换申请单
        ExchangeApplication exchangeApplication = buildApplication();
        formService.submitForm(exchangeApplication);
    }

    private static ExchangeApplication buildApplication() {
        ExchangeApplication exchangeApplication = new ExchangeApplication();
        exchangeApplication.setReceiveAssetType("COMPUTER");
        exchangeApplication.setReceiveLocation("阿里巴巴西溪");
        exchangeApplication.setReturnAssetCode("TD138748947234");
        exchangeApplication.setReturnLocation("蚂蚁Z空间");
        exchangeApplication.setFormType("exchangeForm");
        exchangeApplication.setApplicant("Nebula");
        exchangeApplication.setReason("测试");
        return exchangeApplication;
    }
}
