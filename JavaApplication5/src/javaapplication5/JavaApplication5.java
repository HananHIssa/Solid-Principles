/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
     int num1=input.nextInt();
     if(num1%2==0&&num1!=2)
            System.out.println("YES");
     else
            System.out.println("NO");
     
                

    }
    
}
