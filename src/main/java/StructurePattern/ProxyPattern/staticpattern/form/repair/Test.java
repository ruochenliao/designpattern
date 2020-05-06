package StructurePattern.ProxyPattern.staticpattern.form.repair;

public class Test {
    public static void main(String[] args) {
        //真实地创建维修申请单
        RepairForm repairForm = new RepairFormImpl();
        repairForm.createForm("1", "TD198734893274", "测试");
        //使用代理类创建维修申请单
        RepairFormXspaceHsf repairFormXspaceHsf = new RepairFormXspaceHsf();
        repairFormXspaceHsf.createForm("1", "TD198734893274", "测试");
    }
}
