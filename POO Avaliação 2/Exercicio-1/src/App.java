import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio 1 Figuras:");

        List<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo("vermelho",0,0,5));
        figuras.add(new Retangulo("azul",1,1,4,6));
        figuras.add(new Triangulo(2,2,2,3,"preto"));
    
        for (Figura f: figuras) {
            f.desenharFigura();
        
        }


    }
}
