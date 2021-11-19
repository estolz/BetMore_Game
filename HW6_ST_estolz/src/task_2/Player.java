package task_2;

public class Player {
	public static int PlayerNR=0;
	int NR;
	boolean Players_nr1;
	Player(){
		if(PlayerNR==0) {PlayerNR++;this.Players_nr1=true;}
		else {this.Players_nr1=false;}
	}
	
	
    public int Start() {
    	int card_nr=0;
    	if(Players_nr1) {
    	    card_nr= BetMore_Game.Play();
    	    NR=card_nr;
    	    return card_nr;}
    	else {
    		for(int count=0;count<5;count++) {
    		    card_nr= BetMore_Game.Play();
    		    if(zufrieden(card_nr)) 
    		        {NR=card_nr;
    		    	 return card_nr;}
    	    }
    	NR=card_nr;return card_nr;	
    	}
    }
   static boolean zufrieden(int card) {
    	if(card>=75) {return true;}
    	else {return false;}
    }
   public int getNR() 
       {return NR;}
   
}
