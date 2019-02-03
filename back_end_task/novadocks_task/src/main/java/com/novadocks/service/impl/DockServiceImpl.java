package main.java.com.novadocks.service.impl;

import main.java.com.novadocks.model.Boat;
import main.java.com.novadocks.model.Dock;
import main.java.com.novadocks.service.DockService;
import main.java.com.novadocks.util.NovaDockUtils;
//libraries will be necessary to get the boats
import java.util.ArrayList;
import java.util.List;
//this libraries will be usefull to get all the vaues from the List
import java.util.Collections;
import java.util.Iterator;

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
		 //complexity will be O(1);
		//we will check if the capacity of the boat is full
		int capacityOfDock = dock.getCapacity();
		if(capacityOfDock > 0)
		{
			//add the boat and set new capacity
			// we can either get the boatlist, add one to them
			//and set the dockedBoats to the new list or add a method
			//to NovaDocks that can take a boat and added to its boats
		  List<Boat> boatList = dock.getDockedBoats();
			boatList.add(boat);
		//I realize that there is a directly reference to dock boat list , therefore
		//I think that there no need to reupdate the dockedBoats
		//	dock.setDockedBoats(boatList);
			dock.setCapacity(capacityOfDock - 1);
			return true;
		}
		else
		{
			//print a message to the user saying that system has faied
			//because the the capacity is full
			System.out.println("The capacity of this dock is full");
		  return false;
		}
	}

	@Override
	public Boat getBoat(String boatId) {
		System.out.println(">>> Getting boat.");

		/*
		 * Developer Notes:
		 * - Find a boat in the dock based on the Id passed through
		 */
		 //we can extract all the boats and make an interator
		 //to check if one them matches the boat ID
		 //the complexity will be O(boatsInTheDock)
		 //to improve the complexity we can replace the structure that is containing
		 //the List, for example an AVL or hash table could be beneficial if we want
		 //to speed up the searching of a boat
     List<Boat> boatList = dock.getDockedBoats();
		 Iterator<Boat> itr = boatList.iterator();
		 Boat tempBoat;
		 while(itr.hasNext())
		 {
			 tempBoat = itr.next();
			 if(tempBoat.getBoatId().equals(boatId))
			   return tempBoat;
		 }
		 //if there is no match return a null referen
		 //and a message to the console
		 System.out.println("There is no boat with that boatId");
		 return null;
	}

	@Override
	public boolean removeBoat(String boatId) {
		System.out.println(">>> Deleting boat.");

		/*
		 * Developer Notes:
		 * - Find a boat in the dock based on the Id passed through
		 */
    //our method getBoat will be very usefull in this case
		//complexity will result in O(n), one way to speed up the removel will be to
		//another type of structure
		Boat boatToBeDelted = getBoat(boatId);
		if(boatToBeDelted != null)
		{
			//get the list of the boats and then delete it
			List<Boat> boatList = dock.getDockedBoats();
			boatList.remove(boatToBeDelted);
			//set the new boats and increase the space of the dock to one more
			//dock.setDockedBoats(boatList);
			dock.setCapacity(dock.getCapacity() + 1);
			return true;
		}
		System.out.println("There were some problems deleting the boat");
		return false;
	}

	@Override
	public boolean updateBoat(String boatId, Boat boat) {
		System.out.println(">>> Updating boat.");

		/*
		 * Developer Notes:
		 * - Find a boat in the dock and replace that boat's information with the information passed from the boat object
		 */
		 //we can use getBoat to the reference to the and change the parameters of
		 //this boat with the other
		 //the complexity will be O(n) since we are using of getBoat
		 Boat boatToUpdate = getBoat(boatId);
		 if(boatToUpdate != null)
		 {
			 boatToUpdate.setBoatId(boat.getBoatId());
			 boatToUpdate.setWeightKg(boat.getWeightKg());
			 return true;
		 }
		System.out.print("it is not possible to update that boat");
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
		 //one approach could be to go through the all the boats and deleted the boat
		 //when there is a boat that has more than weight
		 //we could reuse code getBoat to implement this method
		 List<Boat> boatList = dock.getDockedBoats();
		 Iterator<Boat> itr = boatList.iterator();
		 Boat tempBoat;
		 while(itr.hasNext())
		 {
			 tempBoat = itr.next();
			 if(tempBoat.getWeightKg() > weight)
				 itr.remove();
	 	 }

	}

	@Override
	public Dock getDock() {
		return this.dock;
	}
}
