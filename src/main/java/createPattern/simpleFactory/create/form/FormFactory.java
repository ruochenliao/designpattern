package createPattern.simpleFactory.create.form;

public class FormFactory {
    public Form createForm(String formType){
        if("receiveForm".equals(formType)){
            return new ReceiveForm();
        }
        if("exchangeForm".equals(formType)){
            return new ExchangeForm();
        }
        throw new RuntimeException("NO SUCH FORM formType:"+formType);
    }
}
