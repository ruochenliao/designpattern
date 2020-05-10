package actionPattern.StatePattern.ble.state;

/**
 * 激活状态: 绑定在线
 */
public class ActiveState implements State{


    @Override
    public String getState() {
        return "active";
    }

    @Override
    public void lossConnection(LabelDO labelDO) {
        System.out.println("失去连接");
        labelDO.setState("lost");
    }

    @Override
    public void connected(LabelDO labelDO) {

    }

    @Override
    public void bind(LabelDO labelDO) {
        System.out.println("警告：请先解绑，再绑定");
    }

    @Override
    public void unbind(LabelDO labelDO) {
        System.out.println("解绑成功");
        labelDO.setState("idle");
    }
}
