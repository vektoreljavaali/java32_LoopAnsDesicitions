package com.mhmmt;

import java.util.Scanner;

public class uyglama {

	public void islemuygulamas�() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("****** HESAP MAK�NES� ****");
		System.out.println("**************************");
		
		
		System.out.println("YAPILACAK ��LEM� SE��N�Z..");
		System.out.println("");
		System.out.println("1- Toplama");
		System.out.println("2- ��kartma");
		System.out.println("3- �arpma");
		System.out.println("4- B�lme");
		
		
		System.out.print("��lem Se�.....:");
		
		int secim = sc.nextInt();
		
		while(secim<=0 || secim>=5) {
			System.out.println("Ge�erli bir se�im yap�n�z...: ");
			secim = sc.nextInt();
		}
		
		islem islm = new islem();
		switch (secim) {
		case 1:islm.topla();break;
		case 2:islm.cikart();break;
		case 3:islm.carp();break;
		default:islm.bol();break;
		}
		
	}
	
}
