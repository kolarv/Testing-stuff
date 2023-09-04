package montyHall;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int win = 0;
		int loss = 0;
		int pocetTest = 0;
		int celkPocetTest = 10000;
		Random rand = new Random();
		while(true) {
			int[] dvere = {0,0,0};
			int winD = rand.nextInt(3);
			dvere[winD] = 1;
			int dvereSel = rand.nextInt(3);
			int[] nevyb = {-1,-1};
			for(int i=0;i<3;i++) {
				if(dvereSel != i) {
					if(nevyb[0] == -1) {
						nevyb[0] = i;
					}
					else {
						nevyb[1] = i;
					}
				}
			}
			while(true) {
				int otevriD = rand.nextInt(2);
				if(dvere[nevyb[otevriD]] != 1) {
					dvere[nevyb[otevriD]] = -1;
					break;
				}
			}
			for(int i=0;i<3;i++) {
				System.out.println(dvere[i]);	
			}
			if(dvere[dvereSel] == 0) {win++;}
			else {loss++;}
			System.out.println("win: "+win+" "+" los: "+loss);
			pocetTest++;
			if(pocetTest >= celkPocetTest) {break;}
		}
		float procenta = (float)(((float)win/(float)celkPocetTest)*100);
		System.out.println(procenta+"% vyhra");
	}

}
