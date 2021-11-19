package task_2;

public class Game_Chair {
    public static void PlayAGame() {
    	Player one=new Player();
    	Player two =new Player();
    	one.Start();
    	two.Start();
    	boolean Unentschieden=BetMore_Game.Tie(one,two);
    	if(Unentschieden) {
    		System.out.println("kein Sieger");return;}
    	else {
    		Player Sieger=BetMore_Game.FindWinner(one, two);
    		if(Sieger==one) {System.out.println("Der Computer gewinnt");}
    		else {
    		System.out.println("Der Spieler gewinnt");}}
    }

	
    
}
