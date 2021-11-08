package Aula12_Polimorfismo;

public class Main {

	public static void main(String[] args) {
		// Animal n = new Animal(); // Não pode instanciar um objeto da Classe Animal
		// porque é uma classe abstrata

		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Tartaruga t = new Tartaruga();
		Cachorro ca = new Cachorro();

		m.setPeso(85.3f);
		m.setIdade(4);
		m.setMembros(4);
		m.emitirSom();
		m.locomover();
		m.alimentar();
		System.out.println(m.toString());

		System.out.println();
		r.setPeso(3f);
		r.setIdade(4);
		r.setMembros(4);
		r.setCorEscama("Azul");
		r.emitirSom();
		r.locomover();
		r.alimentar();
		System.out.println(r.toString());
		
		System.out.println();
		c.locomover();
		c.alimentar();
		
		System.out.println();
		t.locomover();
		t.alimentar();

		System.out.println();
		ca.emitirSom();
	}

}
