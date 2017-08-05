package mobsandweapon;

public class Bow extends Weapon{
	protected int damage=4;
	protected int accuracy=80;
	protected int criticalchance=20;
/**returns the weapon damage 
 * 
 * @return
 */
public int getdamage(){
	return this.damage;
}
/**returns the weapon accuracy 
 * 
 * @return
 */
public int getaccuracy(){
	return this.accuracy;
}
/**returns the weapon critical hit chance
 * 
 * @return
 */
public int getcritical(){
	return criticalchance;
}
}