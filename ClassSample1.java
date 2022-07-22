package com.ApnaCollege;

public class ClassSample1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int ans = a * b / a - b;
        System.out.println("a*b/a-b Ans:"+ans);

        int ans1 = (a * b)/(a - b);
        System.out.println("(a*b)/(a-b) Ans1:"+ans1);
    }
}