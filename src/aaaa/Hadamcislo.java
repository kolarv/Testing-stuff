package aaaa;

import java.util.Scanner;

public class Hadamcislo {
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean uhodnuto = false;
		int min = 1;
		System.out.println("zadej maximální èíslo");
		int max = sc.nextInt();
		while(true) {
			int stred = ziskejPulku(min,max);
			System.out.println("myslíš si èíslo "+stred+"?");
			String odpoved = sc.next();
			switch(odpoved) {
			case "ano": 
				System.out.println("èíslo na které si myslel bylo "+stred);
				uhodnuto = true;
				break;
			case "menší":
				max = stred;
				break;
			case "vìtší":
				min = stred;
				break;
			}
			if(min == max && !uhodnuto) {				//tato podmínka chrání pokud by nastala chyba 
				System.out.println(min+" , "+max);		//nebo by student nepøiznal že program uhádl
				System.out.println("promiò, ale nìjak to nemùžu uhádnout");
				uhodnuto = true;
			}
			if(uhodnuto) break;
		}
	}
	public static int ziskejPulku(int a,int b) {	//tato metoda nám zjistí støed mezi dvìma èísly
		int tempHolder = (a+b)/2;					//a pøevede jej na celé èíslo
		return tempHolder;
	}
}
