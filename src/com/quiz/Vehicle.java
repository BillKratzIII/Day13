package com.quiz;

public class Vehicle {
	// declare variables
	boolean isRunning = false;

	// constructor
	public Vehicle(boolean isRunning) {
		this.isRunning = isRunning;
	}

	// method to set isRunning to true
	public void turnOn() {
		this.isRunning = true;
	}

	// method to set isRunning to false
	public void turnOff() {
		this.isRunning = false;
	}

	// method to return state of isRunning (is for true or is not for false
	public String isRunning() {
		if (isRunning) {
			return "is";
		} else {
			return "is not";
		}
	}

}
