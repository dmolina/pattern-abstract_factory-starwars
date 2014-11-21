package org.uca.dss.pattern.starwars;

import java.util.Scanner;

import org.uca.dss.pattern.starwars.army.Army;

public class Game {
	private String title;

	public Game(String title) {
		this.title = title;
	}
	public void run() {
		String option;
		int numShips;

		Scanner reader = new Scanner(System.in);

		System.out.println("Quieres ser del Imperio (I) o un Rebelde (R)?");

		do {
			option = reader.nextLine();
		} while (!option.equalsIgnoreCase("r") && !option.equalsIgnoreCase("i"));

		System.out.println("¿Cuántas naves?");

		do {
			numShips = reader.nextInt();
		} while (numShips <= 0);

		Army army = new Army(numShips, option);
		army.play();
	}
	public static void main(String[] args) {
		Game game = new Game("Star Wars");
		game.run();
	}
}
