package StructurePattern.FlyweightPattern.login.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserFactory {
    public static Map<String, User> map = new HashMap<>();

    public static User getUser(String workNo, List<String> rights, User user){
        if(map.containsKey(workNo)){
            return map.get(workNo);
        }
        User sharedUser = new SharedUser(workNo, rights, user);
        map.put(workNo, sharedUser);
        return sharedUser;
    }
}
