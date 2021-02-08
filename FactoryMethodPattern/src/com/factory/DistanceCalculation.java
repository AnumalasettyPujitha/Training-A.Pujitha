package com.factory;

import java.util.Scanner;

public class DistanceCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		VehicleFactory vf=new VehicleFactory();
		System.out.println("enter vehicle type:");
		String vType=sc.next();
		System.out.println("enter time to reach destination");
		int time=sc.nextInt();
		Vehicle v=vf.getVehicleType(vType);
		System.out.println("Distance travelled by the "+vType+" in "+time+" min is: ");
		v.getSpeed();
		v.getDistance(time);
	}

}
