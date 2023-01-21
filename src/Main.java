import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("IF Condizioni: ");

        /*
         * Condizioni con IF:
         *
         * - if (vuol dire se)
         *
         * - else
         *
         * - else if
         *
         * - if annidati
         *
         * - ternary operator
         */

        // IF:

        boolean isOnline = true; // Condizione che dice che la persona è online
        if (isOnline) {
            System.out.println("è online! \n"); // stamperebbe è online
        }
        // boolean isOnline = false; //Condizione che dice che la persona non è online--> non darebbe risultato
        /* if (!isOnline){ // mettendo la condizione diverso davanti--> Stamperebbe on è online
            System.out.println("non è online? ");
        }*/

        if (3 < 10) { /* IF sono blocchi di codice che vengono eseguiti se la condizione è verificata,
                         se non è verificata il programma si interrompe--> come vediamo in questo esempio
                         dopo la prima stampa il programma prosegue con la seconda stampa che mettiamo
                         in esecuzione */
            System.out.println("La condizione è giusta");
        }
        System.out.println("Andiamo avanti col programma\n");

        /*-----------------------------------------------------------------------------------------------------------------*/

        // IF - ELSE IF - ELSE:

        Scanner scanner= new Scanner(System.in); // Richiamo classe scanner

        System.out.println("Inserire un numero: "); // Chiediamo all'utente di inserire un numero
        int numeroNostro = scanner.nextInt(); // Scanner inserimento dati (interazione utente)

        if (numeroNostro <=5) { // Immettiamo la condizione= if gestirà qualsiasi numero da 0 a 5 compreso
            System.out.println("Corretto primi numeri!");
        } //FINE IF
        else if (numeroNostro == 6) { // Else if gestirà il numero 6
            System.out.println("Corretto secondi numeri!");

        } // FINE ELSE IF
        else{ /* Else gestirà tutti i numeri da 7 in su senza dover aggiungere condizioni se non è compreso
                 in if gestirà cmq tutto il resto dei numeri */
            System.out.println("Non corretto! ");
        } // FINE ELSE E FINE PROGRAMMA

        /*----------------------------------------------------------------------------------------------------------------*/

        // IF ANNIDATI: + ELSE

        System.out.println("Inserisci un numero");
        int numeroDaValutare = scanner.nextInt(); // Numero che l'utente deve inserire
        if (numeroDaValutare < 10){ // Condizione numero minore di 10 non compreso
            System.out.println("è minore di 10");
            if (numeroDaValutare % 2 == 0){ // Condizione numero pari all'interno tra 0 e 8
                System.out.println("il numero inserito è pari");
            }else { // Condizione numero dispari all'interno tra 0 e 9
                System.out.println("è dispari! ");
            }
        }else{ // Condizione numero più grande di 10 compreso
            System.out.println("non è minore di 10");
        } // FINE PROGRAMMA

        /*-----------------------------------------------------------------------------------------------------------------*/

        // TERNARY OPERATOR:

        // numero 3 condizione      vera           falsa
        String numeroMagico= 3 < 10 ? "Corretto" : " Non correto!";
        /* il primo numero 3 in questo caso, sarà la condizione per true o false Quindi dopo ? se si verifica
           la condizione vera--- dopo : quando si verifica quella falsa */
        System.out.println(numeroMagico);

    }
}