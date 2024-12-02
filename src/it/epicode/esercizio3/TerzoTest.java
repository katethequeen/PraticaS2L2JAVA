package it.epicode.esercizio3;

import java.util.Scanner;

public class TerzoTest {
    public static void main(String[] args) {
        Esercizio3 rubrica = new Esercizio3();
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while(continua) {
            System.out.println("\nSeleziona un'opzione:");
            System.out.println("1. Aggiungi Contatto");
            System.out.println("2. Rimuovi Contatto");
            System.out.println("3. Cerca Persona per Numero");
            System.out.println("4. Cerca Numero per Nome");
            System.out.println("5. Stampa Rubrica");
            System.out.println("6. Esci");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci il nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Inserisci il numero di telefono:");
                    String telefono = scanner.nextLine();
                    rubrica.aggiungiContatto(nome, telefono);
                    break;
                case 2:
                    System.out.println("Inserisci il nome del contatto da rimuovere:");
                    nome = scanner.nextLine();
                    rubrica.rimuoviContatto(nome);
                    break;
                case 3:
                    System.out.println("Inserisci il numero di telefono:");
                    telefono = scanner.nextLine();
                    String persona = rubrica.cercaPersonaPerNumero(telefono);
                    if(persona != null) {
                        System.out.println("Il numero appartiene a: " + persona);
                    } else {
                        System.out.println("Nessuna persona trovata con questo numero!");
                    }
                    break;
                case 5:
                    System.out.println("Contatti nella rubrica: ");
                    rubrica.stampaRubrica();
                    break;
                case 6:
                    continua = false;
                    break;
                default:
                    System.out.println("Opzione non valida, riprova.");
                    break;
            }
        }
        scanner.close();    }
}
