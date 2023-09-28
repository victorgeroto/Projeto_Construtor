package Cliente;

public class Cliente {
	private long id;
	private String nome;
	private String fone;
	private String cpf;
	private String rg;
	
	public Cliente(long id, String nome, String fone, String cpf, String rg) {
		
		this.id = id;
		this.nome = nome;
		this.fone = fone;
		this.cpf = cpf;
		this.rg = rg;
		
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
}
