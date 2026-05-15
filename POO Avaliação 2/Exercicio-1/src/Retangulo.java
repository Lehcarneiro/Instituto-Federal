 class Retangulo extends Figura {

    double altura;
    double largura;

    public Retangulo(String cor, double x, double y, double altura, double largura){
        super(cor,x,y);
        this.altura=altura;
        this.largura=largura;
    }
    @Override
    double calcularArea(){
        return largura * altura;
    }
    
    @Override
    void desenharFigura(){
        System.out.println("Retangulo"+cor+"Area:"+calcularArea());
    }
}
