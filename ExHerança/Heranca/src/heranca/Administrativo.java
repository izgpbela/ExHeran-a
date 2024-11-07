package heranca;

public class Administrativo extends Assistente {
    private String turno; 
    private double adicionalNoturno;

    
    public Administrativo(String nome, double salario, String numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        double salarioAnual = getSalario() * 12;
        if ("noite".equalsIgnoreCase(turno)) {
            salarioAnual += adicionalNoturno;
        }
        return salarioAnual;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Turno: " + turno);
        if ("noite".equalsIgnoreCase(turno)) {
            System.out.println("Adicional Noturno: " + adicionalNoturno);
        }
    }
}
