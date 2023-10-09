package gitEclipse;

import java.util.Scanner;
import java.util.Random;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Random rand = new Random();
		
		for(int i =0; i < 3; i++)
		{
		    int answer = rand.nextInt(10) + 1;
		    System.out.println(answer);
		    if (answer>=7) {
			System.out.println("You win!");
			}
		}
	
	}

}
