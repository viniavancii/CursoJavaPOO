package Aula09;

public class Aula09 {

	public static void main(String[] args) {
		ClassePessoa p[] = new ClassePessoa[1];
		ClasseLivro l[] = new ClasseLivro[1];

		p[0] = new ClassePessoa("João", 22, "Masculino");
		l[0] = new ClasseLivro("Aprendendo Java", "José da Silva", 100, p[0]);
		
		p[0].fazerAniver();
		l[0].abrir();
		//l[0].folhear(100);
		l[0].avancarPag();
		//l[0].voltarPag();
		System.out.println(l[0].detalhes());
		
	}

}
