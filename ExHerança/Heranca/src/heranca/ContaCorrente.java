package heranca;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, double saldoInicial, double limiteChequeEspecial) {
        super(titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void saque(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limiteChequeEspecial)) {
            super.saque(valor);
        } else {
            System.out.println("Saldo insuficiente, incluindo o limite do cheque especial.");
        }
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Limite de Cheque Especial: R$ " + limiteChequeEspecial);
    }
}
