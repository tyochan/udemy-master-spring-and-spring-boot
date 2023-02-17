package com.in28minutes.learnspringframework.game;

public class GameRunner {
    GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game.getName());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
