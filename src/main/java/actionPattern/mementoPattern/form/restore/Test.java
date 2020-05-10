package actionPattern.mementoPattern.form.restore;

public class Test {
    public static void main(String[] args) {
        FormService formService = new FormService();
        FormDO formDO = new FormDO();
        formDO.setAssetCode("TD293859348960345");
        formDO.setTaskCreated(false);

        CareTaker careTaker = new CareTaker();
        //保存状态
        FormDO memo = formService.createMemo(formDO);
        careTaker.setMemo(memo);
        //创建任务
        formService.createTask(formDO);
        //恢复状态
        formService.restoreMemo(careTaker.getMemo());
    }
}
