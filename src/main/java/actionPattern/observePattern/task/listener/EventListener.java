package actionPattern.observePattern.task.listener;

public interface EventListener {
    String getMessageType();

    void processEvent(MessageDO messageDO);
}
