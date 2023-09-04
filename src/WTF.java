import java.util.Random;
import java.util.Timer;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class WTF {
	public static void main(String[] Args) {
		int pocet = 0;
		int[] pole = new int[100];
		for(int i=0;i<pole.length;i++) {
			pole[i]=(i+1);
		}
		//for(int i=0;i<pole.length;i++) {System.out.print(pole[i]+" ");}
		shuffleArray(pole);
		
		Timer tim = new Timer();
		long zacT = System.currentTimeMillis();
		while(true){
			if(isSorted(pole)) {break;}
			shuffleArray(pole);
			pocet++;
		}
		long konT = System.currentTimeMillis();
		System.out.println(konT-zacT);
		System.out.println(pocet+" pocet");
	}
	
	
	public static boolean isSorted(int[] array) {
	    return IntStream.range(0, array.length - 1).noneMatch(i -> array[i] > array[i + 1]);
	}
	
	public static void shuffleArray(int[] n) {
		Random rnd = ThreadLocalRandom.current();
	    for (int i = n.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      // Simple swap
	      int a = n[index];
	      n[index] = n[i];
	      n[i] = a;
	    }
	}
}
