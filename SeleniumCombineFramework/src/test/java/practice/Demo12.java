package practice;

import java.io.File;

import org.openqa.selenium.OutputType;

import generics.IAutoConstants;

public class Demo12 implements IAutoConstants {
public static void main(String[] args) {
	//File photo = ts.getScreenshotAs(OutputType.FILE);
	
	String path =DIRECTORY+" "+ SCREENSHOT + "abc" +""+TIME+ ".png";
	System.out.println(path);
}
}
