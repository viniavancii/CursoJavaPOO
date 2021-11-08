package Aula02;

public class Aula02ClasseCaneta {
	String cor; // variavel = atributos da classe caneta
	String modelo;
	float ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.println("\nModelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Carga " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}

	void rabiscar() { // void = métodos da classe caneta
		if (this.tampada == true) {
			System.out.println("Não posso rabiscar, estou tampada");
		} else {
			System.out.println("Estou rabiscando");
		}
	}

	void tampar() {
		this.tampada = true; // this = referencia ao objeto que chamou, permite que o método acesse os
								// atributos (e método também) da propria instância --> Aula02.java --> c1 e c2
	}

	void destampar() {
		this.tampada = false;
	}
}
