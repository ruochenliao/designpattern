package actionPattern.mementoPattern.form.restore;

import com.alibaba.fastjson.JSON;

public class FormService {

    void createTask(FormDO formDO){
        System.out.println("事务开启");
        formDO.setTaskCreated(true);
        System.out.println("保存 form 表 " + JSON.toJSONString(formDO));
        System.out.println("发送保存消息");
        System.out.println("事务结束");
    }

    void restoreMemo(FormDO formDO){
        System.out.println("回复 form 表" + JSON.toJSONString(formDO));
    }

    FormDO createMemo(FormDO formDO){
        FormDO memo = new FormDO();
        memo.setAssetCode(formDO.getAssetCode());
        memo.setTaskCreated(formDO.getTaskCreated());
        return memo;
    }
}
