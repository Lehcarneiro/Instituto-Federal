class Horista extends  Funcionario implements  Salario {

    double horasTrabalhadas;
    double valorHora;


    public Horista(String nome, String cpf, double salario, double horasTrabalhadas,double valorHora){
        super(nome, cpf, salario);
        this.horasTrabalhadas=horasTrabalhadas;
        this.valorHora=valorHora;
    }

    @Override
    public double calcularSalario(){
        return salario = valorHora * horasTrabalhadas;
    }

    @Override
    public void exibirDados(){
        System.out.println("O funcionario horista " +nome+ " com o CPF " +cpf + " recebe " +calcularSalario() );
    }
    
}
