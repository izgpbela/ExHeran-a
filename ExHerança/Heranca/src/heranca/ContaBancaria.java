package heranca;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor para inicializar titular e saldo
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método de depósito
    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método de saque
    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    // Método de transferência
    public void transferencia(ContaBancaria outraConta, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            outraConta.deposito(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferência.");
        }
    }

    // Getter e Setter para o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para exibir os dados da conta
    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}
