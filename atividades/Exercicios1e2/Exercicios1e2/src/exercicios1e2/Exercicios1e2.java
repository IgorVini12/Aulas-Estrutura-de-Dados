
/* Esse exericios monstra  como funciona a contagem de instruções
*/

public class Exercicios1e2 {

    public static void main(String[] args) {

        // Exerc�cio 1
        int q = 0;

        for (int j = 0; j < 4; j++) // aqui nós podemos conta p numerp de vezes o J foi usano no arrow (3 vezes) + ! para o Q=Q+1Q
            { q = q + 1;}

        System.out.println("No primeiro ciclo o comando q = q + 1 foi executado " + q + " vezes.");

        // Exerc�cio 2 (considere n > 0)
        int n = 5; // exemplo
        q = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    q = q + 1;
                }
            }
        } 
// o exercicio 2 foi executado 100 vezes por causa dos 3 loops FOR o externo executou 5 vezes (de 0 a 4 ) o medio 4 vezes de 1 a 4 e por fim o interno 5 vezes de novo  
        System.out.println("No 2� ciclo o comando q = q + 1 foi executado " + q + " vezes.");
    }
}

