package practice;

import generics.PropertyUtility;

public class demoPpt {
public static void main(String[] args) {
	PropertyUtility uti = new PropertyUtility();
	System.out.println(uti.readingDataFromPropertyFile("city"));
	System.out.println(uti.readingDataFromPropertyFile("name"));
	
}
}
