package atividades;

public class ExercicioInverterArrray {
public static void main(String[] args) {
    double vetorOriginais[] = {4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5}; //lista de valores
    System.out.println("lista original dos vetores:");
    for (int i = 0; i < vetorOriginais.length; i++) {
        System.out.print(vetorOriginais[i] + " ");
    }
    System.out.println();
    double vetorInvertidos[] = new double[vetorOriginais.length];//aqui vai fica os valores invertidos
    for (int i = 0; i < vetorOriginais.length; i++){
        vetorInvertidos[i] = vetorOriginais[vetorOriginais.length - 1 -i]; // isso aqui vai pegar o ultimo valor do vetor e colocar no primeiro indice do vetor invertido,
    }
    System.out.println("o vetor invertido vai ser: ");
    for (int i = 0; i < vetorInvertidos.length; i++){
        System.out.print(vetorInvertidos[i] + " ");
    }
    System.out.println();
 }    
}