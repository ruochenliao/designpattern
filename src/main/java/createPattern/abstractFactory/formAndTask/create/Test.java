package createPattern.abstractFactory.formAndTask.create;

public class Test {
    public static void main(String[] args) {
        FormCreateService formCreateService = new FormCreateService();
        ExchangeApplication exchangeApplication = buildExchangeApplication();
        formCreateService.submitForm(exchangeApplication);
    }

    private static ExchangeApplication buildExchangeApplication() {
        ExchangeApplication exchangeApplication = new ExchangeApplication();
        exchangeApplication.setTenant("alibaba");
        exchangeApplication.setReceiveAssetType("computer");
        exchangeApplication.setReceiveLocation("阿里巴巴西溪园区");
        exchangeApplication.setReturnAssetCode("阿里巴巴滨江园区");
        exchangeApplication.setReturnAssetCode("TD18478237434");
        exchangeApplication.setApplicant("Nebula");
        exchangeApplication.setFormType("exchange");
        exchangeApplication.setReason("测试更换");
        return exchangeApplication;
    }
}
