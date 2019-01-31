package main.java.com.novadocks.service.impl;

import main.java.com.novadocks.model.Boat;
import main.java.com.novadocks.model.Dock;
import main.java.com.novadocks.service.DockService;
import main.java.com.novadocks.util.NovaDockUtils;

public class DockServiceImpl implements DockService {
	private Dock dock;

	public DockServiceImpl() {
		this.dock = new Dock("Liverpool Dock", 5);
		this.dock.getDockedBoats().addAll(NovaDockUtils.createBoatList());
	}

	@Override
	public boolean addBoat(Boat boat) {
		System.out.println(">>> Adding boat.");
		
		/*
		 * Developer Notes:
		 * - Find the current dock capacity and add a boat to the dock if it's not full
		 */

		return false;
	}

	@Override
	public Boat getBoat(String boatId) {
		System.out.println(">>> Getting boat.");
		
		/*
		 * Developer Notes:
		 * - Find a boat in the dock based on the Id passed through
		 */

		return null;
	}

	@Override
	public boolean removeBoat(String boatId) {
		System.out.println(">>> Deleting boat.");
		
		/*
		 * Developer Notes:
		 * - Find a boat in the dock based on the Id passed through
		 */

		return false;
	}

	@Override
	public boolean updateBoat(String boatId, Boat boat) {
		System.out.println(">>> Updating boat.");
		
		/*
		 * Developer Notes:
		 * - Find a boat in the dock and replace that boat's information with the information passed from the boat object
		 */

		return false;
	}

	@Override
	public void removeAllBoatsOverWeight(int weight) {
		System.out.println(">> Removing all boats over " + weight + "kg.");
		
		/*
		 * Developer Notes:
		 * - Find all of the boat's that are over a certain weight
		 * - Remove the boats that are over a certain weight.
		 */
		
	}

	@Override
	public Dock getDock() {
		return this.dock;
	}
}
