package StructurePattern.combinationPattern;

/**
 * 使用场景
 * 树形结构，比如常用来做目录
 *
 * 定义
 * 组合模式组合多个对象形成树形结构以表示"整体-部分"的结构层次
 *
 * 由也子节点(简单结构)组合成树(复杂结构)
 *
 * 叶子对象和组合对象实现相同的接口，这就是组合模式能将叶子节点和对象节点能够进行一致处理的原因
 *
 * 优点
 * 可以清晰地定义分层次的复杂对象
 * 不断递归下去，可以形成复杂树形结构
 */
public class test {
    public static void main(String[] args){
        GameWebsite gameStore = new GameWebsite("游戏网站");
        CS cs = new CS("CS");
        Dota dota = new Dota("DOTA");
        LOL lol = new LOL("LOL");

        //gameWebsite1 可以 add 叶子，也可以 add 部分
        GameWebsite gameWebsite1 = new GameWebsite("所有游戏");
        GameWebsite gameWebsite2  = new GameWebsite("角色扮演游戏");

        gameWebsite1.add(cs);
        gameWebsite2.add(dota);
        gameWebsite2.add(lol);
        gameWebsite1.add(gameWebsite2);

        System.out.println(gameWebsite1.name);
        gameWebsite1.display();
        System.out.println();


        System.out.println(gameWebsite2.name);
        gameWebsite2.display();
    }
}
