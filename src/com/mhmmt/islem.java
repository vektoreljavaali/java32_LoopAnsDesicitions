package com.mhmmt;

import java.util.Scanner;

public class islem {

	Scanner sc = new Scanner(System.in);
	
	public void topla() {
	System.out.println("Kaç adet sayý toplamak istiyorsunuz?...:");
	int adet = sc.nextInt();
	double toplam=0;
	for (int i = 1; i <= adet; i++) {
		System.out.println(i+". sayýyý giriniz...:");
		double sayi= sc.nextDouble();
		toplam +=sayi;
	}
	System.out.println("Toplam sonucu...:"+ toplam);
		
	}
	
	public void cikart() {
		System.out.println("1. Sayýyý giriniz...: ");
		double sayi1 = sc.nextDouble();
		
		System.out.println("2. sayýyý giriniz...: ");
		double sayi2 = sc.nextDouble();
		
		double sonuc = sayi1-sayi2;
		System.out.println("Sonuç....:"+sonuc);	
	}
	
	public void carp() {
		System.out.println("1. Sayýyý giriniz...: ");
		double sayi1 = sc.nextDouble();
		
		System.out.println("2. sayýyý giriniz...: ");
		double sayi2 = sc.nextDouble();
		
		double carpim = sayi1*sayi2;
		System.out.println("Sonuç....:"+carpim);	
		
	}
	
	public void bol() {
		System.out.println("Bölünecek sayýyý giriniz...: ");
		double sayi1 = sc.nextDouble();
		
		System.out.println("Bölecek sayýyý giriniz...: ");
		double sayi2 = sc.nextDouble();
		
		double bolum = sayi1/sayi2;
		System.out.println("Sonuç....:"+bolum);	
	}
}
