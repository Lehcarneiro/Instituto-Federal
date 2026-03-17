
import java.util.Scanner;

public class Aluno {
    
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    public Aluno(){

    }

    public Aluno(String nome, int matricula, double nota1, double nota2){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;

    }
    //getters

    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    //setters

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;

    }

    public void setNota1(double nota1){
        this.nota1 = nota1;

    }

    public void setNota2(double nota2){
        this.nota2 = nota2;

    }

    public double calcularMedia(){
        return (nota1 + nota2)/2;
    }

    public String situacao(){
        if(calcularMedia() >= 6){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }

    public void cadastrarAluno(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        setNome(sc.nextLine());
        System.out.println("Digite a matrícula do aluno: ");
        setMatricula(sc.nextInt());
        System.out.println("Digite a nota 1 do aluno: ");
        setNota1(sc.nextDouble());
        System.out.println("Digite a nota 2 do aluno: ");
        setNota2(sc.nextDouble());
        
    }

    public void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nota 1: " + getNota1());
        System.out.println("Nota 2: " + getNota2());
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + situacao());
    }

}
