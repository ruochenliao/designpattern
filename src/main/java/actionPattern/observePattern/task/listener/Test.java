package actionPattern.observePattern.task.listener;

public class Test {
    public static void main(String[] args) {
        EventConsumer eventConsumer = new EventConsumerImpl();
        MessageDO messageDO = new MessageDO();
        messageDO.setMessageId("1");
        messageDO.setMessageType("event1");
        messageDO.setMessageBody("hello world event1");

        EventListener eventListener1 = new Event1ListenerImpl();
        EventListener eventListener2 = new Event2ListenerImpl();

        eventConsumer.registerEvent(eventListener1);
        eventConsumer.registerEvent(eventListener2);
        eventConsumer.notifyListener(messageDO);
    }
}
