package StructurePattern.combinationPattern;

import java.util.ArrayList;
import java.util.List;

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
