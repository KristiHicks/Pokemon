/*File Name: Dice
	Author: Kristi Hicks
        KUID: 2795468
	Email Address: k443h544@ku.edu 
	Homework Assignment Number: Homework 4
	Description:  rolls the certain dice the players want.
	Last Changed: May 5th, 2015 */
import java.util.Random;
public class Dice {
	private int numSides; 
	private int roll;
	Random myRand = new Random();
	
	public Dice(int sides) {
		numSides = sides;
		numSides = myRand.nextInt(sides);
		}

	public int roll() {
		Random myRand = new Random();
		roll = myRand.nextInt(numSides) + 1; 
		return roll; }
	
}
