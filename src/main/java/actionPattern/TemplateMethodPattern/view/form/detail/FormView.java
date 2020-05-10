package actionPattern.TemplateMethodPattern.view.form.detail;

import java.util.Collections;

public abstract class FormView {

    final void buildFormDetail(FormDetailVO formDetailVO, ApplicationDO applicationDO){
        buildTittle(formDetailVO, applicationDO);
        buildOwnerAssets(formDetailVO, applicationDO);
        buildApplyAssets(formDetailVO, applicationDO);
        buildProgress(formDetailVO, applicationDO);
    }

    abstract void buildOwnerAssets(FormDetailVO formDetailVO, ApplicationDO applicationDO);

    abstract void buildApplyAssets(FormDetailVO formDetailVO, ApplicationDO applicationDO);


    void buildTittle(FormDetailVO formDetailVO, ApplicationDO applicationDO){
        TittleVO tittleVO = new TittleVO();
        tittleVO.setApplicant(applicationDO.getApplicant());
        formDetailVO.setTittleVO(tittleVO);
    }

    void buildProgress(FormDetailVO formDetailVO, ApplicationDO applicationDO){
        ProgressVO progressVO = new ProgressVO();
        String auditId = applicationDO.getAuditId();
        String applicationType = applicationDO.getApplicationType();
        NodeDO nodeDO = new NodeDO();
        nodeDO.setAction("agree");
        nodeDO.setComment("可以通过");
        nodeDO.setName("HR");
        progressVO.setNodeList(Collections.singletonList(nodeDO));
        formDetailVO.setProgressVO(progressVO);
        System.out.println("auditId:" + auditId + " , applicationType: " + applicationType);
    }
}
