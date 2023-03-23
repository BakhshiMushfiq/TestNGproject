package TestNG;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
//method: specific code block to modify a task
	@AfterTest
	public void display() {
		System.out.println("Here I am doing the testNG output into consloling");

	}

	@Test
	public void display2() {
		System.out.println("Here i am displaing text");
	}

	@Test
	public void dispay3() {
		for (int i = 0; i <= 4; i++) {
			System.out.println(i + " ");

		}
	}
	@Test
	public void display4() {
		for (char c ='a';c<='z'; c++) {
			System.out.print(c+" ");
		}
	}
		@BeforeTest
		public void display5() {
			System.out.println("it is after class display");
		
		}
	}

