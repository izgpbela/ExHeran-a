package heranca;

public class Tecnico extends Assistente{
	private double bonusSalarial;

    public Tecnico(String nome, double salario, String numeroMatricula, double bonusSalarial) {
        super(nome, salario, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return (getSalario() * 12) + bonusSalarial;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Bônus Salarial: " + bonusSalarial);
    }
}


