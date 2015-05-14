package test;
import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Before;
import org.junit.Test;

import clases.Bombo;


public class TestBombo {
	
	Bombo bombo;

	@Before
	public void setUp(){
		bombo = new Bombo();
	}

	
	@Test
	public void BomboContainsAllNumbersBetween1And90(){

		for (int i = 1 ; i <= 90 ; i++){
			
			assertTrue(bombo.getHypeNumbers().contains(i));
		}
				
	}
	
	@Test
	public void whenCallGetNumber_returnNumberBetween1And90(){
		int number = bombo.getHypeNumber();
		assertTrue((1 <= number && number <= 90));
	}
	

}
