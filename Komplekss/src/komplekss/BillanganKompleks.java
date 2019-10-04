/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komplekss;
import java.util.Scanner;

public class BillanganKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c , d;
        System.out.print("Masukan bilangan riil pertama:");
        a = input.nextInt();
        System.out.print("Masukan bilangan imajiner pertama:");
        b = input.nextInt();
        System.out.print("Masukan bilangan rill kedua:");
        c= input.nextInt();
        System.out.print("masukan bilangan imj kedua:");
        d=input.nextInt();

       
        ComplexNumber cn1 = new ComplexNumber(a, b);
        ComplexNumber cn2 = new ComplexNumber(c, d);

        System.out.println("Bilangan kompleksnya adalah:" + cn1 + "," + cn2);

        System.out.println("Hasil perkaliannya adalah : " + cn1.multiply(cn2));

            
    }
}