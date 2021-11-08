package Aula03;

public class Aula03 {
	public static void main(String[] args) {
		ClasseCaneta c1 = new ClasseCaneta();
		c1.modelo = "BIC";
		c1.cor = "Azul";
		// c1.ponta = 0.5f;
		c1.carga = 80; // é um atributo protegido, mas como a classe foi instanciada dentro do main eu
						// consigo ter acesso a este atributo
		//c1.tampada = false;
		c1.tampar();
		c1.status();
		c1.rabiscar();	
	}
}