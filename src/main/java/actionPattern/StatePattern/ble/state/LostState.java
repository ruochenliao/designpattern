package actionPattern.StatePattern.ble.state;

/**
 * 失联：绑定不在线
 */
public class LostState implements State{
    @Override
    public String getState() {
        return "lost";
    }

    @Override
    public void lossConnection(LabelDO labelDO) {

    }

    @Override
    public void connected(LabelDO labelDO) {
        System.out.println("重连成功");
        labelDO.setState("active");
    }

    @Override
    public void bind(LabelDO labelDO) {

    }

    @Override
    public void unbind(LabelDO labelDO) {
        System.out.println("报废成功");
        labelDO.setState("unUsed");
    }
}
