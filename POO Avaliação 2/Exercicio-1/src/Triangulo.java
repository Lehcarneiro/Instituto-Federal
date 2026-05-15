class Triangulo extends Figura {

    double base;
    double altura;

    public Triangulo(double base, double altura, double x, double y, String cor ){
        super(cor,x,y);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }

    @Override
    void desenharFigura(){
        System.out.println("Triangulo"+cor+"Area"+ calcularArea());
    }
   
    
}
