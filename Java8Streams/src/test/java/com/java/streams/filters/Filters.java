package com.java.streams.filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Filters {
	
	List<Integer> ls = Arrays.asList(3,50,27,68,20,89);
	List<String> name = Arrays.asList("John","Samuels","Daniel","Alexzender","NieDavies","DavidAnderson");
	List<String> words = Arrays.asList("printer",null,"pages","table",null,"chair","laptop");
	
	@Test
	public void findEvenNumberAndPrint() {
		ls.stream().filter(num->num%2==0).forEach(x->System.out.print(x + " "));
		System.out.println("\n"+ "-------------------------");
	}
	
	@Test
	public void findEvenNumberAndRetrunList() {
		List<Integer> evenNoList;
		evenNoList = ls.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(evenNoList);
	}
	
	@Test
	public void findLongNamesRetrunList() {
		List<String> longNameList;
		longNameList = name.stream().filter(x->x.length()>=6 && x.length()<10).collect(Collectors.toList());
		System.out.println(longNameList);
	}
	
	@Test
	public void findWordsWhichAreNotNull() {
		List<String> myWords;
		myWords = words.stream().filter(x-> x!=null).collect(Collectors.toList());
		System.out.println(myWords);
	}
	
}
