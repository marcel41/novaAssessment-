package main.java.com.novadocks.model;

public class Boat {
	private String boatId;
	private int weightKg;

	public Boat(String boatId, int weightKg) {
		this.boatId = boatId;
		this.weightKg = weightKg;
	}

	public String getBoatId() {
		return boatId;
	}

	public void setBoatId(String boatId) {
		this.boatId = boatId;
	}

	public int getWeightKg() {
		return weightKg;
	}

	public void setWeightKg(int weightKg) {
		this.weightKg = weightKg;
	}

	@Override
	public String toString() {
		return "Boat [boatId=" + boatId + ", weightKg=" + weightKg + "]";
	}
}
