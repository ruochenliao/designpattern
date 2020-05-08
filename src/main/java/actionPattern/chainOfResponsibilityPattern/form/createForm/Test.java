package actionPattern.chainOfResponsibilityPattern.form.createForm;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Node> nodeList = new ArrayList<>();
        SubmitFormDO submitFormDO = new SubmitFormDO();
        submitFormDO.setApplicant("测试人");
        submitFormDO.setApplicationCode("TD2349823492834");
        submitFormDO.setApplicationType("RECEIVE");
        ApplicationContext applicationContext = new ApplicationContext();
        applicationContext.setSubmitForm(submitFormDO);
        nodeList.add(new CheckNode());
        nodeList.add(new SaveNode());

        for (Node node:nodeList) {
            if(node.isFilter(applicationContext)){
                node.process(applicationContext);
            }
        }
    }
}
