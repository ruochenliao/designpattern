package StructurePattern.FlyweightPattern.login.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharedUser implements User {

    private String workNo;
    private List<String> rightList;
    private User user;

    private static Map<String, String> map = new HashMap<>();

    public SharedUser(String workNo, List<String> rightList, User user) {
        this.workNo = workNo;
        this.rightList = rightList;
        this.user = user;
    }

    @Override
    public String getWorkNo() {
        return this.workNo;
    }

    @Override
    public List<String> getRights() {
        return this.rightList;
    }

    @Override
    public String getBpmsLink(String formId, String formType) {
        if (user == null) {
            return "无法获取审批链接";
        }
        return user.getBpmsLink(formId, formType);
    }
}
