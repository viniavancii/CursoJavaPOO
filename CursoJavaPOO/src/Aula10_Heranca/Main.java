package Aula10_Heranca;

public class Main {

	public static void main(String[] args) {
		ClassePessoa p = new ClassePessoa();
		ClasseAluno p2 = new ClasseAluno();
		ClasseProfessor p3 = new ClasseProfessor(); 
		ClasseFuncionario p4 = new ClasseFuncionario();
		
		p.setNome("Fábio");
		p2.setNome("Joãozinho");
		p3.setNome("Vitor");
		p4.setNome("Ana");
		
		System.out.println(p2.detalhes());
		
		//a.fazerAniver();
		//a.cancelarMatr();
	}

}
