
public class Utente {
	private String nome;
	private String etaria;
	private String familia;
	

	public Utente(String nome, String etaria) {
		this.nome = nome;
		this.etaria = etaria;
		this.familia = "";
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

//	@Override
	public String toString() {
		return familia + " " + etaria + " " + nome.replace("_", " ");
	}

	public String getNome() {
		return nome;
	}

	public String getEtaria() {
		return etaria;
	}

	public String getFamilia() {
		return familia;
	}
	

}