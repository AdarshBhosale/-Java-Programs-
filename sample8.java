package com.ApnaCollege;

//Switch case
//Switch syntax
//switch(variable)
//case 1: stmt 1;
//break;
//case 2: stmt 2;
//break;
//case 3: stmt 3;
//break;
//default: stmt4;

import java.util.*;
public class sample8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int button= sc.nextInt();
        switch(button){
            case 1: System.out.println("You Pressed case 1");
            break;
            case 2: System.out.println("You Pressed case 2");
            break;
            case 3: System.out.println("You Pressed case 3");
            break;
            default: System.out.println("Invalid");
        }
    }
}
