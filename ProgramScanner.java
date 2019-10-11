/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("input nama = ");// TODO code application logic here
        String nama = sc.next();
        System.out.println("input jurusan = ");
        String jurusan = sc.next();
        System.out.println(" input nilai = ");
        int nilai = sc.nextInt();
        
        System.out.println(" nama  " + nama);
        System.out.println(" jurusan  " + jurusan);
        System.out.println("nilai " + nilai);
    }
    
}
