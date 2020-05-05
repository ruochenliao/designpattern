package createPattern.abstractFactory.formAndTask.create;

public class TencentFormFactory implements Factory {
    @Override
    public void createForm(Application application) {
        if ("receive".equals(application.getFormType())) {
            ReceiveForm receiveForm = new ReceiveForm();
            receiveForm.check(application);
            //腾讯不需要走审批
//            receiveForm.createAudit(application);
            receiveForm.createTask(application);
            receiveForm.saveForm(application);
        }
        if ("exchange".equals(application.getFormType())) {
            ExchangeForm exchangeForm = new ExchangeForm();
            exchangeForm.check(application);
            exchangeForm.createTask(application);
            exchangeForm.saveForm(application);
        }
    }

    @Override
    public void createTask(TaskDTO taskDTO) {
        if ("receive".equals(taskDTO.getTaskType())) {
            Task receiveTask = new ReceiveTask();
            receiveTask.check(taskDTO);
            receiveTask.saveTask(taskDTO);
            //腾讯不需要发送消息
//            receiveTask.sendMessage(taskDTO);
        }
        if ("return".equals(taskDTO.getTaskType())) {
            Task returnTask = new ReturnTask();
            returnTask.check(taskDTO);
            returnTask.saveTask(taskDTO);
            //腾讯不需要发送消息
//            returnTask.sendMessage(taskDTO);
        }
    }
}
