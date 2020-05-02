package actionPattern.StatePattern;


import lombok.Data;

/**
 * 相当于context, 需要把状态类一一关联进来，并且进行初始化，还要提供 get/set 方法
 * 还需要提供属性的 set 方法给具体的状态类使用
 *
 * 这个类的目的
 * 状态类的执行
 */
@Data
public class Room{

    State state;
    State bookedState;
    State checkInState;
    State idleRoomState;

    /**
     * 对房间类和状态类绑定，并且初始化房间状态
     */
    public Room() {
        this.state = new IdleRoomState(this);
        this.bookedState = new BookedState(this);
        this.checkInState = new CheckInState(this);
        this.idleRoomState = new IdleRoomState(this);
    }

    void setState(State state){
        this.state = state;
    }

    /**
     * 预订房价
     */
    public void bookRoom() {
        state.bookRoom();
    }

    /**
     * 退订
     */
    public void cancelRoom() {
        state.cancelRoom();
    }

    /**
     * 入住
     */
    public void checkInRoom() {
        state.checkInRoom();
    }

    /**
     * 退房
     */
    public void checkoutRoom() {
        state.checkoutRoom();
    }

    public void showRoomState(){
        System.out.println("房间状态：" + this.getState().getClass().getSimpleName());
    }
}
