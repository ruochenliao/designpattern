package createPattern.abstractFactory.formAndTask.create;

import lombok.Data;

@Data
public class ReturnTaskDTO extends TaskDTO {
    private String returnAssetCode;
    private String returnLocal;
}
