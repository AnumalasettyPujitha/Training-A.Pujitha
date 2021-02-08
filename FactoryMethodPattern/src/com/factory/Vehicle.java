package com.factory;

public abstract class Vehicle {
	protected int speed;
	abstract void getSpeed();
	public void getDistance(int time) {
		System.out.println(speed*time);
	}
}
