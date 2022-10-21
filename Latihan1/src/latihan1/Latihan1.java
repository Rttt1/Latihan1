/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {
       java.util.Scanner input = new java.util.Scanner (System.in);

        // Person 1
        String NAMA;
        String JENISKELAMIN;
        String UMUR;

        System.out.println ("PERSON 1");
        System.out.print("INPUT NAMA = ");
        NAMA =input.nextLine();
        System.out.print("INPUT JENIS KELAMIN = ");
        JENISKELAMIN=input.nextLine();
        System.out.print("UMUR = ");
        UMUR=input.nextLine();

        System.out.println ("------------------------------");
        System.out.println("NAMA SAYA  =  " + NAMA);
        System.out.println("JENIS KELAMIN = " + JENISKELAMIN);
        System.out.println("UMUR = " + UMUR);
        System.out.println ("------------------------------");
        
        System.out.println (" ");
        System.out.println ("PERSON 2");
        
        // Person 2
        String NAMA1;
        String JENISKELAMIN1;
        String UMUR1;

        System.out.print("INPUT NAMA = ");
        NAMA1 =input.nextLine();
        System.out.print("INPUT JENIS KELAMIN = ");
        JENISKELAMIN1=input.nextLine();
        System.out.print("UMUR = ");
        UMUR1=input.nextLine();

        System.out.println ("------------------------------");
        System.out.println("NAMA SAYA  =  " + NAMA1);
        System.out.println("JENIS KELAMIN = " + JENISKELAMIN1);
        System.out.println("UMUR = " + UMUR1);
        System.out.println ("------------------------------");
        

    }
    
}

    

