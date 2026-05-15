import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Zoologico: " );

        List<Comportamento> animais = new ArrayList<>();

        animais.add(new Leao("Simba"));
        animais.add(new Aguia("Zeus"));
        animais.add(new Golfinho("Blue"));
        animais.add(new Leao("Mufasa"));

        for(Comportamento a : animais){
            a.emitirSom();
            a.mover();
            a.dormir();
            System.out.println("---------");
        }
    }
}
