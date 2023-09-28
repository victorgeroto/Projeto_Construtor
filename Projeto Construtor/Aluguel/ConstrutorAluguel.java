package Aluguel;

public class ConstrutorAluguel {

	public static void main(String[] args) {
		Aluguel Aluguel1 = new Aluguel(1,"12/10/2023","23:00","03:00","20,00");
		
		System.out.println(Aluguel1.getId());
		System.out.println(Aluguel1.getDataFesta());
		System.out.println(Aluguel1.getHorarioInicio());
		System.out.println(Aluguel1.getHorarioTermino());
		System.out.println(Aluguel1.getValorCobrado());
	}

}
