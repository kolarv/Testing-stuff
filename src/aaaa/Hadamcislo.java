package aaaa;

import java.util.Scanner;

public class Hadamcislo {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean uhodnuto = false;
		int min = 1;
		System.out.println("zadej maxim�ln� ��slo");
		int max = sc.nextInt();
		while(true) {
			int stred = ziskejPulku(min,max);
			System.out.println("mysl� si ��slo "+stred+"?");
			String odpoved = sc.next();
			switch(odpoved) {
			case "ano": 
				System.out.println("��slo na kter� si myslel bylo "+stred);
				uhodnuto = true;
				break;
			case "men��":
				max = stred;
				break;
			case "v�t��":
				min = stred;
				break;
			}
			if(min == max && !uhodnuto) {				//tato podm�nka chr�n� pokud by nastala chyba 
				System.out.println(min+" , "+max);		//nebo by student nep�iznal �e program uh�dl
				System.out.println("promi�, ale n�jak to nem��u uh�dnout");
				uhodnuto = true;
			}
			if(uhodnuto) break;
		}
	}
	public static int ziskejPulku(int a,int b) {	//tato metoda n�m zjist� st�ed mezi dv�ma ��sly
		int tempHolder = (a+b)/2;					//a p�evede jej na cel� ��slo
		return tempHolder;
	}
}
