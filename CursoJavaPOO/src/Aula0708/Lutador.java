package Aula0708;

public class Lutador {
	// Atributos

	private String nome;
	private String nasc;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	// Metodos especiais

	public Lutador(String nome, String nasc, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nasc = nasc;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (this.peso < 52.2) {
			categoria = "Inválida";
		} else if (this.peso <= 70.3) {
			categoria = "Leve";
		} else if (this.peso <= 83.9) {
			categoria = "Medio";
		} else if (this.peso <= 120.2) {
			categoria = "Pesado";
		} else {
			categoria = "Inválida";
		}
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	// Metodos abstratos
	public void apresentar() {
		System.out.println("\nIT'S TIMEEEE!!!");
		System.out.println("Apresentando o lutador: " + this.getNome());
		System.out.println("Ele vem do(a) " + this.getNasc());
		System.out.println("Tem "+ this.getIdade() + " anos");
		System.out.println("Tem "+ this.getAltura() + "m de altura");
		System.out.println("Pesa " + this.getPeso() + " KG");
		System.out.println("Ganhou: " + this.getVitorias() + " lutas");
		System.out.println("Empatou: " + this.getEmpates() + " lutas");
		System.out.println("Perdeu: " + this.getDerrotas() + " lutas");	
	}

	public void status() {
		System.out.print("\n" + this.getNome());
		System.out.print(" é um peso " + this.getCategoria());
		System.out.print(" tem " + this.getVitorias() + " vitórias");
		System.out.print(", " + this.getEmpates() + " empates");
		System.out.print(" e " + this.getDerrotas() + " derrotas");	
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
}