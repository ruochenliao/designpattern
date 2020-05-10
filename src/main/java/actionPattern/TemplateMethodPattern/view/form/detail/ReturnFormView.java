package actionPattern.TemplateMethodPattern.view.form.detail;

public class ReturnFormView extends FormView{

    @Override
    void buildOwnerAssets(FormDetailVO formDetailVO, ApplicationDO applicationDO) {

    }

    @Override
    void buildApplyAssets(FormDetailVO formDetailVO, ApplicationDO applicationDO) {
        ReturnVO returnVO = new ReturnVO();
        returnVO.setReturnLocation(applicationDO.getReturnLocation());
        formDetailVO.setApplyAssetVO(returnVO);
    }
}
