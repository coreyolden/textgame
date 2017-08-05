package mobsandweapon;

public class Mace extends Weapon {
	protected int damage=10;
	protected int accuracy=65;
	protected int criticalchance=6;
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