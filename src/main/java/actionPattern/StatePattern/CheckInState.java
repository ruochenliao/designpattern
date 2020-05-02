package actionPattern.StatePattern;

public class CheckInState implements State{
    Room room;

    public CheckInState(Room room){
        this.room = room;
    }

    public void bookRoom() {
        System.out.println("不好意思，该房间已经有人入住了");
    }

    public void cancelRoom() {

    }

    public void checkInRoom() {

    }

    public void checkoutRoom() {
        System.out.println("退房成功");
        room.setState(room.getIdleRoomState());
    }
}
