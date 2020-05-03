package StructurePattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是个容器
 * 这个容器为什么要继承 Game 类？
 * 因为这样可以对不管是整体还是部分进行一个完善的管理
 *
 */
public class GameWebsite extends Game{

    private List<Game> gameList;

    public GameWebsite(String name){
        super.setName(name);
        gameList = new ArrayList<Game>();
    }

    public void display() {
        for(Game game: gameList){
            game.display();
        }
    }

    public void add(Game game){
        gameList.add(game);
    }
    public void remove(int index){
        gameList.remove(index);
    }
}
