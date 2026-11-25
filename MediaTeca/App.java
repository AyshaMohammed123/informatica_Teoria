package MediaTeca;

public class App extends Object{
    public static void main(String[] args) {
        Materiale m = new Materiale("C1", "OOP. no problem");
        System.out.println(m.descrizione());

        //Libro m = new Libro("C1", "titolo 1", "autore 1");

        Libro l = new Libro("C2", "eredietarietà", "Montini");
        System.out.println(l.descrizione());

        Materiale m1;
        m1 = new Libro("C3", "eredietarietà", "Montini");
        
        Object o;
        o = new Libro("C2", "eredietarietà", "Montini");

        System.out.println(m.toString());
        System.out.println(l.toString());
    }

}
