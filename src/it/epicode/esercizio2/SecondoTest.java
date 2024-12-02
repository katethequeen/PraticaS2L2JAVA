package it.epicode.esercizio2;

import java.util.List;

public class SecondoTest {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> listaOrdinata = Esercizio2.generaListaOrdinata(n);
        System.out.println("Lista ordinata: " + listaOrdinata);

        List<Integer> listaInversa = Esercizio2.creaListaInversa(listaOrdinata);
        System.out.println("Lista con elementi in ordine inverso: " + listaInversa);

        System.out.println("Valori in posizioni pari: ");
        Esercizio2.stampaPosizioni(listaInversa, true);

        System.out.println("Valori in posizioni dispari: ");
        Esercizio2.stampaPosizioni(listaInversa, false);
    }
}
