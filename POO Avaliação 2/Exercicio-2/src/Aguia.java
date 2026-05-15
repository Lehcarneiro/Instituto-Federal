class Aguia extends Animal implements Comportamento{

    public Aguia(String nome){
        super(nome, "Aguia");
    }
    @Override
    public void emitirSom(){
        System.out.println(nome+" piando");
    }
    @Override
    public void mover(){
        System.out.println(nome+" Voando");
    }

    @Override
    public void dormir(){
        System.out.println(nome+" Dormindo nas alturas");
    }
}