package MediaTeca;

public class Libro extends Materiale{ // extends materiale = padre, il Libro è figlio
    String autore; // visibilità livello package
    // con protective accedo agli attributi
    // i PARAMETRI del costruttore mandano in errore

    // è errore se facendo super non viene fatto

    public Libro(String codice, String titolo, String autore){
        super(codice, titolo); // non riusciva a fare il super finchè non vennero aggiunte le parti in materiali
        this.autore = autore;
        this.titolo = titolo;
    }

    @Override 
    public String descrizione(){
        return super.descrizione()+" - "+autore;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+", autore"+ autore;
    }



}

//tutte le classi ereditano da object. Si mette sempre super()
// si può modificare il padre
// SEMPRE SUPER()
