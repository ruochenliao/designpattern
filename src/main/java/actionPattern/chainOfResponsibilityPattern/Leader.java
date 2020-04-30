package actionPattern.chainOfResponsibilityPattern;

import com.alibaba.fastjson.JSON;

public class Leader extends AbstractBoss {

    public Leader(String bossName) {
        super(bossName);
    }

    public void handler(LeaveRequest request) {
        if (request.getDays() <= 1) {
            System.out.println("组长批准:" + JSON.toJSONString(request));
        } else {
            if (nextBoss != null) {
                this.nextBoss.handler(request);
            } else {
                System.out.println("末端处理");
            }
        }
    }
}
