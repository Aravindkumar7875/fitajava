package com.ak.linkedlistdemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		//vector is very old method not commonly used as vehicles
		//following methods are in vectors
		Vector<String> vehicles = new Vector<String>();
		vehicles.add("bike");
		vehicles.add("car");
		vehicles.add("bus");
		vehicles.add("lorry");
		
		vehicles.addElement("van");
		System.out.println(vehicles);
		System.out.println(vehicles.firstElement());
		System.out.println(vehicles.lastElement());
		System.out.println(vehicles.remove(2));
		System.out.println(vehicles);
		System.out.println(vehicles.set(2, "train"));
		System.out.println(vehicles);


	}

}
