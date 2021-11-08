package Aula13_Polimorfismo2;

public class Mamifero extends Animal {
	protected String corPelo;

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamífero");
		
	}

}
