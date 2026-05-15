import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Funcionarios de uma Empresa: ");

        List<Salario> funcionarios = new ArrayList<>();

        funcionarios.add(new CLT("Ada Wong", "958.346.761-00", 8900 ));
        funcionarios.add(new CLT("Roberto Diaz", "128.832.047-54", 5000 ));
        funcionarios.add(new Gerente("Julia Silva", "023.565.478-61", 5000 ));
        funcionarios.add(new Estagiario("Leon Kenndy", "567.127.678-14",700,2 ));
        funcionarios.add(new Horista("Wesker", "324.815.244-89",0, 160,18));
    
        for(Salario f : funcionarios){
            f.exibirDados();
            System.out.println("---------");
        }
    }
}
