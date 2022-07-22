package com.ApnaCollege;

//conditional Statement (if-else,else-if,switch,break)
//take the i/p from the user and check the condition is true or not

import java.util.*;
public class Sample4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
    }
}