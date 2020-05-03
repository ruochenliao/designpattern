package actionPattern.mementoPattern;

import lombok.Data;

/**
 * 外界通过负责人 careTaker 能够直接获取存档状态
 */
@Data
public class CareTaker {
    Memento memento;
}
