import javax.swing.JOptionPane;

import combat.BattleSequence;
import environment.Area;
import mobsandweapon.Bow;
import mobsandweapon.Mace;
import mobsandweapon.Player;
import mobsandweapon.Sword;
import mobsandweapon.Weapon;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("This is a very simple text combat game.");
		String name = JOptionPane.showInputDialog("What is your name?");
		Player player = new Player();
		int weaponchoice = Integer.parseInt(JOptionPane.showInputDialog("Please pick your weapon.\n1: Sword\nDamage = 3 Accuracy = 90 Critical "
				+ "hit chance = 6%\n\n2:bow\nDamage = 4 Accuracy = 80 Critical hit chance =20%"
				+"\n\n3: Mace\nDamage = 10 Accuracy = 65 Critical hit chance =6%"));
		if(weaponchoice == 1){
			Weapon wep = new Sword();
			player.SetWeapon(wep);}
		else if (weaponchoice == 2){
			Weapon wep = new Bow();
			player.SetWeapon(wep);}
		else if (weaponchoice == 3){
			Weapon wep = new Mace();
			player.SetWeapon(wep);}
		
	
		
		//while (true){
		
		
		Area area = new Area(type);
		BattleSequence bs = new BattleSequence();
		bs.Battle(player, area);
		
	

	//}
	}
}
