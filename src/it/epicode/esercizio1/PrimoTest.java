package it.epicode.esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> parole = new HashSet<>();
        Set <String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci il numero di parole da inserire: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println("Inserisci una parola: ");
            String parola = scanner.nextLine();

            if(!parole.add(parola)) {
                paroleDuplicate.add(parola);
            }

        }
            System.out.println("Parole duplicate: " + paroleDuplicate);

            System.out.println("Numero di parole distinte: " + parole.size());

            System.out.println("Elenco delle parole distinte: " + parole);

            scanner.close();
    }
}
