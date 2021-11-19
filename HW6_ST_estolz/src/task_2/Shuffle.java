package task_2;
import java.lang.Math;
public class Shuffle {
    public static int pick_card() {
    	double Random= Math.random();
    	Random=(Random*100);
    	int Karte=(int)Random;
    	return Karte;
    }
}
