
class CLT extends Funcionario implements Salario {
    
    public CLT(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    @Override
    public double calcularSalario(){
        return salario;
    }

    @Override
    public void exibirDados(){
        System.out.println("O funcionario CLT " +nome+ " com o CPF " +cpf + " recebe " +calcularSalario() );
    }
}
