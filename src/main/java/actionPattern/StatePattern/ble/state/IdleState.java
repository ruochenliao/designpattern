package actionPattern.StatePattern.ble.state;

/**
 * 游离状态：未绑定，在线
 */
public class IdleState implements State{

    @Override
    public String getState() {
        return "idle";
    }

    @Override
    public void lossConnection(LabelDO labelDO) {
        System.out.println("失去连接");
        labelDO.setState("unUsed");
    }

    @Override
    public void connected(LabelDO labelDO) {

    }

    @Override
    public void bind(LabelDO labelDO) {
        System.out.println("绑定成功");
        labelDO.setState("active");
    }

    @Override
    public void unbind(LabelDO labelDO) {

    }
}
