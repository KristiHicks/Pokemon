/*File Name: Pokemon
	Author: Kristi Hicks
        KUID: 2795468
	Email Address: k443h544@ku.edu 
	Homework Assignment Number: Homework 4
	Description:  determines attack, and declares the hp, attack level, defense level and the names of the pokemon
	Last Changed: May 5th, 2015 */
public class Pokemon {
	private int hp; // Pokemon's points for health
	private int atkLevel; // attack level
	private int defLevel; // defense level
	private String name; // Pokemon's name
	private static Dice d20 = new Dice(20); 
	private static Dice d6 = new Dice (6); 
	public static boolean died = false;
	public static int alive = 1;

	public Pokemon(){ //Initializes all numeric data to zero
		hp = 0;
		name = "";
		atkLevel = 0;
		defLevel = 0;
	}
	
	public static boolean attack(Pokemon opponent){ 
		int attackBonus = 0;
		int defenseBonus = 0;
		String name1 = Colosseum.pokemon1.getName();
		String name2 = Colosseum.pokemon2.getName();
		int a = 0;
		int b = 0;
		int c = 0;
		int damage = 0;
		attackBonus = d20.roll();
		defenseBonus = d20.roll();
		if (name1 == opponent.getName()){
			System.out.println(name2 + " is attacking " + opponent.getName());
			System.out.println(name2 + " rolls an attack bonus of " + attackBonus);
			System.out.println(opponent.getName() + " rolls a defense bonus of " + defenseBonus);
			
			if ((Colosseum.pokemon1.getAtk() + attackBonus) > (opponent.getDef() + defenseBonus)){
				a = Pokemon.d6.roll();
				b = Pokemon.d6.roll();
				c = Pokemon.d6.roll();
				damage = a + b + c;
				System.out.println("The attack hits dealing 3-D6 damage!");
				System.out.println("The rolls are " + a + ", " + b + ", and " + c + " totalling: " + damage + " damage!");
				opponent.setHP(opponent.getHP() - damage);
				
				if (opponent.getHP() > 0) {
					System.out.println(opponent.getName() + " has " + opponent.getHP() + " hit points left"); 
					}
				else {
					System.out.println(opponent.getName() + " has been defeated!");
					died = true;
					alive = 0; 
					} 
				}
			}
		else{
			System.out.println("The attack misses!"); 
			}
		System.out.println(name1 + " is attacking " + opponent.getName());
		System.out.println(name1 + " rolls an attack bonus of " + attackBonus);
		System.out.println(opponent.getName() + " rolls a defense bonus of " + defenseBonus); 
			
		if ((Colosseum.pokemon1.getAtk() + attackBonus) > (opponent.getDef() + defenseBonus)) {
			a = Pokemon.d6.roll();
			b = Pokemon.d6.roll();
			c = Pokemon.d6.roll();
			damage = a + b + c;
			System.out.println("The attack hits dealing 3-D6 damage!");
			System.out.println("The rolls are " + a + ", " + b + ", and " + c + " totalling: " + damage + "damage!");
			opponent.setHP(opponent.getHP() - damage);
			
			if (opponent.getHP() > 0) {
				System.out.println(opponent.getName() + " has " + opponent.getHP() + " hit points left");
				}
			else{
				System.out.println(opponent.getName() + " has been defeated!");
				died = true;
				alive = 0; 
				} 
		}
		else{
			System.out.println("The attack misses!"); 
		} 
	return died;
}
	
	public void setName(String n){
		name = n; 
	}
	
	public void setHP(int h) {
		hp = h; 
	}
	
	public void setAtk(int a){
		atkLevel = a; 
	}
	
	public void setDef(int d){
		defLevel = d; 
	}
	
	public String getName(){
		return(name);
	}
	
	public int getHP() {
		return(hp); 
	}
	
	public int getAtk() {
		return(atkLevel); 
	}
	
	public int getDef() {
		return(defLevel); 
	}
}
