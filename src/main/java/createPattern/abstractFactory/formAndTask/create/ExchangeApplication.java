package createPattern.abstractFactory.formAndTask.create;

import lombok.Data;

@Data
public class ExchangeApplication extends Application {
    private String receiveLocation;
    private String returnLocation;
    private String returnAssetCode;
    private String receiveAssetType;
}
