package com.ApnaCollege;

//To make calculator using switch case
import java.util.*;
public class sample9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Values:");
        System.out.println("a :");
        int a = sc.nextInt();
        System.out.println("b :");
        int b =sc.nextInt();
        int operator=sc.nextInt();

        switch(operator){
                case 1:
                int add = a+b;
                System.out.println("Addition :"+add);
                break;

            case 2:
                int sub = a-b;
                System.out.println("Subtraction :"+sub);
                break;

            case 3:
                int mul = a*b;
                System.out.println("Multiplication :"+mul);
                break;

            case 4:
                if(b==0){
                    System.out.println("Invalid Division");
                }else {
                    System.out.println("a/b");
                }

            case 5:
                if(b==0){
                    System.out.println("Invalid Division");
                }else{
                    System.out.println("a%b");
                }
            default:
                System.out.println("Invalid Operator");
        }

    }
}
