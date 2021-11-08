package Aula11_Heranca2;

public class Main {

	public static void main(String[] args) {
		
		/*Visitante v = new Visitante();
		v.setNome("João");
		v.setIdade(10);
		v.setSexo("M");
		System.out.println(v.toString());*/
		
		/*Aluno a1 = new Aluno();
		a1.setNome("Tereza");
		a1.setIdade(15);
		a1.setSexo("F");
		a1.pagarMensa();
		System.out.println(a1.toString());*/
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Thomas");
		b1.setMatricula(1111);
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensa();
		System.out.println();
		
		
		Técnico t1 = new Técnico();
		t1.setNome("Aline");
		t1.praticar();
		System.out.println();
		
		Professor p1 = new Professor();
		p1.setNome("João");
		p1.setIdade(35);
		p1.fazerAniver();
		p1.setSexo("Masculino");
		System.out.println(p1.toString());
		p1.setSalario(1000);
		p1.receberAumento(100f);
	}

}
