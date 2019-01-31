package main.java.com.novadocks.util;

import java.util.ArrayList;
import java.util.List;

import main.java.com.novadocks.model.Boat;

public class NovaDockUtils {
	private NovaDockUtils() {
	}

	public static List<Boat> createBoatList() {
		List<Boat> boatList = new ArrayList<>();

		Boat firstBoat = new Boat("NV 1234 VN", 1000);
		Boat secondBoat = new Boat("NV 2345 KO", 1500);
		Boat thirdBoat = new Boat("NV 3053 NZ", 2000);

		boatList.add(firstBoat);
		boatList.add(secondBoat);
		boatList.add(thirdBoat);

		return boatList;
	}
}
