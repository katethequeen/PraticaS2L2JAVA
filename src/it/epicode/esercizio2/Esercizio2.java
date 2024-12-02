//Scrivere una funzione che accetti un intero N e restituisca una lista ordinata di N interi casuali da 0 a 100.
// Scrivere una seconda funzione che accetti una lista e restituisca una nuova lista composta dagli elementi
// della prima lista seguiti dagli stessi elementi disposti in ordine inverso.
// Scrivere una terza funzione che accetti una lista ed un booleano: se il booleano è true stampa i valori in posizioni pari,
// altrimenti stampa i valori in posizioni dispari. Creare una main che utilizzi le tre funzioni.
// Utilizzare l'interfaccia List e l'implementazione ArrayList.

package it.epicode.esercizio2;

import java.util.*;

public class Esercizio2 {
    public static List<Integer> generaListaOrdinata(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < n; i++) {
            lista.add(random.nextInt(101));
        }

        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> creaListaInversa(List<Integer> lista) {
        List<Integer> listaInversa = new ArrayList<>(lista);
        Collections.reverse(listaInversa);
        return listaInversa;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        for(int i = 0; i < lista.size(); i++) {
            if(pari && i % 2 == 0) {
                System.out.println(lista.get(i) + " ");
            } else if(!pari && i % 2 != 0) {
                System.out.println(lista.get(i) + " ");
            }
        }
        System.out.println();
    }
}
