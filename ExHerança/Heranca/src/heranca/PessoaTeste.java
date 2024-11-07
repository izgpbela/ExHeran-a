package heranca;

public class PessoaTeste {
	    public static void main(String[] args) {
	    	
	        Rica rica = new Rica("João", 30, 10000.0);
	        System.out.println(rica.getNome() + ", idade: " + rica.getIdade() + " - Rica");
	        System.out.println("Faz compras!");  

	        Pobre pobre = new Pobre("Maria", 40);
	        System.out.println(pobre.getNome() + ", idade: " + pobre.getIdade() + " - Pobre");
	        System.out.println("Trabalha!");  

	      
	        Miseravel miseravel = new Miseravel("José", 50);
	        System.out.println(miseravel.getNome() + ", idade: " + miseravel.getIdade() + " - Miserável");
	        System.out.println("Mendiga!");   
	    }
	}
