package com.rahul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        for(double i=1;i<=n;i++){
            sum=sum+(1/i);
        }

        System.out.println(sum);
    }
}
