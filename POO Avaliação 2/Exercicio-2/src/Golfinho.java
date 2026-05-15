 class Golfinho extends Animal implements Comportamento {

    public Golfinho(String nome){
        super(nome,"Golfiinho");

    }
    @Override
    public void emitirSom(){
        System.out.println(nome +" fazendo sons de clique");
    }

    @Override
    public void mover(){
        System.out.println(nome+ " Nadando");
    }

    @Override
    public void dormir(){
        System.out.println(nome+ " dormindo parcialmente na água");
    }
    
}
