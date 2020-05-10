package actionPattern.StatePattern.ble.state;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LableService {

    private static Map<String, State> stateMap;

    public LableService(){
        stateMap = new ConcurrentHashMap<>(4);
        /**
         * Spring 可以通过 @PostConstruct 来注入 stateMap
         * Map<String, State> stateMap = applicationContext.getBeansOfType(State.class);
         * stateMap.values().forEach(it->it.put(it.getState(), it));
         */
        ActiveState activeState = new ActiveState();
        IdleState idleState = new IdleState();
        LostState lostState = new LostState();
        UnUsedState unUsedState = new UnUsedState();

        stateMap.put(activeState.getState(), activeState);
        stateMap.put(idleState.getState(), new IdleState());
        stateMap.put(lostState.getState(), new LostState());
        stateMap.put(unUsedState.getState(), new UnUsedState());
    }

    void lossConnection(LabelDO labelDO){
        State state = stateMap.get(labelDO.getState());
        state.lossConnection(labelDO);
    }
    void connected(LabelDO labelDO){
        State state = stateMap.get(labelDO.getState());
        state.connected(labelDO);
    }
    void bind(LabelDO labelDO){
        State state = stateMap.get(labelDO.getState());
        state.bind(labelDO);
    }
    void unbind(LabelDO labelDO){
        State state = stateMap.get(labelDO.getState());
        state.unbind(labelDO);
    }
}
