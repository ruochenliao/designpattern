package actionPattern.TemplateMethodPattern.view.form.detail;

public class ReceiveFormView extends FormView{
    @Override
    void buildOwnerAssets(FormDetailVO formDetailVO, ApplicationDO applicationDO) {
        ReceiveVO receiveVO = new ReceiveVO();
        receiveVO.setReceiveLocation(applicationDO.getReceiveLocation());
        formDetailVO.setOwnerAssetVO(receiveVO);
    }

    @Override
    void buildApplyAssets(FormDetailVO formDetailVO, ApplicationDO applicationDO) {
    }


}
