package Aula02;

public class Aula02 {

	public static void main(String[] args) {
		Aula02ClasseCaneta c1 = new Aula02ClasseCaneta(); // instanciar a classe criada no outro arquivo aula02
		c1.cor = "Azul"; // chamada de atributo
		c1.ponta = 0.5f;
		c1.carga = 90;
		c1.modelo = "BIC";
		c1.destampar(); // chamada de método
		c1.status();
		c1.rabiscar();

		Aula02ClasseCaneta c2 = new Aula02ClasseCaneta();
		c2.modelo = "HostNet";
		c2.cor = "Preta";
		c2.carga = 70;
		c2.ponta = 0.5f;
		c2.tampar();
		c2.status();
		c2.rabiscar();
	}

}
