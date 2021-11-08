package Aula02.Exercicio;

public class ClasseControle {
	String modelo;
	int qnt_botoes;
	String tipo_pilha;
	float peso;
	boolean desligado;

	void status() {
		System.out.println("\nModelo: " + this.modelo);
		System.out.println("Quantidade de botões: " + this.qnt_botoes);
		System.out.println("Tipo de pilha: " + this.tipo_pilha);
		System.out.println("Peso: " + this.tipo_pilha);
		System.out.println("Desligado? " + this.desligado);
	}

	void desligar() {
		this.desligado = true;
	}

	void ligar() {
		this.desligado = false;
	}

	void jogar() {
		if (this.desligado == true) {
			System.out.println("O controle está desligado, precisar ligar");
		} else {
			System.out.println("O controle está ligado, vamos jogar!");
		}
	}

}
