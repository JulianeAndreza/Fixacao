package application;

import entities.Rectangle;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Report:");
        System.out.println("Width:");
        rectangle.width = sc.nextInt();
        System.out.println("Height:");
        rectangle.height = sc.nextInt();

        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimeter : %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());
        sc.close();


    }


}
