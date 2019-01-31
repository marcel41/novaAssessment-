package main.java.com.novadocks.service;

import main.java.com.novadocks.model.Boat;
import main.java.com.novadocks.model.Dock;

public interface DockService {
	public boolean addBoat(Boat boat);

	public Boat getBoat(String boatId);

	public boolean removeBoat(String boatId);

	public boolean updateBoat(String boatId, Boat boat);

	public void removeAllBoatsOverWeight(int weight);

	public Dock getDock();
}
