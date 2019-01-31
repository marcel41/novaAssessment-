package main.java.com.novadocks.model;

import java.util.ArrayList;
import java.util.List;

public class Dock {
	private String name;
	private List<Boat> dockedBoats;
	private int capacity;

	public Dock(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.dockedBoats = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Boat> getDockedBoats() {
		return dockedBoats;
	}

	public void setDockedBoats(List<Boat> dockedBoats) {
		this.dockedBoats = dockedBoats;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Dock [name=" + name + ", dockedBoats=" + dockedBoats + ", capacity=" + capacity + "]";
	}
}
