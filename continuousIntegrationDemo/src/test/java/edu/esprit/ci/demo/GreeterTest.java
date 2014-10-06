package edu.esprit.ci.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GreeterTest {

	Greeter greeter;
	
	@Before
	public void setUp() throws Exception {
		
		greeter = new Greeter();
	}

	@Test
	public void test() {
		
		assertEquals("hello Ghassen", greeter.sayHello("Ghassen"));
	}
	
	@Test
	public void test1(){
		
		assertEquals("GoodBye Ghassen ", greeter.sayGoodBye("Ghassen"));
		
	}

}
