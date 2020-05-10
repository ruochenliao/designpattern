package actionPattern.observePattern.task.listener;

import com.alibaba.fastjson.JSON;

public class Event1ListenerImpl implements EventListener{
    @Override
    public String getMessageType() {
        return "event1";
    }

    @Override
    public void processEvent(MessageDO messageDO) {
        System.out.println("receive message event1 " + JSON.toJSONString(messageDO));
    }
}
