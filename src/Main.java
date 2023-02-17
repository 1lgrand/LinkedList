import java.util.Scanner;

public class Main {

    //TODO: Ricerca,Inserimento in mezzo, rimozione in mezzo, ordinamento

    public static void menu(){

        System.out.println("==================================");
        System.out.println("\t <1> Aggiungi elemento: ");
        System.out.println("\t <2> Rimuovi elemento: ");
        System.out.println("\t <3> Stampa lista: ");
        System.out.println("\t <4> Svuota lista: ");

    }

    public static void main(String[] args) {

        Lista list = new Lista();
        Scanner in = new Scanner(System.in);
        int scelta = 0;

        do {

            try {
                menu();
                scelta = in.nextInt();
            }catch (Exception e){
                System.out.println("Qualcosa è andato storto!");
            }


            switch (scelta){
                case 1:
                    System.out.println("Che numero vuoi inserire? ");
                    int n = in.nextInt();
                    list.enqueue(n);
                    System.out.println("Elemento aggiunto con successo");
                    break;

                case 2:

                    list.dequeue();
                    break;
                case 3:
                    list.stampa();
                    break;

                case 4:
                    list.svuotaLista();
                    break;

                case 0:
                    System.out.println("FINE!");
                    break;
                default:
                    System.out.println("Errore");
            }

        }while (scelta != 0);

    }
}