package StructurePattern.FacadePattern.alibaba.rpcProviderFacade;

import StructurePattern.bridgePattern.application.rule.ApplicationDO;

//外部系统或者外部模块调用
public class Test {

    public static void main(String[] args) {
        RpcService rpcService = new RpcServiceImpl();
        rpcService.submitForm(new ApplicationDO());
    }
}
