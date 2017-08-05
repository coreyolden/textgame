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
/**ups the weapon's stat when the upgrade is purchased in the store. 
 * 
 * @param toup
 */
public void updamage(int toup){
	damage+=toup;
}
/**ups the weapon's stat when the upgrade is purchased in the store. 
 * 
 * @param toup
 */
public void upaccuracy(int toup){
	accuracy+=toup;
}
/**ups the weapon's stat when the upgrade is purchased in the store. 
 * 
 * @param toup
 */
public void upcrit(int toup){
	criticalchance+=toup;
}
}