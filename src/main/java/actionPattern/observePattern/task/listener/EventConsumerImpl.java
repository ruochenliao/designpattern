package actionPattern.observePattern.task.listener;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EventConsumerImpl implements EventConsumer{
    List<EventListener> listenerList;

    @Override
    public void registerEvent(EventListener eventListener) {
        if(listenerList == null){
            listenerList = new ArrayList<>();
        }
        listenerList.add(eventListener);
    }

    @Override
    public void removeEvent(EventListener eventListener) {
        listenerList.remove(eventListener);
    }

    @Override
    public void notifyListener(MessageDO messageDO) {
        for(EventListener eventListener:listenerList){
            if(StringUtils.equalsIgnoreCase(messageDO.getMessageType(), eventListener.getMessageType())){
                eventListener.processEvent(messageDO);
            }
        }
    }
}
