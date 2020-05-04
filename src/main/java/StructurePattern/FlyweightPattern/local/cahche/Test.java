package StructurePattern.FlyweightPattern.local.cahche;

import java.util.Arrays;

/**
 * 本地缓存存储键值对
 * 获取缓存的时候需要拿到一个 UUID 作为获取这个缓存的唯一标识符
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("用户登录");
        String[] rightList = new String[]{"add", "delete", "read", "delete"};
        User user = UserFactory.getUser("1712323", Arrays.asList(rightList), new UnSharedUser());
        System.out.println("获取共享池中的工号:"+ user.getWorkNo() +" 权限:"+user.getRights());
        String bpmsLink1 = user.getBpmsLink("1209", "receive");
        System.out.println("获取非共享池中的审批链接1 :"+bpmsLink1);
        String bpmsLink2 = user.getBpmsLink("1289", "exchange");
        System.out.println("获取非共享池中的审批链接1 :"+bpmsLink2);
    }
}
