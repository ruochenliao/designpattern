package actionPattern.strategyPattern.form.service;

import com.alibaba.fastjson.JSON;

public class ReceiveFormService implements FormService{
    @Override
    public String getFormType() {
        return "RECEIVE";
    }

    @Override
    public void submitForm(FormDO formDO) {
        System.out.println("提交领用申请单" + JSON.toJSONString(formDO));
    }

    @Override
    public void cancelForm(FormDO formDO) {
        System.out.println("撤销领用申请单" + JSON.toJSONString(formDO));
    }

    @Override
    public void finishForm(FormDO formDO) {
        System.out.println("完成领用申请单" + JSON.toJSONString(formDO));
    }
}
