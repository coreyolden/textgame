
import javax.swing.JOptionPane;
public class BattleSequence {
Player player;
Enemies enemy;
Area area;

Weapon weapon;

/**Brings the player from main, initalizes an ememy, carries out the battle, gives out loot.
 * 
 * @param play
 */
public void Battle(Player play, Area area){
		
		player = play;
		weapon = player.getweapon();
		Enemies en = new Enemies();
		enemy = en;
		en.setstats(player.getlevel());
		boolean battlenotover = true;
		System.out.println("\nYou encounter an enemy.\nYou have "+ player.gethealth() +" the enemy has "+ en.gethealth());
		while(battlenotover){
			
			System.out.println("You have "+player.getpotions()+" potions");
			int input = Integer.parseInt(JOptionPane.showInputDialog("What do you wish to do?\nFight: 1\nDrink potion: 2"));
			
			if(input ==1){
				DamageCalculator dc = new DamageCalculator();
				int damagedone =dc.playerattack(player, enemy);
				if(damagedone<1){
					System.out.println("You swing and miss the enemy");
				}
				else{
					System.out.println("You swing and strike the enemy for "+ damagedone+" damage");
					enemy.health-= damagedone;
					if (enemy.health<1){
						int goldwon = player.getlevel()*5;
						System.out.println("You search the body and found "+goldwon+" gold coins");
						System.out.println("You earned 10 experience");
						player.setgold(goldwon);
						player.AddExp(10);
						battlenotover=false;
						break;
					}
					else{
						System.out.println("The enemy has "+enemy.gethealth()+" health remaining");
					}
				}
			}
			else{
				System.out.println("You drink a potion and regain 10 health");
				player.setpotions(-1);
			}
			
			// now it is the enemie's turn
			DamageCalculator dc = new DamageCalculator();
			int damagedone = dc.enemyattack(enemy, player);
			System.out.println("The enemy hits you for "+ damagedone+" damage");
			player.health-=damagedone;
			if(player.health<1){
				System.out.print("Sorry you died");
			}
			else{System.out.println("You have " +player.gethealth()+" health remaining");}
			System.out.println("\n\n\n\n\nYou have "+ player.gethealth() +" the enemy has "+ en.gethealth());
}
}
}
