//Scrivere una classe Java che permetta di gestire una rubrica telefonica.
// La lista dei contatti è realizzata mediante una HashMap in cui le chiavi
// sono i nomi delle persone e i valori sono i numeri di telefono.
// Realizzare i metodi per:
// 1. L'inserimento di una coppia <Nome, telefono>
// 2. La cancellazione di una coppia <Nome, telefono> a partire dal nome
// 3. La ricerca di una Persona di cui si conosce il numero di telefono
// 4. La ricerca del numero di telefono di una Persona di cui si conosce il Nome
// 5. La stampa di tutti i contatti con nome e numero

package it.epicode.esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Esercizio3 {
    private Map<String, String> rubrica;

    public Esercizio3() {
        rubrica = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
    }

    public void rimuoviContatto(String nome) {
        rubrica.remove(nome);
    }

    public String cercaPersonaPerNumero(String telefono) {
        for(Map.Entry <String , String> entry: rubrica.entrySet()) {
            if(entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String cercaNumeroPerNome(String nome) {
        return rubrica.get(nome);
    }

    public void stampaRubrica() {
        for(Map.Entry<String, String> entry: rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }

}
