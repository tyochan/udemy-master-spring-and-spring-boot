package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacManGame;

public class App01GamingBasic {

	public static void main(String[] args) {
		var pacManGame = new PacManGame(); // 1: Object creation
		var gameRunner = new GameRunner(pacManGame); // 2: Dependency wiring, tightly coupled
		gameRunner.run();
	}

}
