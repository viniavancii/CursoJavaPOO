package Aula03;

public class ClasseCaneta {
	public String cor;
	public String modelo;
	private float ponta;
	protected int carga;
	private boolean tampada; // Atributo privado, por�m pode ser usado em um m�todo para ser exibido, visto
								// que o m�todo e o atributo est�o na mesma classe

	public void status() {
		System.out.println("\nModelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Est� tampada? " + this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("N�o posso rabiscar, estou tampada");
		} else {
			System.out.println("Estou rabiscando");
		}
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}
}
