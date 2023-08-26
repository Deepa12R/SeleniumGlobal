package practice;

import generics.JavaUtility;

public class demoRandomJava {
public static void main(String[] args) {
	JavaUtility ju = new JavaUtility();
	for(int i=20; i<=60; i++) {
	System.out.println(ju.generatingRandomNumber(i));
}
}
}