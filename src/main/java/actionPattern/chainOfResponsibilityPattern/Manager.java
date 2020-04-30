package actionPattern.chainOfResponsibilityPattern;

import com.alibaba.fastjson.JSON;

public class Manager extends AbstractBoss {
    public Manager(String bossName) {
        super(bossName);
    }

    public void handler(LeaveRequest request) {
        if (request.getDays() > 1) {
            System.out.println("经理处理" + JSON.toJSONString(request));
        } else {
            if (nextBoss != null) {
                nextBoss.handler(request);
            }
            else{
                System.out.println("末端处理");
            }
        }
    }
}
