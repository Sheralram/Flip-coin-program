package com.ram;


import com.ram.com.ram.utility.Utilityflipcoin;

import java.util.Scanner;

public class flipcoinprogram {
    public static void main(String[] args)
    {
        System.out.println("Welcome to flip coin Program");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of time to flip");
        int num = scanner.nextInt();
        Utilityflipcoin utility = new Utilityflipcoin();
        utility.coinface(num);
            }
}