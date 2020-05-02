package actionPattern.strategyPattern;

/**
 * strategy pattern 策略模式
 *
 * 定义
 * 定义一系列算法，将每个算法都封装起来，并让他们可以互相替换。
 *
 * 和状态模式的不同
 * 策略类是为对象提供策略，状态是为了状态改变而出现的
 * 状态类都是为解决 if else if else if else 这种结构而生的
 *
 * 优点
 * 提供了完美的开闭原则的完美支持
 * 解决了 if else
 *
 * 缺点
 * 将造成很多小的策略，导致增加一个类就加一个策略类，类的数量超出预期
 */
public class Test {
    public static void main(String[] args) {
        DiscountRoom discountRoom = new DiscountRoom();
        discountRoom.setPrice(100);
        discountRoom.setCard(new VipCard());
        double discountPrice = discountRoom.getPrice();
        System.out.println(discountPrice);
    }


}
