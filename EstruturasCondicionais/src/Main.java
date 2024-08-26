import java.util.Scanner;

public class Main {
    public static void main (String [] args) {

        System.out.println("Exercicios de Fixação");

        int ex;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um exercicio de 1 a 8:");
        System.out.println("1 - Ler um número inteiro, e depois dizer se este número é negativo ou não");
        System.out.println("2 - Ler um número inteiro e dizer se este número é par ou ímpar");
        System.out.println("3 - Ler números inteiros e dizer se são multiplos ou não");
        System.out.println("4 - Calcular duração (em horas) do jogo");
        System.out.println("5 - Calcular e mostrar valor de conta a pagar");
        System.out.println("6 - Ler valor e mostrar o intervalo desse valor");
        System.out.println("7 - Determinar quadrante onde x e y pertencem");
        System.out.println("8 - Calculo de imposto");

        System.out.println();
        System.out.print("Digite um numero: ");
        ex = sc.nextInt();

        if(ex == 1) {

            System.out.println("Exercicio 1");

            int num;

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            num = sc1.nextInt();

            if (num < 0) {
                System.out.println("NEGATIVO");
            } else {
                System.out.println("POSITIVO");
            }

            sc1.close();
        } if (ex == 2) {
            System.out.println("Exercicio 2");

            int num;

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            num = sc2.nextInt();

            if (num % 2 == 0) {

                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }

            sc2.close();
        } if (ex == 3) {

            System.out.println("Exercicio 3");

            int A;
            int B;

            Scanner sc3 = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            A = sc3.nextInt();
            System.out.println("Digite um numero: ");
            B = sc3.nextInt();

            if (A % B == 0 || B % A == 0) {
                System.out.println("Multiplos");
            } else {
                System.out.println("Não Multiplos");
            }

            sc3.close();
                } if (ex == 4) {

            System.out.println("Exercicio 4");
            int horaInicio;
            int horaFim;

            Scanner sc4 = new Scanner(System.in);

            System.out.println("Digite o horario inicial: ");
            horaInicio = sc4.nextInt();

            System.out.println("Digite o horario fim: ");
            horaFim = sc4.nextInt();

            int duracao;

            if (horaInicio < horaFim) {
                duracao = horaFim - horaInicio;
            }else {
                duracao = 24 - horaInicio + horaFim;
            }

            System.out.println("Duracao: " + duracao + " horas");

sc4.close();
        } if (ex == 5) {
System.out.println("Exercicio 5");


int codigo;
int qtd;

Scanner sc5 = new Scanner(System.in);

System.out.println("Digite o codigo: ");
codigo = sc5.nextInt();
System.out.println("Digite a quantidade: ");
qtd = sc5.nextInt();

double total=0;

if (codigo == 1){
    total = qtd * 4.0;
} else if (codigo == 2){
    total = qtd * 4.5;
} else if (codigo == 3){
    total = qtd * 5.0;
} else if (codigo == 4){
    total = qtd * 2.0;
}else if (codigo == 5){
    total = qtd * 1.5;
}
System.out.printf("Total: RS %.2f%n",  total);

sc5.close();
        } if (ex == 6) {

            System.out.println("Exercicio 6");

            double valor;
            Scanner sc6 = new Scanner(System.in);

            System.out.println("Digite o valor: ");
            valor = sc6.nextDouble();

            if ( valor > 0 && valor <= 25){
                System.out.println("Intervalo (0,25)");
            } else if (valor >25 && valor <=50 ){
                System.out.println("Intervalo (25,50)");
            } else if ( valor > 50 && valor <= 75){
                System.out.println("Intervalo (50,75)");
            } else if (valor > 75 && valor <= 100){
                System.out.println("Intervalo (75,100)");
            } else {
                System.out.println("Fora do intervalo)");
            }

            sc6.close();
        } if (ex == 7){

            System.out.println("Exercicio 7");

            double x, y;
            Scanner sc7 = new Scanner(System.in);

            System.out.println("Digite o x: ");
            x = sc7.nextDouble();
            System.out.println("Digite o y: ");
            y = sc7.nextDouble();

            if (x == 0.0 && y == 0.0){
                System.out.println("Ponto zero");
            }
            else if (x == 0.0)
            {
                System.out.println("eixo y");
            }
            else if (y == 0.0)
            {
                System.out.println("eixo x");
            }
            else if (x > 0.0 && y > 0.0)
            {
                System.out.println("Primeiro quadrante");
            }
            else if (x < 0.0 && y > 0.0)
            {
                System.out.println("Segundo quadrante");
            }
            else if (x < 0.0 && y < 0.0)
            {
                System.out.println("Terceiro quadrante");
            }
            else
            {
                System.out.println("Quarto quadrante");
            }

            sc7.close();


        }
        if (ex == 8){
            System.out.println("Exercicio 8");

            Scanner sc8 = new Scanner(System.in);

            double salario;
          


            System.out.println("Digite o salario: ");
            salario = sc8.nextDouble();
            double imposto;
            if (salario <= 2000.0)
            {
                imposto = 0.0;
            }
            else if(salario <= 3000.0)
            {
                imposto = (salario - 2000.0) * 0.08;
            }
            else if (salario <= 4500.0)
            {
                imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            }
            else
            {
                imposto = (salario - 4500.0)+0.28 + 1500.0 *0.18 + 1000.0 *0.08;
            }

            if (imposto == 0)
            {
                System.out.println("Isento de imposto");
            }
            else
            {
                System.out.print("Imposto: R$ %.2f%n" + imposto);
            }

            sc8.close();
        }
        sc.close();
    }
}
