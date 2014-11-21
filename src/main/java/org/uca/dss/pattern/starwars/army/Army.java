package org.uca.dss.pattern.starwars.army;

import java.util.ArrayList;
import java.util.List;

import org.uca.dss.pattern.starwars.darkside.ImperiumGeneral;
import org.uca.dss.pattern.starwars.darkside.TieFighter;

public class Army {
	General general;
	List<Ship> ships;
	
	public Army(int numShips, String choice) {
		ships = new ArrayList<Ship>(numShips);
				
		for (int i = 0; i < numShips; i++) {
			// TODO: Change it to create the names and general in function of choice
			ships.add(new TieFighter());
		}
		// TODO: Make optional
		general = new ImperiumGeneral();
	}
	
	public void play() {
		if (general != null) {
			System.out.println("The " +general.getCategory() +" "
					+general.getName() +" command to win or die");
		}
		
		for (Ship ship : ships) {
			ship.fly();
			ship.shout();
		}
		
		
	}
}
