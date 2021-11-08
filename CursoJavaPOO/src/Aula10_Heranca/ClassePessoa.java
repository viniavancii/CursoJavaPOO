package Aula10_Heranca;

public class ClassePessoa {
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

	public String detalhes() {
		return "ClassePessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public void fazerAniver() {
		this.idade++;
	}
}
