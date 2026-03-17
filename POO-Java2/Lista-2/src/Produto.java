public class Produto {

    private String nome;
    private float preco;
    private int quantidade;

    public Produto(){ // construtor vazio
        
    }

    public Produto(String nome, float preco){ // construtor com parâmetros nome e preco
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, float preco, int quantidade){ // construtor com parâmetros nome preco e quantidade
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade () {
        return quantidade;
    }

    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }

    public float valorTotalEstoque(){
        return preco * quantidade;

    }

}
