package gitEclipse;

import java.util.Scanner;
import java.util.Random;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		
		int money;
		int dice1, dice2, dice3;
		int i = 1, roll = 0;
		
		System.out.println("How much money do you have?");
		money = Integer.parseInt(in.nextLine());
		
		while( money>0) {	
			i++;
		    dice1= rand.nextInt(10) + 1;
		    dice2= rand.nextInt(10) + 1;
		    dice3= rand.nextInt(10) + 1;
		     
		    System.out.println(dice1);
		    System.out.println(dice2);
		    System.out.println(dice3);
		    if (dice1==7||dice2==7||dice3==7) {
		    	System.out.println("You win!");
		    	money+=7;
		    }
		    else if(dice1==7 && dice2==7 && dice3==7) {
		    	System.out.println("Jackpot!!!");
		    	money+=777;
		    	System.out.println("Your treasure: "+money);
		    	break;
		    }
		    else {
		    	System.out.println("Lost some money...");
		    	money-=7;
		    }

		}
		if (money<0) {
			System.out.println("You lost it all.");
		}
	}
}
