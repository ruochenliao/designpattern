package actionPattern.chainOfResponsibilityPattern;

import lombok.Data;

@Data
public abstract class AbstractBoss {
    /**
     * 职位名称
     */
    String name;
    /**
     * 下一个节点
     */
    AbstractBoss nextBoss;

    public AbstractBoss(String bossName){
        this.name = bossName;
    }
    public abstract void handler(LeaveRequest leaveRequest);
}
