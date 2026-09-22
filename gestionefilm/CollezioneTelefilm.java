package gestionefilm;

public class CollezioneTelefilm {

    private Telefilm[] elenco;
    private int contatore;

    public CollezioneTelefilm(){
        this.elenco = new Telefilm[100];
        this.contatore = 0;
    }

    public CollezioneTelefilm(int grandezzaMax) {
        this.elenco = new Telefilm[grandezzaMax];
        this.contatore = 0;
    }

    public Telefilm[] getElenco() {
        return elenco;
    }

    public void setElenco(Telefilm[] elenco) {
        this.elenco = elenco;
    }

    public int getContatore() {
        return contatore;
    }

    public void setContatore(int contatore) {
        this.contatore = contatore;
    }

    public void aggiungiTelefilm(Telefilm t)throws Exception {
            if (contatore < elenco.length) {
                elenco[contatore] = t;
                contatore++; }
                else{
                    throw new Exception("è pieno, non puoi aggoungere altro");
                }
                
        }

        public void ordinaPerNome() {
    for (int i = 0; i < contatore - 1; i++) {
        for (int j = 0; j < contatore - 1; j++) {
            if (elenco[j] != null && elenco[j+1] != null) {
                
                // QUESTO controlla tutta la parola, la lunghezza e tutte le lettere!
                if (elenco[j].getNome().compareTo(elenco[j+1].getNome()) > 0) {
                    Telefilm temp = elenco[j];
                    elenco[j] = elenco[j+1];
                    elenco[j+1] = temp;
                }
                
            }
        }
    }
}

  @Override
    public String toString() {
        String risultato = "- COLLEZIONE TELEFILM -\n";
        for (int i = 0; i < contatore; i++) {
            risultato = risultato + elenco[i].toString() + "\n---------------------\n";
        }
        return risultato;
    }

}
