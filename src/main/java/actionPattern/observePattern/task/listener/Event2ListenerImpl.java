package actionPattern.observePattern.task.listener;

import com.alibaba.fastjson.JSON;

public class Event2ListenerImpl implements EventListener{

    @Override
    public String getMessageType() {
        return "event2";
    }

    @Override
    public void processEvent(MessageDO messageDO) {
        System.out.println("receive message event2" + JSON.toJSONString(messageDO));
    }
}
