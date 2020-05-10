package actionPattern.StatePattern.ble.state;

public interface State {
    String getState();
    void lossConnection(LabelDO labelDO);
    void connected(LabelDO labelDO);
    void bind(LabelDO labelDO);
    void unbind(LabelDO labelDO);
}
