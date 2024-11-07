package heranca;
import java.util.Date;

public class ContaTeste {
    public static void main(String[] args) {

    	ContaCorrente contaCorrente = new ContaCorrente("Ana", 1500.0, 1000.0);
        contaCorrente.exibirDados();
        contaCorrente.deposito(500.0);  
        contaCorrente.saque(200.0);     
        contaCorrente.saque(3000.0); 
        contaCorrente.transferencia(new ContaBancaria("João", 1000.0), 200.0); 
        contaCorrente.exibirDados();    

        System.out.println("\n-----------------------------\n");

        Date dataAniversario = new Date();  
        ContaPoupanca contaPoupanca = new ContaPoupanca("Carlos", 2000.0, 5.0, dataAniversario);
        contaPoupanca.exibirDados();
        double rendimentos = contaPoupanca.calculaRendimentos(); 
        System.out.println("Rendimentos adicionados: R$ " + rendimentos);
        contaPoupanca.saque(100.0);  
        contaPoupanca.transferencia(new ContaBancaria("Maria", 500.0), 200.0); 
    }
}



