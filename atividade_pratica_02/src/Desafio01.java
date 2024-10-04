//### Desafio 01
//
//        1. Crie um array de 10 números inteiros.
//        2. Use um loop for para percorrer o array e imprimir apenas os números que são múltiplos de 3.

public class Desafio01 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Os números múltiplos de 3 são: ");

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 3 == 0) {
                System.out.println(numeros[i] + " ");
            }
        }
    }
}