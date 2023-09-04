package rolls;
import java.util.Random;
import java.util.Scanner;

public class Main {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("kolik d6");
		int a = sc.nextInt();
		System.out.println("uspìch?");
		int b = sc.nextInt();
		System.out.println("kolik uspìchu");
		int c = sc.nextInt();
		
		int success = 0;
		
		for(int i=0;i<10000;i++) {
			if(roll(a,b,c)==true) {success++;}
		}
		
		System.out.print(success);
	}
	
	public static boolean roll(int a, int b, int c) {
		Random rand = new Random();
		int succ = 0;
		for(int i=0;i<a;i++) {
			int n = rand.nextInt(6)+1;
			//System.out.println(n>=b);
			if(n>=b) {succ++;}
		}
		
		
		if(succ>=c) {return true;}
		return false;
	}

}


