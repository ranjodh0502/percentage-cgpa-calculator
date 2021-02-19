package com.company;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        float tot=500.0f;
        System.out.println("Lets calculate your Percentage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of sub1");
        float a=sc.nextInt();
        System.out.println("Enter marks of sub2");
        float b=sc.nextInt();
        System.out.println("Enter marks of sub3");
        float c= sc.nextInt();
        System.out.println("Enter marks of sub4");
        float d=sc.nextInt();
        System.out.println("Enter marks of sub5");
        float e= sc.nextInt();
        float sum=a+b+c+d+e;
        float per = sum / tot * 100f;
        System.out.println("Your Percentage is: ");
        System.out.println(per);
        System.out.println("now lets calculate your CGPA");
        float cpa=per/9.8f;
        System.out.print("CGPA IS : ");
        System.out.println(cpa);
    }
}
