package createPattern.Factory.form.create;

public class Test {
    public static void main(String[] args) {
        //创建阿里巴巴更换申请单
        ExchangeApplication exchangeApplication = buildApplication();
        AlibabaFormFactory alibabaFormFactory = new AlibabaFormFactory();
        //提交申请单
        alibabaFormFactory.submitForm(exchangeApplication);
        System.out.println();

        //创建腾讯领用申请单
        ReceiveApplication receiveForm = buildReceiveApplication();
        TencentFormFactory tencentFormFactory = new TencentFormFactory();
        tencentFormFactory.submitForm(receiveForm);
    }

    private static ReceiveApplication buildReceiveApplication() {
        ReceiveApplication receiveApplication = new ReceiveApplication();
        receiveApplication.setFormType("receiveForm");
        receiveApplication.setApplicant("Nebula");
        receiveApplication.setReason("阿里巴巴测试");
        return receiveApplication;
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
