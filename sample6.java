package com.ApnaCollege;

//check no is greater or not
import java.util.*;
public class sample6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        System.out.println(" a : ");
        int a=sc.nextInt();
        System.out.println(" b : ");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("a is equal to b");
        }
        else
            if(a>b){
                 System.out.println("a is greater than b");
            }
            else{
                System.out.println("a is less than b");
            }
    }
}
