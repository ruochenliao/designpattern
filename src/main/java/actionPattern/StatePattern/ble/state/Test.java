package actionPattern.StatePattern.ble.state;

public class Test {
    public static void main(String[] args) {
        LabelDO labelDO = new LabelDO();
        labelDO.setState("unUsed");
        labelDO.setId("testId");

        LableService lableService = new LableService();
        lableService.connected(labelDO);
        lableService.bind(labelDO);
        lableService.unbind(labelDO);
        lableService.bind(labelDO);
    }
}
