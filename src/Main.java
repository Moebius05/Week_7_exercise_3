import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FileReader reader   =   new FileReader();
        List<String> rawthing   =   reader.getLines("Datei_mit_Zahlen.txt");
        List<Integer>newthing = new ArrayList<>();
        for (int i = 0; i < rawthing.size(); i++){
            newthing.add(Integer.parseInt(rawthing.get(i)));
        }

        System.out.println(newthing);
        int kern            =   newthing.get(0);
        int größteZahl     =   kern;
        int kleinsteZahl    =   kern;

        for (int i = 0; i < newthing.size(); i++){
            if (newthing.get(i)<kleinsteZahl)   {kleinsteZahl   =   newthing.get(i);}
            if (newthing.get(i)>größteZahl)    {größteZahl    =   newthing.get(i);}

        }
        System.out.println("Die kleinste Zahl in der Datei ist "    + kleinsteZahl);
        System.out.println("Die größte Zahl in der Datei ist "     + größteZahl);

    }
}
