package application;

import entities.Employee;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();


        System.out.println("Digite o nome: ");
        emp.name = sc.nextLine();
        System.out.println("Salário: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("Imposto");
        emp.tax = sc.nextDouble();

        System.out.println(emp);
        System.out.println();
        System.out.println("Porcentagem de aumento: ");
        double perc = sc.nextDouble();
        emp.increaseSalary(perc);
        System.out.println("Dados atualizados:");
        System.out.println(emp);

        sc.close();

    }


}
