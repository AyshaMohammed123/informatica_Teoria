package MediaTeca;

public class Materiale extends Object{
    protected  String codice;
    protected String titolo;

    //public Materiale(String codice){}

    //il costruttore di default va perso(QULLO PRECEDENTE)

      //public Materiale(){
        //super();
      //} 

      // se il costruttore sa fare super, la classe non va in errore
      
      public Materiale(String codice, String titolo){
        super();
        this.codice = codice;
        this.titolo = titolo;
      }

      public Materiale(){
        super();
      }
}
