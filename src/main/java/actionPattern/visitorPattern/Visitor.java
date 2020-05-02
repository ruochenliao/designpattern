package actionPattern.visitorPattern;

public interface Visitor {

    void view(ConsumeBill consumeBill);

    void view(IncomeBill incomeBill);
}
