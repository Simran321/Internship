
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
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int rev =0;
        int r=0;
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println("After reverse : "+rev);
    }
}
