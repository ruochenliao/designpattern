package actionPattern.strategyPattern.form.service;

import com.alibaba.fastjson.JSON;

public class ReturnFormService implements FormService{
    @Override
    public String getFormType() {
        return "RETURN";
    }

    @Override
    public void submitForm(FormDO formDO) {
        System.out.println("提交归还申请单" + JSON.toJSONString(formDO));
    }

    @Override
    public void cancelForm(FormDO formDO) {
        System.out.println("撤销归还申请单" + JSON.toJSONString(formDO));
    }

    @Override
    public void finishForm(FormDO formDO) {
        System.out.println("完成归还申请单" + JSON.toJSONString(formDO));
    }
}
