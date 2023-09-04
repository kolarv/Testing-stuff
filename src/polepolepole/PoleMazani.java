package polepolepole;

import java.util.Random;
import java.util.Scanner;

public class PoleMazani {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int novePole[] = new int[0];
		System.out.println("jak veliké chceš pole?");
		int velikostPole = sc.nextInt();
		System.out.println("jaký chceš mít max?");
		int max = sc.nextInt();
		int pole[] = vytvorPole(velikostPole,max);
		for(int i=0;i<velikostPole;i++) {
			if(!zjisti(pole[i],novePole)) {
				novePole = pridej(pole[i],novePole);
			}
		}
		
		System.out.println("---------------");
		for(int i=0;i<novePole.length;i++) {
			System.out.println(novePole[i]);
		}
	}
	
	public static boolean zjisti(int cislo,int []nove) {
		for(int i=0;i<nove.length;i++) {
			if(nove[i]==cislo) {
				return true;
			}
		}
		return false;
	}
	public static int[] pridej(int a,int[] nove) {
		int[] tempPole = new int[nove.length+1];
		for(int i=0;i<nove.length;i++) {
			tempPole[i] = nove[i];
		}
		tempPole[nove.length] = a;
		return tempPole;
	}
	
	public static int[] vytvorPole(int a,int max) {
		int pole[] = new int[a];
		Random rand = new Random();
		for(int i=0;i<a;i++) {
			pole[i] = rand.nextInt(max);
		}
		return pole;
	}
}
