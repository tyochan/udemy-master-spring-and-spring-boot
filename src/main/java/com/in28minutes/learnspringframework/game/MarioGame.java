package com.in28minutes.learnspringframework.game;

public class MarioGame implements GameConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into a hole");
    }

    public void left() {
        System.out.println("Back");
    }

    public void right() {
        System.out.println("Accelerate");
    }

    @Override
    public String getName() {
        return "Mario";
    }
}
