package task_2;

public class BetMore_Game {
    public static int Play() {
    	int filler=Shuffle.pick_card();
    	return filler;
    }
    public static Player FindWinner(Player one,Player two) {
    	int eins=one.getNR();
    	int zwei= two.getNR();
    	
    	if(eins>zwei) {return one;}
    	else {return two;}
    	
    }
    public static boolean Tie(Player one, Player two) {
    	int eins=one.getNR();
    	int zwei= two.getNR();
    	
    	if (eins==zwei) {return true;}
    	return false;
    }
}
