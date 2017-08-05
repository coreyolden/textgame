package combat;
import java.util.Random;

import mobsandweapon.Enemies;
import mobsandweapon.Player;
import mobsandweapon.Weapon;

// player attack, defense, accuracy, weapon damage
// Enemy attack, defense
public class DamageCalculator {
 
 Weapon weapon;
	public int playerattack(Player player, Enemies enemy){
		weapon = player.getweapon();
		Random rn = new Random();
		int chancetohit = rn.nextInt(100);
		System.out.println(weapon.getaccuracy());
		System.out.println(chancetohit);
		if(chancetohit<=weapon.getaccuracy()){
			int critchance = rn.nextInt(100);
			if(critchance<=weapon.getcritical()){
				System.out.println("Critical hit!!");
				return (player.getattack()+weapon.getdamage())*2- enemy.getdefense();
			}
			else{
				
				return player.getattack() + weapon.getdamage() -enemy.getdefense();
				}
		}
		return 0;
	}
	
	/**rolls for attack and if the attack is successful subtracts player defense from enemy attack and returns the number  
	 * 
	 * @param eattack
	 * @param pdefense
	 * @return
	 */
	public int enemyattack(Enemies enemy, Player player){
		Random rn = new Random();
		int chancetohit = rn.nextInt(100);
		if(chancetohit>25){
			return enemy.getattack()-player.getdefense();
		}
		return 0;	
	}
}
