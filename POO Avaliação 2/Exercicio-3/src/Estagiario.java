class Estagiario extends Funcionario implements Salario {

    int faltas;

    public Estagiario(String nome, String cpf, double salario, int faltas){
        super(nome, cpf, salario);
        this.faltas=faltas;
    }

    @Override
    public double calcularSalario(){
        int diasMes= 30;
        double valorPorDia = salario/diasMes;
        double desconto = valorPorDia * faltas;
        return salario - desconto;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("O funcionário estagiário " +nome+ " com o CPF " +cpf + " recebe " +calcularSalario() );
    }

}
