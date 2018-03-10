package com.mhmmt;

import java.util.Scanner;

public class uyglama {

	public void islemuygulamasý() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************");
		System.out.println("****** HESAP MAKÝNESÝ ****");
		System.out.println("**************************");
		
		
		System.out.println("YAPILACAK ÝÞLEMÝ SEÇÝNÝZ..");
		System.out.println("");
		System.out.println("1- Toplama");
		System.out.println("2- Çýkartma");
		System.out.println("3- Çarpma");
		System.out.println("4- Bölme");
		
		
		System.out.print("Ýþlem Seç.....:");
		
		int secim = sc.nextInt();
		
		while(secim<=0 || secim>=5) {
			System.out.println("Geçerli bir seçim yapýnýz...: ");
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
