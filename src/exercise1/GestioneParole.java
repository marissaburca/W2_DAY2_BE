package exercise1;

import java.util.*;

public class GestioneParole {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Type a number of words: ");
        int N = Integer.parseInt(userInput.nextLine());


        Set<String> words = new HashSet<>(); //conterrà tutte le parole inserite da utente
        Set<String> duplicateWords = new HashSet<>();// conterrà solo le parole duplicate

        //faccio un ciclo e gli dico 'metti la parola i+1 (1,2,3,4...) e word è ciò che inserisce
        for (int i = 0; i < N; i++) {
            System.out.print("Type word " + (i + 1) + ": ");
            String word = userInput.nextLine();

            /*
            example.add(examp) => restituisce un boolean!!!
            !parole.add(parola) nega il risultato di parole.add(parola). "Ribalta" il ture e il false
            Quindi, se la parola è già presente in parole, questa condizione diventa true.
             */
            if (!words.add(word)) { //deve restituire true affinché venga messa nei duplicati
                duplicateWords.add(word);
            }
        }

        userInput.close();

        System.out.println("\nDuplicate words:");
        for (String word : duplicateWords) {
            System.out.println(word);
        }

        System.out.println("\nNumero di parole distinte: " + words.size());

        System.out.println("\nElenco delle parole distinte:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

