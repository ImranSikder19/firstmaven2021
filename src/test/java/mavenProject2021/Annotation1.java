package mavenProject2021;

import org.testng.annotations.BeforeTest;

public class Annotation1 {
	@BeforeTest
	public void information() {
	int a = 10;
	int b = 4;
	int c = a*b;
	System.out.println(c);
	}
	@BeforeTest
	public void sum() {
	int a = 25;
	if(a%2==0) {
		System.out.println("even number");
	}else {
		System.out.println("odd number");
	}
	
	}	
	
	
	
}
