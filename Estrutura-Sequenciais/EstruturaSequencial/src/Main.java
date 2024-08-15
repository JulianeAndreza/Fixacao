import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        int ex;

        Scanner sc = new Scanner(System.in);

        System.out.println("Lista de exercicios de estrutura sequencial.");
        System.out.println(" 1 - Soma de dois numero inteiros; \n 2 - Area de um circulo; \n 3 - Diferença entre tres numeros inteiros;\n" +
                " 4 - Salário de funcionário; \n 5 - Pagamento de peças; \n 6 - Pontos flutuantes. \n");


        System.out.println("Qual exercicio deseja testar: ");
        ex = sc.nextInt();

        if (ex == 1) {

            int num1;
            int num2;
            int res;

            System.out.println("Exercicio 1");

            Scanner sc1 = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            num1 = sc1.nextInt();
            System.out.println("Digite um numero: ");
            num2 = sc1.nextInt();

            res = num1 + num2;
            System.out.println("O resultado da soma entre os dois números digitados é: " + res);

            sc1.close();
        } if (ex == 2) {
            System.out.println("Exercicio 2");

            double vraio;
            double area;

            double PI = 3.14159;
            Scanner sc2 = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            vraio = sc2.nextDouble();

            area = PI * (vraio * vraio);

            System.out.printf("O valor da area é %f.4%n", area);

            sc2.close();

        } if (ex == 3) {
            System.out.println("Exercicio 3");

            int A;
            int B;
            int C;
            int D;

            int dif;

            Scanner sc3 = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            A = sc3.nextInt();
            System.out.println("Digite um numero: ");
            B = sc3.nextInt();
            System.out.println("Digite um numero: ");
            C = sc3.nextInt();
            System.out.println("Digite um numero: ");
            D = sc3.nextInt();

            dif = A*B-C*D;
            System.out.println("A diferença é: " + dif);

            sc3.close();


        } if(ex == 4){
            System.out.println("Exercicio 4");

            int numFunc;
            int horasTrabalhadas;
            double valorPorHora;
            double salario;

            Scanner sc4 = new Scanner(System.in);
            System.out.println("Digite o numero do funcionario: ");
            numFunc = sc4.nextInt();
            System.out.println("Digite o numero de horas trabalhadas: ");
            horasTrabalhadas = sc4.nextInt();
            System.out.println("Digite o valor por hora trabalhada: ");
            valorPorHora = sc4.nextDouble();

           salario = horasTrabalhadas * valorPorHora;

           System.out.println("Funcionario numero: " + numFunc);
           System.out.printf("Salário: %.2f%n", salario);

           sc4.close();
        } if (ex == 5){

            System.out.println("Exercicio 5");

            int codigo1;
            int qtdPecas1;
            double vlUnitario1;
            int codigo2;
            int qtdPecas2;
            double vlUnitario2;

            Scanner sc5 = new Scanner(System.in);
            System.out.println("Codigo de peça 1: ");
            codigo1 = sc5.nextInt();
            System.out.println("Numero de pecas 1: ");
            qtdPecas1 = sc5.nextInt();
            System.out.println("Valor unitario da peça 1: ");
            vlUnitario1 = sc5.nextDouble();
            System.out.println("Codigo da peca 2: ");
            codigo2 = sc5.nextInt();
            System.out.println("Numero de peças 2: ");
            qtdPecas2 = sc5.nextInt();
            System.out.println("Valor unitario da peça 2:");
            vlUnitario2 = sc5.nextDouble();

            double pagar;

            pagar = (qtdPecas1 * vlUnitario1) + (qtdPecas2 * vlUnitario2);

            System.out.println("Valor a pagar: " + pagar);

           sc5.close();
        } if (ex == 6){

            System.out.println("Exercicio 6");
            double A;
            double B;
            double C;

            double PI = 3.14159;

            Scanner sc6 = new Scanner(System.in);

            System.out.println("Digite o valor de A: ");
            A = sc6.nextDouble();
            System.out.println("Digite o valor de B: ");
            B = sc6.nextDouble();
            System.out.println("Digite o valor de C: ");
            C = sc6.nextDouble();

            double areaTriangulo;
            double areaCirculo;
            double areaTrapezio;
            double areaQuadrado;
            double areaRetangulo;

            areaTriangulo = (A*C) / 2.0;
            areaCirculo = PI * C * C;
            areaTrapezio = ((A + B) * C) / 2.0;
            areaQuadrado = B * B;
            areaRetangulo = A * B;

            System.out.println ("Resultados: \n");

            System.out.printf("Area do Triangulo: %.2f%n", areaTriangulo);
            System.out.printf("Area do Circulo: %.2f%n", areaCirculo);
            System.out.printf("Area do Trapezio: %.2f%n", areaTrapezio);
            System.out.printf("Area do Quadrado: %.2f%n", areaQuadrado);
            System.out.printf("Area do Retangulo: %.2f%n", areaRetangulo);

            sc6.close();
            sc6.close();

        }


        System.out.println("----------Fim de Exercicios----------");
        sc.close();
    }

}
