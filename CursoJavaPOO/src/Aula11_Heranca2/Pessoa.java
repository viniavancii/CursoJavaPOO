package Aula11_Heranca2;

public abstract class Pessoa { // N�o gera objetos
	private String nome;
	private int idade;
	private String sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public final void fazerAniver() {
		this.setIdade(this.getIdade() + 1);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
