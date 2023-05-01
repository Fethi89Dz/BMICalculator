/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bmicalculator;

import java.util.Scanner;

/**
 *
 * @author fethi
 */
public class BMICalculator {

    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.print("Enter your weight in KG: ");
        double Weight = x.nextDouble();
        Scanner y = new Scanner(System.in);
        System.out.print("Enter your Height in meter: ");
        double Height = y.nextDouble();
        System.out.print("The Body Mass Index (BMI) is "+ Weight / (Height * Height)+" kg/m2");
       
        
    }
}
