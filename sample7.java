package com.ApnaCollege;

//print the greeting
import java.util.*;
public class sample7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Button : ");
        int Button = sc.nextInt();
        if(Button==1){
            System.out.println("Namaste");
        } else if(Button==2){
            System.out.println("Namaskar");
        } else if (Button==3) {
            System.out.println("Bonjour");
        } else{
            System.out.println("Invalid");
        }
    }
}
