package actionPattern.visitorPattern;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 相当于 objectStructure
 */
@Data
public class BillBook {
    private List<ElementBill> billList = new ArrayList<ElementBill>();

    public void add(ElementBill elementBill){
        billList.add(elementBill);
    }
    public void show(Visitor visitor){
        for(ElementBill bill:billList){
            bill.accept(visitor);
        }
    }
}
