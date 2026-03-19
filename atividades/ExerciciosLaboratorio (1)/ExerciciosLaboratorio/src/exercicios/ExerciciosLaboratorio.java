public class ExerciciosLaboratorio {

    public static void main(String args[]) {
        new ExerciciosLaboratorio(); //provoca executar o m�todo construtor a seguir
    }

    public ExerciciosLaboratorio() {  //m�todo construtor da classe principal
        double a[] = {20, 10, -10, 30, 40, 18}; //vetor de valores reais
        visualizaVetor("Vetor de valores reais", a);
        calcularSomaDosElementosPositivos(a);
        calcularSomaDosElementos(a);
        }

    private void visualizaVetor(String mensagem, double vet[]) {
        System.out.println(mensagem);
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + "  ||  ");
        }
        System.out.println();
    }

    private void calcularSomaDosElementos(double[] a) {
        double soma = 0;
        for (int i = 0; i < a.length; i++){
        }
        System.out.println("A soma de tods os elementos o vetor vale " + soma);
    }

    private void calcularSomaDosElementosPositivos(double vet[]) {
        double soma = 0;
        for (int i = 0; i<vet.length; i++){
           if(vet[i] >=0){
           soma += vet[i];
           }
        }
        System.out.println("A soma dos elementos positivos do vetor vale " + soma);
    }
}