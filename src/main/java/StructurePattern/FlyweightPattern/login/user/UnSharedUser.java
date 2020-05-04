package StructurePattern.FlyweightPattern.login.user;

import java.util.List;

public class UnSharedUser implements User{
    private static final String bpmsPreLink = "http://www.bpms.com";

    @Override
    public String getWorkNo() {
        return null;
    }

    @Override
    public List<String> getRights() {
        return null;
    }

    @Override
    public String getBpmsLink(String formId, String formType) {
        return bpmsPreLink + "/" + formId + "/"+ formType;
    }
}
