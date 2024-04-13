package org.example;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {

    public static void main(String[] args) {
        int num = 0;
        int j = 1;

        while(num < 100) {
            num = factorAmount(triangleNumber(j));
            if (num >= 100) {
                System.out.println("Triangle Number: " + j);
                System.out.println("Value: " + triangleNumber(j));
            }
            j++;
        }
    }

    public static int triangleNumber(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorAmount(int num) {
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum++;
            }
        }
        return sum;
    }



}