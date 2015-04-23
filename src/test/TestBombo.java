package test;
import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.Test;

import clases.Bombo;


public class TestBombo {

	@Test
	public void CanCreateBombo() {
		new Bombo();		
	}
	
	@Test
	public void whenCallGetNumber_returnNumberBetween1And90(){
		int number = new Bombo().getRandomNumber();
		
		assertTrue((1 <= number && number <= 90));
	}
	
	@Test
	public void BomboContainsAllNumbersBetween1And90(){
		Bombo bombo = new Bombo();
		boolean[] numbersBombo = new boolean[90];
		for (int i = 1 ; i <= 90 ; i++){
			numbersBombo[bombo.getRandomNumber()] = true;
		}
		
		boolean ok = true;
		for (int i = 0 ; i < numbersBombo.length ; i++){
			if (numbersBombo[i] == false){
				ok = false;
				break;
			}
		}
		
		assertTrue(ok);
		
	}
	

}
