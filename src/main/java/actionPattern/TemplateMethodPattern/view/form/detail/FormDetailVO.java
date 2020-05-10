package actionPattern.TemplateMethodPattern.view.form.detail;

import lombok.Data;

@Data
public class FormDetailVO {
    TittleVO tittleVO;
    AssetVO ownerAssetVO;
    AssetVO applyAssetVO;
    ProgressVO progressVO;
}
