package environment;

import javax.swing.JOptionPane;

import mobsandweapon.Player;
import mobsandweapon.Weapon;

public class WeaponUpgrade {

	public void weaponup(Player play){
		int option = Integer.parseInt(JOptionPane.showInputDialog("1: upgrade damage by 3\n2: upgrade accuracy by 3%\n3: upgrade critical "
				+"hit chance by 2%\n4:cancel"));
		if(option == 1 ){
			play.getweapon().updamage(3);
			play.setgold(-50);
			System.out.println("Your new stats are\nDamage = "+play.getweapon().getdamage()+" Accuracy = "+
			play.getweapon().getaccuracy()+" Critical hit chance = "+play.getweapon().getcritical());
		}
		else if(option == 2){
			play.getweapon().upaccuracy(3);
			play.setgold(-50);
			System.out.println("Your new stats are\nDamage = "+play.getweapon().getdamage()+" Accuracy = "+
					play.getweapon().getaccuracy()+" Critical hit chance = "+play.getweapon().getcritical());
		}
		else if(option == 3){
			play.getweapon().upcrit(2);
			play.setgold(-50);
			System.out.println("Your new stats are\nDamage = "+play.getweapon().getdamage()+" Accuracy = "+
					play.getweapon().getaccuracy()+" Critical hit chance = "+play.getweapon().getcritical());
		}
		else{
			
		}
	}
}
