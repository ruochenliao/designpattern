package actionPattern.InterpreterPattern.ruleEngine;

import lombok.Data;

@Data
public class ResultDTO<T> {
    Boolean success;
    T content;
}
