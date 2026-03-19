public class OrdenarVetorString {
    private String paises[] = { "México", "Brasil", "Cuba", "Chile", "Argentina", "Espanha" };
    private String pessoas[] = { "Pedro", "Valéria", "Ana", "Luiz", "Zoe", "Miguel" };

    public static void main(String[] args) {
        OrdenarVetorString ordenador = new OrdenarVetorString();
        ordenador.ordenar(ordenador.paises);
        ordenador.visualizarVetorDeString(ordenador.paises);
    }

    public boolean ordenar(String vetor[]) {
        if (vetor == null) {
            return false;
        }
        for (int i = 0; i < vetor.length - 1; i++) {
            int trocar = 0;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j].compareTo(vetor[j + 1]) > 0) {
                    String temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocar++;
                }
            }
            if (trocar == 0) {
                break;
            }
        }
        return true;
    }

    public void visualizarVetorDeString(String vetor[]) {
        for (String item : vetor) {
            System.out.println(item + " ");
        }
        System.out.println();
    }
}
