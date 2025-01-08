package main;

import java.util.Scanner; // Import the Scanner class

public class FirstProg {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int a,b,c;
// a = 12;
// b = 50;


System.out.println("Enter first Integer: ");
a = sc.nextInt();
System.out.println("Enter second integer: ");
b = sc.nextInt();
c = a+b;

System.out.println("Hello World!");
System.out.println("a= "+ a + " b= "+ b + " and the sum is... "+ c);

sc.close();

    }
}




