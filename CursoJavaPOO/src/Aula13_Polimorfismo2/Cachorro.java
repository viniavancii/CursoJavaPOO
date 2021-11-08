package Aula13_Polimorfismo2;

public class Cachorro extends Lobo {

	@Override
	public void emitirSom() {
		System.out.println("au au au");
	}

	public void reagir(String s) {
		if (s.equals("Vamos comer") || s.equals("Vamos passear")) {
			System.out.println("Abanando o rabo e latindo...");
		} else {
			System.out.println("Rosnando...");
		}
	}

	public void reagir(int hora, int min) {
		if (hora < 0 || hora > 23 || min < 0 || min > 59) {
			System.out.println("Digite hora e/ou minutos válidos");
		} else if (hora >= 6 && min >= 0 && hora <= 11 && min <= 59) {
			System.out.println("Abanando o rabo...");
		} else if (hora >= 12 && min >= 0 && hora <= 17 && min <= 59) {
			System.out.println("Abanando o rabo e latindo...");
		} else {
			System.out.println("Ignorando...");
		}
	}

	public void reagir(boolean d) {
		if (d) {
			System.out.println("Abanando rabo...");
		} else {
			System.out.println("Rosnando e latindo...");
			this.emitirSom();
		}
	}

	public void reagir(int idade, float peso) {
		if (idade <= 6 && peso <= 5) {
			System.out.println("Abanando o rabo...");
		} else if (idade <= 6 && peso > 5) {
			System.out.println("Latindo...");
		} else if (idade > 6 && peso <= 5) {
			System.out.println("Rosnando...");
		} else {
			System.out.println("Ignorando...");
		}
	}

}
