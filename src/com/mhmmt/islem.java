package com.mhmmt;

import java.util.Scanner;

public class islem {

	Scanner sc = new Scanner(System.in);
	
	public void topla() {
	System.out.println("Ka� adet say� toplamak istiyorsunuz?...:");
	int adet = sc.nextInt();
	double toplam=0;
	for (int i = 1; i <= adet; i++) {
		System.out.println(i+". say�y� giriniz...:");
		double sayi= sc.nextDouble();
		toplam +=sayi;
	}
	System.out.println("Toplam sonucu...:"+ toplam);
		
	}
	
	public void cikart() {
		System.out.println("1. Say�y� giriniz...: ");
		double sayi1 = sc.nextDouble();
		
		System.out.println("2. say�y� giriniz...: ");
		double sayi2 = sc.nextDouble();
		
		double sonuc = sayi1-sayi2;
		System.out.println("Sonu�....:"+sonuc);	
	}
	
	public void carp() {
		System.out.println("1. Say�y� giriniz...: ");
		double sayi1 = sc.nextDouble();
		
		System.out.println("2. say�y� giriniz...: ");
		double sayi2 = sc.nextDouble();
		
		double carpim = sayi1*sayi2;
		System.out.println("Sonu�....:"+carpim);	
		
	}
	
	public void bol() {
		System.out.println("B�l�necek say�y� giriniz...: ");
		double sayi1 = sc.nextDouble();
		
		System.out.println("B�lecek say�y� giriniz...: ");
		double sayi2 = sc.nextDouble();
		
		double bolum = sayi1/sayi2;
		System.out.println("Sonu�....:"+bolum);	
	}
}
