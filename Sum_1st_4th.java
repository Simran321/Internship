
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Sum_1st_4th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int num1=num/10000;
        System.out.println(num1);
        int num2=num%100;
        int num3=num2/10;
        System.out.println("The sum of 1st and 4th digit is: "+(num1+num3));
    }
   
}
