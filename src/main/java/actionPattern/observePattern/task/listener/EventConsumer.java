package actionPattern.observePattern.task.listener;

/**
 * 相当于 subject
 */
public interface EventConsumer {
    /**
     * 注册事件
     */
    void registerEvent(EventListener eventListener);

    /**
     * 移除事件
     */
    void removeEvent(EventListener eventListener);

    /**
     * 通知事件方
     */
    void notifyListener(MessageDO messageDO);
}
