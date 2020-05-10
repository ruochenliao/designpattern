package actionPattern.StatePattern.ble.state;

/**
 * 未使用：未绑定不在线
 */
public class UnUsedState implements State{
    @Override
    public String getState() {
        return "unUsed";
    }

    @Override
    public void lossConnection(LabelDO labelDO) {


    }

    @Override
    public void connected(LabelDO labelDO) {
        System.out.println("连接成功");
        labelDO.setState("idle");
    }

    @Override
    public void bind(LabelDO labelDO) {
        System.out.println("绑定成功");
        labelDO.setState("lost");
    }

    @Override
    public void unbind(LabelDO labelDO) {
    }
}
