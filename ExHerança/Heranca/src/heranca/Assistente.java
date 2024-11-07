package heranca;

public class Assistente extends Funcionario{
	private String numeroMatricula;

    public Assistente(String nome, double salario, String numeroMatricula) {
        super(nome, salario); 
        this.numeroMatricula = numeroMatricula;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibeDados() {
        super.exibeDados(); 
        System.out.println("Número de Matrícula: " + numeroMatricula);
    }
}