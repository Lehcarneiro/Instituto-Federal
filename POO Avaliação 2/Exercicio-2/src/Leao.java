 class Leao extends Animal implements Comportamento{

    public Leao(String nome){
        super(nome, "Leao");
    }

    @Override
    public void emitirSom(){
        System.out.println(nome +" Rugindo");
    }

    @Override
    public void mover(){
        System.out.println(nome+ " Correndo");
    }
    
    @Override
    public void dormir(){
        System.out.println(nome+ " Dormindo");
    }
}
