package Cliente;

public class ConstrutorCliente {

	public static void main(String[] args) {
		Cliente Cliente1 = new Cliente(1,"PEDRO","15997557654","100.131.253-12","3445353587");
		
		System.out.println(Cliente1.getId());
		System.out.println(Cliente1.getNome());
		System.out.println(Cliente1.getFone());
		System.out.println(Cliente1.getCpf());
		System.out.println(Cliente1.getRg());
	}

}