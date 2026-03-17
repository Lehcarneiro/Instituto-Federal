
import java.util.ArrayList;



public class App {

    public static void Exercicio1 () {
        Produto p1 = new Produto("Picanha", 75.90f, 20);
        Produto p2 = new Produto("Brahma Lata", 4.25f, 50);
        p1.setPreco(80.00f);
        p1.setQuantidade(10);
        System.out.println("Valor Total no Estoque: Produto 1: " + p1.valorTotalEstoque() + " Produto 2: " + p2.valorTotalEstoque());
        
    }

    public static void Exercicio2 () {
        Funcionario f1 = new Funcionario("Renan", 10000, "Engenheiro");
        f1.aumentarSalario(90);
        System.out.println("Salario aumentado para: " +f1.getSalario());
        f1.aumentarSalario(90, 4000);
        System.out.println("Salario aumentado para: " +f1.getSalario());

    }

    public static void Exercicio3(){
        ContaBancaria c1 = new ContaBancaria(0207, "Letícia", 10000 );
        c1.depositar(5000);
        c1.sacar(2);
        System.out.println("Saldo na conta: " +c1.consultarSaldo());

    }

     public static void Exercicio4(){
        Aluno a1 = new Aluno("Maria", 2020, 5.05, 6.08);
        System.out.println("Situação : " + a1.situacao());

    }

     public static void Exercicio5(){
        Calculadora calculo = new Calculadora();

        System.out.println("Soma de 2 inteiros: " + calculo.somar(5, 10));
        System.out.println("Soma de 2 doubles: " + calculo.somar(5.5, 10.5));
        System.out.println("Soma de 3 inteiros: " + calculo.somar(5, 10, 15));


    }

     public static void Exercicio6(){
        
        Aluno[] alunos = new Aluno[2];
        for(int i = 0; i < alunos.length; i++){
            alunos[i] = new Aluno();
            alunos[i].cadastrarAluno();
        }
        System.out.println("Alunos cadastrados: ");
        for(int i=0; i < alunos.length; i++){
            alunos[i].mostrarDados();
        }

    }

     public static void Exercicio7(){
            ArrayList<Livro> listaLivros = new ArrayList<Livro>();
            listaLivros.add(new Livro("A Corte de Espinhos e Rosas", "Sarah J. Maas", 2015) );
            listaLivros.add(new Livro("A Hipótese do Amor", "Ali Hazelwood", 2022) );
            listaLivros.add(new Livro("O Código Da Vinci", "Dan Brown", 2000) );
            listaLivros.add(new Livro("A Arte da guerra", "Sun Tzu", 1519) );
            listaLivros.add(new Livro("as memorias postumas de brás cubas", "Machdo de Assis", 1881) );
        
        for (Livro livro: listaLivros){
            livro.exibirDados();
        }

    }
    
     public static void Exercicio8(){
        Carro carro1 = new Carro("Citroen", "C3", 2015, 100);
        Carro carro2 = new Carro("Fiat", "Palio", 2006, 60);


        carro1.acelerar(15);
        carro2.acelerar(12);

        carro1.frear(5);
        carro2.frear(2);

        carro1.mostrarDados();
        carro2.mostrarDados();


    }


    public static void main(String[] args) throws Exception {
        //Exercicio1();
        //Exercicio2();
        //Exercicio3();
        //Exercicio4();
        //Exercicio5();
        //Exercicio6();
        //Exercicio7();
        Exercicio8();


    }
}
