package gestionefilm;

public class Stagione {
    private int NumEpisodi;
    private int NumStagione;
    private String trama;
    private String sceneggiatore;

    public Stagione(){
        this.NumEpisodi = 0;
        this.sceneggiatore = "";
        this.trama = "";
        this.NumStagione = 0;
    }

    public void setNumEpisodi (int NumEpisodi)throws Exception{
        if (NumEpisodi > 0){
            this.NumEpisodi = NumEpisodi;
        
        } else{
            throw new Exception("devono esserci più di 0 episodi");
            
        }
    }

    public void setNumStagione(int NumStagione)throws Exception{
        if(NumStagione > 0){
            this.NumStagione = NumStagione;
        }else{
            throw new Exception("devono esserci più di 0 episodi");
        }
    }

    public void settrama (String trama){
        this.trama = trama;
    }

    public void setscenneggiatore(String sceneggiatore) {
        this.sceneggiatore = sceneggiatore;
    }
    

    public  int getNumEpisodi(){
        return NumEpisodi;
    }

    public  int getNumStagione(){
        return NumStagione;
    }

    public  String gettrama(){
        return trama;
    }

    public  String getscenneggiatore(){
        return sceneggiatore;
    }

     @Override
    public String toString() {
        return "Stagione " + NumStagione + " [Episodi: " + NumEpisodi + 
               ", Sceneggiatore: " + sceneggiatore + ", Trama: " + trama + "]";
    }
}

