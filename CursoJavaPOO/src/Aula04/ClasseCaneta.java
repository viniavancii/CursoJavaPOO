package Aula04;

public class ClasseCaneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;

	public ClasseCaneta(String modelo, float ponta, String cor) { //Metodo construtor
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public void status() {
		System.out.println("\nSobre a caneta:");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Tampada? " + this.tampada);
	}

}
