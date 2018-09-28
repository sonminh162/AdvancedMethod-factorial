package com.company;

import java.util.Scanner;

public class Main
{
    public static long factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao 1 so:");
        int n;
        long a;
        n = scanner.nextInt();
        a = factorial(n);
        System.out.print(a);


    }
}
