package actionPattern.visitorPattern;

/**
 * 需要查看收入和支出的总和
 */
public class BossVisitor implements Visitor {

    private int totalIncome;
    private int totalConsume;

    public int getTotalIncome() {
        return totalIncome;
    }

    public int getTotalConsume() {
        return totalConsume;
    }


    /**
     * 查看支出
     * @param consumeBill
     */
    public void view(ConsumeBill consumeBill) {
        totalConsume += consumeBill.getAmount();
    }

    /**
     * 查看收入
     * @param incomeBill
     */
    public void view(IncomeBill incomeBill) {
        totalIncome += incomeBill.getAmount();
    }
}
