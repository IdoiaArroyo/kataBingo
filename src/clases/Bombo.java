package clases;

import java.util.ArrayList;
import java.util.Collections;

public class Bombo {
	
	ArrayList<Integer> hypeNumbers = new ArrayList();
	
	public  Bombo() {
		for (int i = 1; i < 91; i++){
			hypeNumbers.add(i);
		}
		Collections.shuffle(hypeNumbers);
	}
	
	public ArrayList<Integer> getHypeNumbers() {
		return hypeNumbers;
	}


	
	public int getHypeNumber(){
		int number = hypeNumbers.get(hypeNumbers.size()-1);
		hypeNumbers.remove(hypeNumbers.size()-1);
		return number;
		
	}
	
	

}
