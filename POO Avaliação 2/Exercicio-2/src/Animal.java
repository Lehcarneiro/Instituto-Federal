abstract class Animal {

    String nome;
    String especies;

    public Animal(String nome, String especies){
        this.nome=nome;
        this.especies=especies;

    }

    public String getNome(){
        return nome;
    }

    public String getEspecies() {
        return especies;
    }
    
}
