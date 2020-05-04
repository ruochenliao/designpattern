package StructurePattern.FlyweightPattern.login.user;

import java.util.List;

public interface User {
    //共享工号，共享权限
    String getWorkNo();
    List<String> getRights();

    //非共享
    String getBpmsLink(String formId, String formType);
}
