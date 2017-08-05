package mobsandweapon;


public  class Mobs {
	protected int maxhealth=15;
	protected int health=15;
	protected int defense =5;
	protected int attack = 5;
	/**Returns the Mob's defense
	 * 
	 * @return
	 */
	public int getdefense(){
		return defense;
	}
	/**Returns the Mob's health
	 * 
	 * @return
	 */
	public int gethealth(){
		return health;
	}
	/**Returns the Mob's attack
	 * 
	 * @return
	 */
	public int getattack(){
		return attack;
	}
	/**Changes the Mob's health when it takes damage or heals. 
	 * 
	 * @param adjust
	 */
	public void adjusthealth(int adjust){
		health += adjust;
		if(health>maxhealth){
			health=maxhealth;
		}
	}

}
