package environment;

import javax.swing.JOptionPane;

import combat.BattleSequence;
import mobsandweapon.Player;

public class Area {
private int dungeonlength;
public void rundungeon(Player player){
	for(int i =0; i<9; i++){
		BattleSequence bs = new BattleSequence();
		bs.Battle(player);
		int option = Integer.parseInt(JOptionPane.showInputDialog("You have "+(9-i)+" fights left\n1: push on\n2: Return to town"));
		if (option == 2){
			break;
		}
	}
}
}
