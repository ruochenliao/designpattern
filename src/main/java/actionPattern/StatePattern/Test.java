package actionPattern.StatePattern;

/**
 * 状态机模式 state pattern
 *
 * 应用
 * 适用于状态变化产生的模式，比如 bean 的生命周期, 房间预订状态等
 * 适用于代码中包含大量于对象状态有关的条件语句
 *
 * 优点
 * 封装了转换规则，状态模式替代了 if else 状态的判断
 *
 * 缺点
 * 状态模式对开闭原则支持不是很好
 *
 */
public class Test {
    public static void main(String[] args) {
        Room[] rooms = new Room[]{new Room(), new Room()};
        //第一个房间
        rooms[0].bookRoom();
        rooms[0].showRoomState();

        rooms[0].checkInRoom();
        rooms[0].showRoomState();

        rooms[0].checkInRoom();
        rooms[0].showRoomState();

        rooms[0].checkoutRoom();
        rooms[0].showRoomState();
    }
}
