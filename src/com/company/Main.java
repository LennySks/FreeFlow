package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Circle[] circleArray = new Circle[]{new Circle(Color.RED, 2, 2)}; //Init die zeb array met wa circlekes

        Level level1 = new Level(circleArray, 5, 5);


        Game game = new Game();
        game.addLevel(level1);
        game.setCurrentLevel(level1);


        Circle circle = game.getCurrentLevel().getCircleArray()[0];
        game.placePipe(circle, 0, 0);


        game.displayGrid();
        game.getCurrentLevel().clearGrid();
        game.displayGrid();
        /*

            game.placePipe(x, y);
            game.resetPipes();



         */



    }

}
