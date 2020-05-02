package actionPattern.visitorPattern;

/**
 * 需要具体查看眉笔收入/支出的细节
 */
public class FinancialVisitor implements Visitor {

    public void view(ConsumeBill consumeBill) {
        if ("工资".equals(consumeBill.getItem())) {
            System.out.println("查看到工资支出");
        } else {
            System.out.println("不是工资");
        }
    }

    public void view(IncomeBill incomeBill) {
        System.out.println("查看到工资收入");
    }
}
