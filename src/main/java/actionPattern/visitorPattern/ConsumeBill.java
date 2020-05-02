package actionPattern.visitorPattern;

public class ConsumeBill implements ElementBill {

    double amount;
    String item;

    public ConsumeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public void accept(Visitor visitor) {
        visitor.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
