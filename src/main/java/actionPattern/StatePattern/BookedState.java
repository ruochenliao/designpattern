package actionPattern.StatePattern;

public class BookedState implements State{

    Room room;

    public BookedState(Room room){
        this.room = room;
    }

    public void bookRoom() {
        System.out.println("不好意思，该房间已被预订");
    }

    public void cancelRoom() {
        System.out.println("成功取消预订");
        room.setState(room.getIdleRoomState());
    }

    public void checkInRoom() {
        System.out.println("成功入住");
        room.setState(room.getCheckInState());
    }

    public void checkoutRoom() {

    }
}
