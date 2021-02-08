package com.factory;

public class VehicleFactory {
	public Vehicle getVehicleType(String vType) {
		if(vType==null)
			return null;
		else if(vType.equalsIgnoreCase("car"))
			return new Car();
		else if(vType.equalsIgnoreCase("bus"))
			return new Bus();
		else if(vType.equalsIgnoreCase("cycle"))
			return new Cycle();
	return null;
	}
}
