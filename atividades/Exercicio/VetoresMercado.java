package atividades.Exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class VetoresMercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (lista.size() < 20) {
            System.out.print("O que você quer adicionar na lista de compras: ");
            String item = sc.nextLine().trim();

            if (lista.contains(item)) {
                System.out.println("Esse item já está na lista, escolha outro.");
            } else {
                lista.add(item);
                Collections.sort(lista);
                System.out.println("Lista atual: " + lista);
            }

            if (lista.size() >= 10) {
                System.out.print("Você quer colocar mais algum item nessa lista? (s/n): ");
                String continuar = sc.nextLine().trim().toLowerCase();
                if (!continuar.equals("s")) {
                    break;
                }
            }
        }

        System.out.println("\nLista final de compras: " + lista);
        sc.close();
    }
}