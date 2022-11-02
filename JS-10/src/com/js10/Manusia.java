/*
 * Created by: 21343001_ADELINA SUCIKO
 */
 package com.js10;

import java.util.Scanner;

public class Manusia {
	
	String nama, tempat_lahir, tgl_lahir;
	int berat_badan, tinggi_badan;
	
	public void inputdata() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Masukan nama lengkap\t: ");
			nama = input.nextLine();
			System.out.print("Masukan tempat lahir\t: ");
			tempat_lahir = input.nextLine();
			System.out.print("Masukan tanggal lahir\t: ");
			tgl_lahir = input.nextLine();
			System.out.print("Masukan berat badan\t: ");
			berat_badan = input.nextInt();
			System.out.print("Masukan tinggi badan\t: ");
			tinggi_badan = input.nextInt();
		}
	}
	
	public void identitas() {
		System.out.println();
		System.out.println("**********************************************");
		System.out.print("Nama saya: " +nama);
		System.out.print("\nTempat tanggal lahir: " +tempat_lahir);
		System.out.print("\nTanggal lahir: "+ tgl_lahir );
		System.out.print("\nBerat badan: " +berat_badan + "kg");
		System.out.print("\nTinggi badan: " +tinggi_badan + "cm");
	}
	
	public static void main (String[] args) {
		Manusia A = new Manusia();
		A.inputdata();
		A.identitas();
	}

}
