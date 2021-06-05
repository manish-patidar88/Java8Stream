package com.java.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class StreamsMap {
	
	List<String> vehicles = Arrays.asList("car","bus","train","truck","jeep","bike");
	@Test
	public void convertVehicleToUpperCase() {		
		List<String> vehicle  = vehicles.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehicle);
	}
	
	@Test
	public void findLengthOfEachVehicle() {		
		List<Integer> lenVehicle  = vehicles.stream().map(x->x.length()).collect(Collectors.toList());
		System.out.println("\n"+ lenVehicle);
	}

}
