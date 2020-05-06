package StructurePattern.adatorPattern.form.repair;

public class RepairFormXspaceAdaptor extends RepairFormImpl implements Xspace{
    @Override
    public void createXspace(String applicant, String assetCode, String reason) {
        System.out.println("从 Xspace 发起的请求");
        createForm(applicant, assetCode, reason);
        System.out.println("Xspace 成功完成请求");
    }
}
