package heranca;


public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 3000.0);
        funcionario.addAumento(500);
        funcionario.exibeDados();
        
        System.out.println("-----");

        Tecnico tecnico = new Tecnico("Maria", 4000.0, "T123", 1000.0);
        tecnico.exibeDados();
        
        System.out.println("-----");

        Administrativo administrativo = new Administrativo("Carlos", 3500.0, "A456", "noite", 500.0);
        administrativo.exibeDados();

        System.out.println("-----");

        Administrativo administrativoDia = new Administrativo("Ana", 3500.0, "A789", "dia", 500.0);
        administrativoDia.exibeDados();
    }
}
