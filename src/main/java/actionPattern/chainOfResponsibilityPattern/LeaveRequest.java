package actionPattern.chainOfResponsibilityPattern;

import lombok.Data;

@Data
public class LeaveRequest {
    private String name;
    private int days;
    private String reason;
}
