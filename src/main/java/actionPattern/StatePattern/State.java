package actionPattern.StatePattern;

public interface State {
    /**
     * 预订房价
     */
    void bookRoom();

    /**
     * 退订房间
     */
    void cancelRoom();

    /**
     * 入住房价
     */
    void checkInRoom();

    /**
     * 退房
     */
    void checkoutRoom();
}
