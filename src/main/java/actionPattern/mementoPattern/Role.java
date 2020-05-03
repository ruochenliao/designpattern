package actionPattern.mementoPattern;

import lombok.Data;

/**
 * Original
 */
@Data
public class Role {
    /**
     * 血量
     */
    private int blood;
    /**
     * 蓝量
     */
    private int magic;

    public Role(int blood, int magic){
        this.blood = blood;
        this.magic = magic;
    }

    public void display(){
        System.out.println("当前状态");
        System.out.println("血量:" + blood +" 蓝量:"+magic);
    }

    public void restoreStatus(Memento memento){
        this.blood = memento.getBlood();
        this.magic = memento.getMagic();
    }

    public Memento createMemento(){
        return new Memento(this.blood, this.magic);
    }
}
