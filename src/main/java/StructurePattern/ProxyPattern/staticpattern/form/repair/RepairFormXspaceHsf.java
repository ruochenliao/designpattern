package StructurePattern.ProxyPattern.staticpattern.form.repair;

public class RepairFormXspaceHsf implements RepairForm{

    @Override
    public void createForm(String applicant, String assetCode, String reason) {
        System.out.println("pre request DynamicProxy form");
        RepairForm repairForm = new RepairFormImpl();
        repairForm.createForm(applicant, assetCode, reason);
        System.out.println("after request DynamicProxy form");
    }
}
