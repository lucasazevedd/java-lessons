//# Atividade Prática #01
//
//    Crie um programa que:
//        1. Declare uma variável chamada salario e atribua a ela um valor.
//        2. Se o salário for maior que 2000, imprima “Você está pagando muito imposto”.
//        3. Caso contrário, imprima “Seu imposto está dentro da faixa normal”.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        int salario = scanner.nextInt();

        if(salario > 2000) {
            System.out.print("Você está pagando muito imposto");
        } else {
            System.out.print("Seu imposto está dentro da faixa normal");
        }
    }
}