package StructurePattern.FacadePattern.alibaba.rpcProviderFacade;

import StructurePattern.bridgePattern.application.rule.ApplicationDO;

public class ApplicationService {
    void saveApplication(ApplicationDO applicationDO){
        System.out.println("application saved");
    }
}
