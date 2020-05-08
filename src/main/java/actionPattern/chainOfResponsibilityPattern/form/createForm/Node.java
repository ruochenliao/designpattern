package actionPattern.chainOfResponsibilityPattern.form.createForm;

public interface Node {
    Boolean isFilter(ApplicationContext applicaitonContext);
    void process(ApplicationContext applicationContext);
}
