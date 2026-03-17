public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(){

    }

    public Funcionario(String nome, int salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){

    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){

    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){

    }

    public void aumentarSalario(double percentual){
        this.salario += percentual/100 * salario;
         
    }
    public void aumentarSalario(double percentual, double bonus){
        this.salario += (percentual/100 * salario) + bonus;
         
    }
    

    
}
