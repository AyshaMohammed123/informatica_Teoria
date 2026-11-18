package MediaTeca;

public class Libro extends Materiale{ // extends materiale = padre, il Libro è figlio
    String autore; // visibilità livello package
    // con protective accedo agli attributi
    // i PARAMETRI del costruttore mandano in errore

    // è errore se facendo super non viene fatto

    public Libro(String codice, String titolo, String autore){
        super(codice, titolo); // non riusciva a fare il super finchè non vennero aggiunte le parti in materiali
        this.autore = autore;

    }
    public Libro(){

    }
    
}

//tutte le classi ereditano da object. Si mette sempre super()
// si può modificare il padre
// SEMPRE SUPER()
