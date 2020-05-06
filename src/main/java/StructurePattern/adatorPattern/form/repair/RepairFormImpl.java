package StructurePattern.adatorPattern.form.repair;

public class RepairFormImpl implements RepairForm {

    @Override
    public void createForm(String applicant, String assetCode, String reason) {
        System.out.println("维修申请单创建成功");
    }
}
