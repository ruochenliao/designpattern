package actionPattern.visitorPattern;

/**
 *
 * visitor pattern 访问者模式
 *
 * 应用
 * 不同角色使用一个对象的功能不同时，而这个对象比较稳定，使用访问者模式
 *
 * 定义
 * 访问者对某个对象的各个元素操作，在不改变各个元素的前提下，定义作用于这些元素的新操作
 *
 * 优点
 * 将对象访问行为集中到一个访问者对象中，而不是分散到一个个元素类里
 *
 * 缺点
 * 增加新的元素很困难
 * 破快封装，不满足开闭原则
 * 因为 visitor 里需要对每个元素进行处理，所以 visitor 里的方法个数直接与元素的具体个数相关
 * 比较难理解
 */
public class Test {
    public static void main(String[] args) {
        BillBook billBook = new BillBook();
        billBook.add(new ConsumeBill(1000.0, "工资"));
        billBook.add(new ConsumeBill(2000.0, "买材料"));
        billBook.add(new IncomeBill(10000.0, "卖商品"));
        billBook.add(new IncomeBill(20000.0, "卖广告位"));

        BossVisitor bossVisitor = new BossVisitor();

        billBook.show(bossVisitor);
        int totalConsume = bossVisitor.getTotalConsume();
        int totalIncome = bossVisitor.getTotalIncome();
        System.out.println("=========  BOSS 看到的支出/收入  ==========");
        System.out.println("总消费 totalConsume:"+totalConsume + " 总收入 totalIncome:"+ totalIncome);

        FinancialVisitor financialVisitor = new FinancialVisitor();
        System.out.println();
        System.out.println("=========  财务 看到的支出/收入  ==========");
        billBook.show(financialVisitor);
     }
}
