package actionPattern.chainOfResponsibilityPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 职责链设计模式
 *
 * 应用
 * OA 系统的开发，比如审批流
 *
 * 定义
 * 避免请求发送者和接收者耦合在一起，让多个对象都有可能接收到请求，将这些对象连成一条链，并沿着这条链传递请求，直到有对象处理它为止
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest();
        leaveRequest.setDays(2);
        leaveRequest.setName("小红");
        leaveRequest.setReason("生病");
        AbstractBoss leader = new Leader("组长张三");
        AbstractBoss manager = new Manager("经理李四");
        leader.setNextBoss(manager);
        leader.handler(leaveRequest);

        System.out.println("=============== 使用 list 来做职责链 ==============");
        List<AbstractBoss> auditList = new ArrayList<AbstractBoss>(2);
        auditList.add(leader);
        auditList.add(manager);
        for(AbstractBoss boss:auditList){
            boss.handler(leaveRequest);
        }
    }
}
