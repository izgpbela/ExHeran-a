package heranca;

public class AnimalTeste {
	    public static void main(String[] args) {
	        Cachorro cachorro = new Cachorro();
	        cachorro.setNome("Rex");
	        System.out.println(cachorro.caminha()); 
	        System.out.println(cachorro.late());  

	        Gato gato = new Gato();
	        gato.setNome("Mia");
	        System.out.println(gato.caminha());    
	        System.out.println(gato.mia());        
	    }
	}



