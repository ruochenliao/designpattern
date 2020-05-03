package actionPattern.mementoPattern;

/**
 * 备忘录模式 mementoPattern
 *
 * 应用
 * 用于记录存档，之后可以拿出来使用, 回滚等
 *
 * 定义
 * 在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以将对象恢复到之前的状态
 *
 * 使用
 * 触发存单和取档
 *
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        Role role = new Role(100, 100);
        System.out.println("============ 终于来到第三关，我要存档 ============");
        role.display();

        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(role.createMemento());
        System.out.println("================== 继续闯关，快没血了 ===================");
        role.setBlood(10);
        role.setMagic(0);
        role.display();
        System.out.println("================== 恢复存档, 重新再来一遍 ===================");
        role.restoreStatus(careTaker.getMemento());
        role.display();
    }
}
