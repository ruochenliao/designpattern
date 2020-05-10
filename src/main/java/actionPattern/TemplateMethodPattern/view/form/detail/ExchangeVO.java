package actionPattern.TemplateMethodPattern.view.form.detail;

import lombok.Data;

@Data
public class ExchangeVO extends AssetVO {
    private String receiveLocation;
    private String returnLocation;
}
