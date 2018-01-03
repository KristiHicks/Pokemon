/*File Name: Colosseum
	Author: Kristi Hicks
        KUID: 2795468
	Email Address: k443h544@ku.edu 
	Homework Assignment Number: Homework 4
	Description:  Creates two pokemon and a dice to roll and interacts with the user to build their pokemon and then responds with the fight.
	Last Changed: May 5th, 2015 */
import java.util.Scanner;
public class Colosseum {
	static Pokemon pokemon1 = new Pokemon();
	static Pokemon pokemon2 = new Pokemon();
	public static void main(String[] args) {
		int round = 0;
		Dice d2 = new Dice(2);
		String place = null;
		System.out.println("Player 1, build your Pokemon!");
		System.out.println("=====================");
		userBuild(pokemon1); //builds pokemon
		System.out.println("Player 2, build your Pokemon!");
		System.out.println("=====================");
		userBuild(pokemon2); //builds other pokemon
		System.out.println("Player 1 will roll a D2, to decide who goes first.");
		int roll = d2.roll();
		if (roll == 1){ //determines who goes first or second
			place = "first";
		}
		else{
			place = "second"; 
		}
		System.out.println("Player 1 rolls a " + roll + " and will go " + place);
		while (round < 10){
			if (Pokemon.alive == 1){
				round ++;
				System.out.println();
				System.out.println("Round " + round + "!");
				System.out.println();
				Pokemon.attack(pokemon1);
				System.out.println(); 
			}
			if (Pokemon.alive == 1){
				Pokemon.attack(pokemon2);
				System.out.println(); 
			}
		System.out.println();
		}
	}
	public static void userBuild(Pokemon p){ // Asks the user about their pokemon to declare values
		Scanner input = new Scanner(System.in);
		System.out.println("Please name your pokemon: ");
		String name = input.next();
		p.setName(name);
		System.out.println("How many hit points will it have? (1-50)");
		int hp = input.nextInt();
		
		while (hp < 1 || hp > 50){
			System.out.println("Hit points must be between 1 and 50. Please enter a new number: ");
			hp = input.nextInt(); 
			}
		p.setHP(hp);
		System.out.println("Split fifty points between attack level and defense level.");
		System.out.println("Enter your attack level (1-49): ");
		int attacklevel = input.nextInt();
			
		while (attacklevel < 1 || attacklevel > 49){
			System.out.println("Sorry. The attack level msut be between 1 and 49: ");
			attacklevel = input.nextInt(); 
			}
		p.setAtk(attacklevel);
		System.out.println("Enter your defense level (1-30): ");
		int defenselevel = input.nextInt();
			
		while (defenselevel < 1 || defenselevel > (50 - attacklevel)){
			System.out.println("Sorry. The defense level must be between 1 and " + (50 - attacklevel) + ":");
			defenselevel = input.nextInt(); 
			}
		p.setDef(defenselevel); 
	}
}
