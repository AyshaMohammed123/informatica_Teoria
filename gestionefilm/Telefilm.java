package gestionefilm;

public class Telefilm {
    private String nome;
    private String genere; 
    private boolean inCorso;
    private Stagione[] stagioni;

    public Telefilm(){
        this.nome = "";
        this.genere = "";
        this.inCorso = false;
        this.stagioni = null;
    }

    public Telefilm(String nome, String genere, boolean inCorso, Stagione[] stagioni) throws Exception {
        setNome(nome);
        setGenere(genere);
        setInCorso(inCorso);
        setStagioni(stagioni);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {  
    if (nome != null && !nome.equals("")) { 
        this.nome = nome;
    } else { 
        throw new Exception("Il telefilm deve avere un nome");
    }
}

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere)throws Exception {
        if(genere != null && !genere.equals("")){
        this.genere = genere;}
        else{
            throw new Exception("deve avere un nome");
        }
        
    }

    public boolean isInCorso() {
        return inCorso;
    }

    public void setInCorso(boolean inCorso) {
        this.inCorso = inCorso;
    }

    public Stagione[] getStagioni() {
        return stagioni;
    }

    public void setStagioni(Stagione[] stagioni) throws Exception{
         if (stagioni != null) {
            this.stagioni = stagioni;
        }
        else{
            throw new Exception("non puo essere vuoto");
        }
    }

    public double calcolaMediaEpisodi() {
        if (stagioni == null) {
            return 0;
        } else{
             int somma = 0;
            for (int i = 0; i < stagioni.length; i++){
                somma = somma + stagioni[i].getNumEpisodi();
            }
            return somma / stagioni.length;
        }
    }

    public boolean PresenteSceneggiatore(String nomeSceneggiatore){
        if(stagioni == null){
            return false;
        } for (int i = 0; i < stagioni.length; i++) {
            if (stagioni[i].getscenneggiatore().equals(nomeSceneggiatore)){
                return true;
                }
            }
         return false;
    }

    public void ordinaStagioni() {
        if (stagioni == null) {
            return;
        }

        for (int i = 0; i < stagioni.length - 1; i++) {
            for (int j = 0; j < stagioni.length - 1; j++) {
                if (stagioni[j].getNumStagione() > stagioni[j+1].getNumStagione()) {
                    Stagione temp = stagioni[j];
                    stagioni[j] = stagioni[j+1];
                    stagioni[j+1] = temp;
                }
            }
        }
    }

     @Override
    public String toString() {
        String testoStagioni = "";
        if (stagioni != null) {
            for (int i = 0; i < stagioni.length; i++) {
                testoStagioni = testoStagioni + "\n  " + stagioni[i].toString();
            }
        }
        return "Nome: " + nome + " | Genere: " + genere + " | In Corso: " + inCorso + testoStagioni;
    }

    
}
