//### Desafio 02
//
//        1. Crie um método chamado calcularMedia que receba um array de números inteiros e retorne a média desses números.
//        2. No método main, crie um array com 5 números, chame o método calcularMedia e imprima o resultado.

public class Desafio02 {
    public static void main(String[] args) {
        int[] numeros = {5,6,8,9,6,7,8,10};
        double resultado = calcularMedia(numeros);
        System.out.println("A média é: " + resultado);
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return (double) soma / numeros.length;
    }
}
