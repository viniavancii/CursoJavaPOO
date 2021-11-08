package Aula13_Polimorfismo2;

public class Main {

	public static void main(String[] args) {
		Cachorro x = new Cachorro();
		// x.emitirSom();
		x.reagir("Vamos passear");
		x.reagir(1, 0);
		x.reagir(true);
		x.reagir(7, 5.0f);

	}

}
