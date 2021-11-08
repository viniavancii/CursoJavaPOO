package Aula04;

public class Aula04 {

	public static void main(String[] args) {
		ClasseCaneta c1 = new ClasseCaneta("NIC", 0.4f, "Amarela"); // Adicionando valores as variaveis através do
																	// método construtor
		c1.status();
		ClasseCaneta c2 = new ClasseCaneta("BIC", 1.5f, "Laranja");
		c2.status();

	}

}
