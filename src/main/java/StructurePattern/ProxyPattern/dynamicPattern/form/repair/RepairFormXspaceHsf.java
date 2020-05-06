package StructurePattern.ProxyPattern.dynamicPattern.form.repair;

import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class RepairFormXspaceHsf implements RepairForm {

    @Override
    public void createForm(String applicant, String assetCode, String reason) {
        RepairForm repairFormProxy = (RepairForm) Proxy.newProxyInstance(RepairFormImpl.class.getClassLoader(),
                RepairFormImpl.class.getInterfaces(),
                new DynamicProxy(new RepairFormImpl()));
        repairFormProxy.createForm(applicant, assetCode, reason);
    }
}
