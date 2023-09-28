package ItemTema;

public class ConstrutorItemTema {

	public static void main(String[] args) {
		
		ItemTema ItemTema1 = new ItemTema(1,"Fael","Caneta");
		
		System.out.println(ItemTema1.getId());
		System.out.println(ItemTema1.getNome());
		System.out.println(ItemTema1.getDescricao());

	}

}
