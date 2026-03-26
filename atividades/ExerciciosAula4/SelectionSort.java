//criação de algaritmo de maior a menor utilizando Selection Sort

package atividades.ExerciciosAula4;

public class SelectionSort {
    public static void main(String[] args) {
        int numeros[] = { 4, 2, 10, 123, -3, 32, 0, 34, 12, 91, 45, 3, 21, 87, 61 };
        selectionSort(numeros);
        for (int n : numeros) {
            System.out.print(n + " ");// imprime os numeros ordenados
        }
    }

    public static void selectionSort(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            int maior = i; // vai receber o indice do maior numero
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] > numeros[maior])
                    maior = j; // vai receber o indice do maior numero
            }
            int aux = numeros[maior]; // variavel auxiliar para receber o maior numero
            numeros[maior] = numeros[i]; // o maior numero recebe o numero da posicao i
            numeros[i] = aux; // o numero da posicao i recebe o maior numero
        }

    }
}
