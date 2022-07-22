package com.ApnaCollege;

//check the no is even or odd
import java.util.*;
public class sample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("Even no");
        }
        else{
            System.out.println("Odd No");
        }
    }
}
