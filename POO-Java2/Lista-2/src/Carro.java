public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro(){

    }

    public Carro(String marca, String modelo, int ano, double velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }


    //get
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public double getVelocidade(){
        return velocidade;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    //set
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public void acelerar(int valor){
        this.velocidade += valor;
    }
    public void frear(int valor){
        this.velocidade -= valor;
    }

    public void mostrarDados(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ano: "+getAno());
        System.out.println("Velocidade: "+getVelocidade()+" km/h");
    }


}
