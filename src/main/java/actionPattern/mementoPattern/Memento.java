package actionPattern.mementoPattern;

import lombok.Data;

@Data
public class Memento {
    /**
     * 血量
     */
    private int blood;
    /**
     * 蓝量
     */
    private int magic;

    public Memento(int blood, int magic){
        this.blood = blood;
        this.magic = magic;
    }
}
