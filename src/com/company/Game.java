package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Game {

    private Date huidigeSpeeltijd;
    private ArrayList<Level> levels;
    private Level currentLevel;

    public Game(){
        levels = new ArrayList<Level>();
    }

    public boolean placePipe(Circle circle, int x, int y){
        Pipe pipe = new Pipe(x, y, circle.getColor());
        return currentLevel.changeCellToPipe(pipe);
    }

    public Level getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Level currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void addLevel(Level level){
        levels.add(level);
    }


    public void displayGrid(){
        for (int y = 0; y < currentLevel.getGrid().size(); y++) {
            for (int x = 0; x < currentLevel.getGrid().get(y).size(); x++) {
                Cell cell = currentLevel.getGrid().get(y).get(x);
                if (cell instanceof Circle){
                    System.out.print("X");
                }
                else if (cell instanceof Pipe){
                    System.out.print("Y");
                }
                else{
                    System.out.print("O");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
