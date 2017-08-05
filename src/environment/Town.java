package environment;
import mobsandweapon.Player;
import mobsandweapon.Weapon;
import javax.swing.JOptionPane;

public class Town  {
	Player player;
	public void townoptions(Player play){
		player = play;
		play.adjusthealth(500000);
		while(true){
		int option = Integer.parseInt(JOptionPane.showInputDialog("Welcome to the town. You have "+player.getcoins()+" gold coins\nPress"
				+ " 1 If you would like to buy a potion for 20 gold"
				+"\nPress 2 if you would like to upgrade your weapon for 50 gold\nPress 3 if you would like to go on an adventure!"));
		if(option == 1 ){
			if(player.getcoins()>=20){
				player.setgold(-20);
				player.setpotions(1);
				System.out.println("You bought one potion. You now have "+player.getcoins()+" gold coins remaining");
			}
			else{
				System.out.println("You do not have enough gold for that");
			}
		}
		else if(option == 2){
			if(player.getcoins()>=50){
			WeaponUpgrade wepup = new WeaponUpgrade();
			wepup.weaponup(player);
			
			}
			else{
				System.out.println("You do not have enough gold for that");
			}
		}
		else if (option == 3){
			break;
		}
	}
}
}