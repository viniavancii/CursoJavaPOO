package Aula12_Polimorfismo;

public class Cachorro extends Mamifero {
	
	@Override
	public void emitirSom() {
		System.out.println("Latindo...");
	}

	public void enterrarOsso() {
		System.out.println("Enterrando osso...");
	}

	public void abanarRabo() {
		System.out.println("Abanando rabo...");
	}
}
