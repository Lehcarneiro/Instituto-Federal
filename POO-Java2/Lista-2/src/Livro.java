public class Livro {
    
    private String titulo;
    private String autor;
    private int ano;

    public Livro(){

    }

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;

    }

    //getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return ano;
    }

    //setters

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;

    }

    public void setAno(int ano){
        this.ano = ano;

    }

    public void exibirDados(){
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Ano de publicação: "+getAno());

    }


}
