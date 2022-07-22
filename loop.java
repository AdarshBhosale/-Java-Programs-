package com.ApnaCollege;

import java.util.*;
public class loop{
    public static void main(String[] args) {
        //for loop
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }

//        //While loop
//        int i=0; //initialisation
//        while(i<11){ //condition
//            System.out.println(i);
//            i++;
//        }

//        //do while loop
//        int i=0;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<11);

        //print sum of n natural numbers
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}