
public class Main {

	public static void main(String[] args) {
		//while (true){
		Player player = new Player();
		Weapon wep = new Weapon();
		player.SetWeapon(wep);
		String type="rock";
		Area area = new Area(type);
		BattleSequence bs = new BattleSequence();
		bs.Battle(player, area);
		
	

	//}
	}
}
