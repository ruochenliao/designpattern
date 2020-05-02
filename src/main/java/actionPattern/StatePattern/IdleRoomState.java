package actionPattern.StatePattern;

/**
 * 空闲房间状态
 */
public class IdleRoomState implements State{

    Room room;

    public IdleRoomState(Room room){
        this.room = room;
    }

    public void bookRoom() {
        System.out.println("预订成功");
        room.setState(room.getBookedState());
    }

    public void cancelRoom() {

    }

    public void checkInRoom() {
        System.out.println("成功入住");
        room.setState(room.getCheckInState());
    }

    public void checkoutRoom() {

    }
}
