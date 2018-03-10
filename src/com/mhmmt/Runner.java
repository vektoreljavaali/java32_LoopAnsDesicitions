package com.mhmmt;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		uyglama uyg = new uyglama();
		Scanner sc = new Scanner(System.in);
		String istek="H";
		do {
			uyg.islemuygulamasý();
			System.out.println("Baþka Ýþlem yapmak istiyormusunuz?(E/H)");
			istek = sc.nextLine();
		} while (istek.equals("E"));
		
		
		
		
	//if(secim==1) 
	//	islm.topla();
	//else if(secim==2) 
	//	islm.cikart();
	//else if(secim==3) 
	//	islm.carp();
	//else
	//	islm.bol();
	//
		
		System.out.println("program sonlandýrýldý...");
	}

}








