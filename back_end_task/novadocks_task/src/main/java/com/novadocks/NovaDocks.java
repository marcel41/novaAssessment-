package main.java.com.novadocks;

import main.java.com.novadocks.model.Boat;
import main.java.com.novadocks.service.DockService;
import main.java.com.novadocks.service.impl.DockServiceImpl;

public class NovaDocks {
	public static void main(String[] args) {
		new NovaDocks().run();
	}

	public void run() {
		System.out.println("Welcome to the NovaDocking system!");

		DockService service = new DockServiceImpl();

		System.out.println("-----------------------------------");
		// This should add a boat to the dock in DockServiceImpl.java
		service.addBoat(new Boat("NV 2323 KR", 230));

		if (service.getDock().getDockedBoats().size() == 4) {
			System.out.println("Test 1 - Adding a boat: Passed.");
		} else {
			System.out.println("Test 1 - Adding a boat: Failed.");
		}
		System.out.println("-----------------------------------\n");

		System.out.println("-----------------------------------");
		// This should remove the boat with the ID: NV 2345 KO
		service.removeBoat("NV 2345 KO");

		if (service.getDock().getDockedBoats().size() == 3) {
			System.out.println("Test 2 - Removing a boat: Passed.");
		} else {
			System.out.println("Test 2 - Removing a boat: Failed.");
		}
		System.out.println("-----------------------------------\n");

		System.out.println("-----------------------------------");
		// This should print the boat with the ID: NV 2323 KR
		Boat boat = service.getBoat("NV 2323 KR");

		if (boat != null) {
			System.out.println("Test 3 - Getting a boat: Passed.");
		} else {
			System.out.println("Test 3 - Getting a boat: Failed.");
		}
		System.out.println("-----------------------------------\n");

		System.out.println("-----------------------------------");
		// This should update the boat with the ID: NV 2323 KR
		service.updateBoat("NV 2323 KR", new Boat("IR 3402 PR", 500));

		if (service.getBoat("IR 3402 PR") != null) {
			System.out.println("Test 4 - Updating a boat: Passed.");
		} else {
			System.out.println("Test 4 - Updating a boat: Failed.");
		}

		System.out.println("-----------------------------------\n");

		System.out.println("-----------------------------------");
		service.removeAllBoatsOverWeight(1000);

		if (service.getDock().getDockedBoats().size() == 2) {
			System.out.println("Test 5 - Removing boats: Passed.");
		} else {
			System.out.println("Test 5 - Removing boats: Failed.");
		}

		System.out.println("-----------------------------------\n");

	}
}
