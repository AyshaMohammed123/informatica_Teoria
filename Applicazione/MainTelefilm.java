package Applicazione;

public class MainTelefilm {

    private int NumEpisodi;
    private int NumStagione;
    private String trama;
    private String sceneggiatore;

    public Stagione(){

    }

    public void setNumEpisodi (int NumEpisodi)throws Exception{
        if (NumEpisodi >= 0){
            this.NumEpisodi = NumEpisodi;
        
        } else{
            throw new Exception("devono esserci più di 0 episodi");
            
        }
    }

    public void setNumStagione(int NumStagione)throws Exception{
        if(NumStagione >= 0){
            this.NumStagione = NumStagione;
        }else{
            throw new Exception("devono esserci più di 0 episodi");
        }
    }

    public void settrama (String trama){

    }

    public void setscenneggiatore(String scanneggiatore){

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
}
