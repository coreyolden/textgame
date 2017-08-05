package mobsandweapon;


public class Player extends Mobs{

	private String name;
	private int level =1;
	public int exp = 0;
	// I plan on adding an inventory system but for right now this will do
	private int numofpotions = 3;
	private int goldcoins = 50;
	Weapon wep;
	/**This equips the player's weapon. 
	 * 
	 * @param weapon
	 */
	public void SetWeapon(Weapon weapon){
		wep = weapon;
	}
	/**returns player weapon when called. 
	 * 
	 * @return
	 */
	public Weapon getweapon(){
		return wep;
	}
	
	/**This is only called at the beginning of the game when the player name is asked. 
	 * 
	 * @param input
	 */
	public void SetName(String input){
		name = input;
	}
	/**This adds the experience points after each battle and levels the player up if it reaches their level*100 
	 * 
	 * @param exptoadd
	 */
	public void AddExp(int exptoadd){
		exp+=exptoadd;
		//This is a very basic way and I'll probably fix it at some point so its not just multiples of 100 exp
		if(exp/100==level){
			level++;
			maxhealth+=10;
			attack+=2;
			defense+=2;
			health=maxhealth;
			System.out.println("Congradulations! you leveled up\nYou gained 10 Max Health, 2 Attack, and 2 Defense\nYour new stats are Max Health:"
					+maxhealth +" Attack:"+ attack + " Defense:"+defense);
		}
	}
	/**returns the players level when called. 
	 * 
	 * @return
	 */
	public int getlevel(){
		return level;
	}	
	/**Returns the number of potions the player has in their inventory. 
	 * 
	 * @return
	 */
	public int getpotions(){
		return numofpotions;
	}
	/**Changes the number of potions the player has based on the int change which is negative if they use one and positive if they buy one. 
	 * if the player uses a potion it gives them 10 health. 
	 * @param change
	 */
	public void setpotions(int change){
		numofpotions+=change;
		if(change<1){
			adjusthealth(10);
			if(health>maxhealth){
				health=maxhealth;
			}
		}
	}
	/**Changes the number of gold coins the player has based on the int change which is negative if they spend coins and positive if they find some.
	 * @param change
	 */
	public void setgold(int change){
		goldcoins+=change;
		
	}
	/**Returns the number of gold coins the player has.
	 * 
	 * @return
	 */
	public int getcoins(){
		return goldcoins;
	}
	
	
}
