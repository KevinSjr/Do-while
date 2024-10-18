/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int senha = 13579;
        int senha2;
        do
        {System.out.println("Digite a senha");
         senha2 = leia.nextInt();}
        while
        (senha !=senha2);    
}
}