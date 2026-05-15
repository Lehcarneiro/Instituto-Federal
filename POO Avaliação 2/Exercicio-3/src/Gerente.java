class Gerente extends Funcionario implements Salario{

    public Gerente(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }
    @Override
    public double calcularSalario(){
        return salario+((20/100)*salario);
    }

    @Override
    public void exibirDados(){
        System.out.println("O Gerente " +nome+ " com o CPF " +cpf + " recebe " +calcularSalario() );
    }
}