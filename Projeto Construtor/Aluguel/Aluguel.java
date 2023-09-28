package Aluguel;

public class Aluguel {
	private long id;
	private String dataFesta;
	private String HorarioInicio;
	private String HorarioTermino;
	private String valorCobrado;
	
	public Aluguel(long id, String dataFesta, String horarioInicio, String horarioTermino, String valorCobrado) {
		
		this.id = id;
		this.dataFesta = dataFesta;
		HorarioInicio = horarioInicio;
		HorarioTermino = horarioTermino;
		this.valorCobrado = valorCobrado;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDataFesta() {
		return dataFesta;
	}

	public void setDataFesta(String dataFesta) {
		this.dataFesta = dataFesta;
	}

	public String getHorarioInicio() {
		return HorarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		HorarioInicio = horarioInicio;
	}

	public String getHorarioTermino() {
		return HorarioTermino;
	}

	public void setHorarioTermino(String horarioTermino) {
		HorarioTermino = horarioTermino;
	}

	public String getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(String valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	
	
}
