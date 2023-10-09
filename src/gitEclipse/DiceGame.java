package gitEclipse;

import java.util.Scanner;
import java.util.Random;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		Random rand = new Random();
		
		int dice1, dice2, dice3;
		int i = 1, roll = 0;
		i++;
		
		    dice1= rand.nextInt(10) + 1;
		    dice2= rand.nextInt(10) + 1;
		    dice3= rand.nextInt(10) + 1;
		    
		   
		    
		    System.out.println(dice1);
		    System.out.println(dice2);
		    System.out.println(dice3);
		    if (dice1==7||dice2==7||dice3==7)
		    	System.out.println("You win!");
		    
			
	}
}
