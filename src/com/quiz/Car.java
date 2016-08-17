package com.quiz;

public class Car extends Vehicle {
	// declare variables
	int numWheels = 0;
	String color = null;
	boolean isFueled = false;
	int numDoors = 0;
	int maxSpeed = 0;

	// constructor
	public Car(boolean isRunning, int numWheels, String color, boolean isFueled, int numDoors, int maxSpeed) {
		super(isRunning);
		this.numWheels = numWheels;
		this.color = color;
		this.isFueled = isFueled;
		this.numDoors = numDoors;
		this.maxSpeed = maxSpeed;
	}

	// method to change the color of the car to a new color
	public void paintCar(String newColor) {
		this.color = newColor;
	}

	// method to change isFueled to true;
	public void fuelCar() {
		this.isFueled = true;
	}

	// method to return number of wheels Car has
	public int getNumWheels() {
		return numWheels;
	}

	// method to change the number of wheels Car has
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	// method to return the color of Car
	public String getColor() {
		return color;
	}

	// method to change the color of Car
	public void setColor(String color) {
		this.color = color;
	}

	//// method to return is for true and is not for false of isFueled
	public String isFueled() {
		if (isFueled) {
			return "is";
		} else {
			return "is not";
		}
	}

	// method to set state of isFueled to true or false
	public void setFueled(boolean isFueled) {
		this.isFueled = isFueled;
	}

	// method to return number of doors for Car
	public int getNumDoors() {
		return numDoors;
	}

	// method to change number of doors for Car
	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}

	// method to return the max speed of Car
	public int getMaxSpeed() {
		return maxSpeed;
	}

	// method to change the max speed of Car
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	// method to print out the current status of all Car's states
	@Override
	public String toString() {
		return "Current state of car: \n" + numWheels + " wheels\nColor is " + color + "\nCar " + this.isFueled()
				+ " fueled \n" + numDoors + " doors\nMaximum Speed is " + maxSpeed + "mph\nCar " + this.isRunning()
				+ " running";
	}

}
