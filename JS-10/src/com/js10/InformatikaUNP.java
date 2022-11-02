/*
 * Created by: 21343001_ADELINA SUCIKO
 */
package com.js10;

public class InformatikaUNP {

	public static void main(String[] args) {
		
		Mahasiswa informatika = new Mahasiswa();
		Mahasiswa elektronika= new Mahasiswa();
		
		informatika.nama = "Happy Alicia";
		informatika.nim = 1;
		informatika.jur = "S1 Elektronika";
		informatika.univ= "Universitas Negeri Padang";
		
		elektronika.nama="wilson";
		elektronika.nim=2;
		elektronika.jur="S1 Elektronika";
		elektronika.univ="Universitas Negeri Padang";
		
		System.out.println("Data Mahasiswa Informatika");
		System.out.println("Nama : " +informatika.nama);
		System.out.println("NIM : " +informatika.nim);
		System.out.println("Jurusan : " +informatika.jur);
		System.out.println("Status : " +informatika.univ);
		System.out.println();
		
		System.out.println("*****************************");
		
		System.out.println();
		System.out.println("Data Mahasiswa Informatika");
		System.out.println("Nama : " +informatika.nama);
		System.out.println("NIM : " +informatika.nim);
		System.out.println("Jurusan : " +informatika.jur);
		System.out.println("Status : " +informatika.univ);
	}

}
