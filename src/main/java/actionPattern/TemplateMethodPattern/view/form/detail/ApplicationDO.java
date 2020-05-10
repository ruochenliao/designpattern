package actionPattern.TemplateMethodPattern.view.form.detail;

import lombok.Data;

@Data
public class ApplicationDO {
    private String applicant;
    private String auditId;
    private String applicationType;
    private String receiveLocation;
    private String returnLocation;
}
