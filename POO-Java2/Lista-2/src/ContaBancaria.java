public class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(){

    }

    public ContaBancaria(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

    public ContaBancaria(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
    }

    public double consultarSaldo(){
        return this.saldo;
    }

}
