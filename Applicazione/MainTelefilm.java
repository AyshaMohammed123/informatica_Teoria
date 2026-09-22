package Applicazione;
import java.util.Scanner;

import gestionefilm.Stagione;
import gestionefilm.Telefilm;

public class MainTelefilm {
    public static void main(String[] args)throws Exception{
        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserisci il nome del telefilm");
        String nome = tastiera.nextLine();

        System.out.println("inserisci il genere");
        String genere = tastiera.nextLine();

         System.out.print("La produzione è in corso?si o no");
        boolean inCorso = tastiera.nextBoolean();

        System.out.print("Quante stagioni contiene?: ");
        int numeroStagioni = tastiera.nextInt();
        tastiera.nextLine();

        Stagione[] elencoStagioni = new Stagione[numeroStagioni];

        for (int i = 0; i < numeroStagioni; i++) {
            System.out.println("aggiunta stagione " + (i + 1) );
            
            System.out.print("Numero stagione : ");
            int numStagione = tastiera.nextInt();

            System.out.print("Numero episodi: ");
            int numEpisodi = tastiera.nextInt();
            tastiera.nextLine();

            System.out.print("Sceneggiatore: ");
            String sceneggiatore = tastiera.nextLine();
            
            System.out.print("Trama: ");
            String trama = tastiera.nextLine();

            Stagione s = new Stagione();
            s.setNumStagione(numStagione);
            s.setNumEpisodi(numEpisodi);
            s.settrama(trama);
            s.setscenneggiatore(sceneggiatore);
        
            elencoStagioni[i] = s;

            Telefilm nuovoTelefilm = new Telefilm();
            nuovoTelefilm.setNome(nome);
            nuovoTelefilm.setGenere(genere);
            nuovoTelefilm.setInCorso(inCorso);
            nuovoTelefilm.setStagioni(elencoStagioni);

        }
        }
    }
}