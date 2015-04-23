package clases;

import java.util.ArrayList;

public class Bombo {
	
	ArrayList usedNumbers = new ArrayList();

	public int getRandomNumber() {
		
		int number = (int) Math.round(Math.random()*90);
		
		if (!usedNumbers.contains(number)){
			usedNumbers.add(number);
			return number;
		}
		
		return getRandomNumber();
		
	}

}
