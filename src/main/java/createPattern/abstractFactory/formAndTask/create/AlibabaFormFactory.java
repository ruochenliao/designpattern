package createPattern.abstractFactory.formAndTask.create;

public class AlibabaFormFactory implements Factory {
    @Override
    public void createForm(Application application) {
        if ("receive".equals(application.getFormType())) {
            ReceiveForm receiveForm = new ReceiveForm();
            receiveForm.check(application);
            receiveForm.createAudit(application);
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
            receiveTask.sendMessage(taskDTO);
        }
        if ("return".equals(taskDTO.getTaskType())) {
            Task returnTask = new ReturnTask();
            returnTask.check(taskDTO);
            returnTask.saveTask(taskDTO);
            returnTask.sendMessage(taskDTO);
        }
    }
}
