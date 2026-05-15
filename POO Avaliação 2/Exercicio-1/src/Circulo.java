class  Circulo extends Figura {

    double raio;

    public Circulo(String cor, double x, double y, double raio){
        super(cor,x,y);
        this.raio=raio;
    }

    @Override
    double calcularArea(){
        return 3.14 * raio * raio;
    }

    @Override

    void desenharFigura(){
        System.out.println("Circulo" + cor + "area" + calcularArea());
    }

    
}
