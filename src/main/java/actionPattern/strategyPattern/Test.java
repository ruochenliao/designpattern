package actionPattern.strategyPattern;

/**
 * strategy pattern 策略模式
 *
 * 定义
 * 定义一系列算法，将每个算法都封装起来，并让他们可以互相替换。
 *
 * 和状态模式的不同
 * 策略类是为对象提供策略，状态是为了状态改变而出现的
 *
 *
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
