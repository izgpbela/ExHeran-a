package heranca;

import java.util.Date;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;
    private Date dataAniversario;

    public ContaPoupanca(String titular, double saldoInicial, double taxaDeJuros, Date dataAniversario) {
        super(titular, saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
        this.dataAniversario = dataAniversario;
    }

    public double calculaRendimentos() {
        double rendimentos = getSaldo() * (taxaDeJuros / 100);
        deposito(rendimentos);  
        return rendimentos;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Taxa de Juros: " + taxaDeJuros + "% ao ano");
        System.out.println("Data de Aniversário: " + dataAniversario);
    }
}
