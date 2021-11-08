package Aula09;

public class ClassePessoa {
	private String nome;
	private int idade;
	private String sexo;
	

	//Metodo construtor
	public ClassePessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	

	//Metodos acessores
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



	//Metodo especial
	public void fazerAniver() {
		this.setIdade(this.getIdade() + 1);
	}
	
	
}
