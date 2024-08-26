package application;

import entities.Student;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Digite o nome do aluno: ");
        student.name = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        student.grade1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f%n", student.finalGrade() );

        if (student.finalGrade() < 60.0)
        {
            System.out.println("Reprovado");
            System.out.printf("Faltou %.2f pontos%n", student.missingPoint());
        }
        else
        {
            System.out.println("Aprovado");
        }

        sc.close();
    }

}
