

import tugas.*;
import java.util.Scanner;

public class TugasVariabelDanTipeData {
    static double bilangan1, bilangan2, hasil;
    static char pilihan;
    
public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 //Konversi Nilai dari Angka ke Huruf
 System.out.println("\n1. Konversi Nilai dari Angka ke Huruf");
 System.out.println("Masukkan Nilai: ");
 int nilai = input.nextInt();
 String grade;
 
 if(nilai>=85&& nilai <= 100){
     grade = "A";
 }
 else if (nilai >= 75 && nilai <= 84){
     grade = "B";
 }
 else if (nilai >= 65 && nilai <= 74){
     grade = "C";
 }
 else if (nilai >= 55 && nilai <= 64){
     grade = "D";
 }
 else if (nilai <= 54){
     grade = "E";
 }
 else {
     grade = "Maaf inputan anda Salah";
 }
 System.out.println("Nilai anda adala:" + grade);
 System.out.println("--");
 
 //Operasi Aritmatika
 System.out.println("\n2. Operasi Aritmatika");
 System.out.println("Masukan bilangan pertama: ");
 bilangan1 = input.nextInt();
 System.out.println("Masukkan bilangan kedua :");
 bilangan2 = input.nextInt();
 
 System.out.println("\nPilihan Operasi Aritmatika");
 System.out.println("(+)Penjumlahan");
 System.out.println("(-)Pengurangan");
 System.out.println("(*)Perkalian");
 System.out.println("(%)Modus");
 System.out.println("Pilihan Anda");
 pilihan = input.next().charAt(0);
 
 String operator = null;
 
 switch (pilihan){
     case'+':
         hasil=bilangan1 + bilangan2;
         operator="Penjumlahan";
         break;
     case'-':
         hasil=bilangan1 - bilangan2;
         operator="Pengurangan";
         break;
     case'*':
         hasil=bilangan1 - bilangan2;
         operator="Perkalian";
         break;
     case'/':
         hasil=bilangan1 - bilangan2;
         operator="Pembagian";
         break;
     case'%':
         hasil=bilangan1 - bilangan2;
         operator="Modus";
         break;
     default:
         System.out.println("Pilihan anda salah, Tolong dicoba kembali");
    }
    System.out.println("\nHasil "+ operator + bilangan1 + "dan" + bilangan2 + "adalah" + hasil);
    System.out.println("--");
    }
}
