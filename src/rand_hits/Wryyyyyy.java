package rand_hits;

import java.util.Random;

public class Wryyyyyy {

	public static void main(String[] args) {
		int WH = 0;
		int WHhit = 0;
		int Dg = 0;
		int Dghit = 0;
		int DC = 19;
		Random rand = new Random();
		
		for(int i=0;i<100;i++) {
			int hit = rand.nextInt(20)+1;
			
			if((hit+1)>= DC) {
			int WHplus = rand.nextInt(8)+1;

			WH = WH+WHplus;
			WHhit++;
			}
			
			if((hit+4)>= DC) {
				int Dgplus = rand.nextInt(4)+1;
				Dg = Dg+Dgplus;
				Dghit++;
				}
		}
		
		System.out.println("WarHammer hitnul "+WHhit+" krát; Dagger hitnul "+Dghit+" krát");
		System.out.println("WH dal "+WH+" damage; Dagger dal "+Dg+" Damage");
	}

}
