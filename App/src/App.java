public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ola mundo java com o VS code!");
        double a = 3, b = 6;
        System.out.println("A soma vale " + (a + b));
        // vamos criar alguns objetos da classe trabalhador
        trabalhador t1 = new trabalhador(21, "Ariana Grande ", 1200, 'f');
        trabalhador t2 = new trabalhador(30, "João Silva", 2500, 'm');
        trabalhador t3 = new trabalhador(28, "Maria Santos", 2000, 'f');
        trabalhador t4 = new trabalhador(35, "Pedro Oliveira", 3000, 'm');

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
    }
}
