package Aula03;

public class ClasseCaneta {
	public String cor;
	public String modelo;
	private float ponta;
	protected int carga;
	private boolean tampada; // Atributo privado, porém pode ser usado em um método para ser exibido, visto
								// que o método e o atributo estão na mesma classe

	public void status() {
		System.out.println("\nModelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Não posso rabiscar, estou tampada");
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
