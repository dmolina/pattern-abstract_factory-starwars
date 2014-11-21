package org.uca.dss.pattern.starwars.rebels;

import org.uca.dss.pattern.starwars.army.Ship;

public class XWing implements Ship {

	public void fly() {
		System.out.println("X-Wing is flying!");
	}

	public void shout() {
		System.out.println("Zum, Zum");
	}

}
