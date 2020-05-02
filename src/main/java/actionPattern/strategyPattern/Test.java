package actionPattern.strategyPattern;

/**
 * strategy pattern 策略模式
 *
 * 定义
 * 定义一系列算法，将每个算法都封装起来，并让他们可以互相替换。
 *
 * 和状态模式的不同
 * 一家酒店运用状态模式，控制了酒店的状态，并且能够很好地管理。
 * 房间的价格运用策略模式，根据不同情况打折
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
