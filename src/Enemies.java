
public class Enemies extends Mobs {
	
 public void setstats(int playerlevel){
	  health =15 + playerlevel*2;
	  attack = 5+ playerlevel;
	 defense = 5+ playerlevel;
	
 }
 
}
