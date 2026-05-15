abstract class Figura {

    String cor;
    double x;
    double y;

    public Figura(String cor, double x, double y) {
        this.cor = cor;
        this.x = x;
        this.y = y;
    }

    abstract double calcularArea();

    abstract void desenharFigura();

    public String getCor() {
        return cor;
    }

}
