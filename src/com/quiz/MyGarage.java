package com.quiz;

public class MyGarage {

	public static void main(String[] args) {
		// create new car object myCar
		Car myCar = new Car(false, 4, "Silver", true, 4, 113);
		// method call to turn on car myCar
		myCar.turnOn();
		// method call to paint myCar black
		myCar.paintCar("Black");
		// print out all current states of myCar
		System.out.println(myCar.toString());

	}

}
