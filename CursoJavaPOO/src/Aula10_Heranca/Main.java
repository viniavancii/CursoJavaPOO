package Aula10_Heranca;

public class Main {

	public static void main(String[] args) {
		ClassePessoa p = new ClassePessoa();
		ClasseAluno p2 = new ClasseAluno();
		ClasseProfessor p3 = new ClasseProfessor(); 
		ClasseFuncionario p4 = new ClasseFuncionario();
		
		p.setNome("F�bio");
		p2.setNome("Jo�ozinho");
		p3.setNome("Vitor");
		p4.setNome("Ana");
		
		System.out.println(p2.detalhes());
		
		//a.fazerAniver();
		//a.cancelarMatr();
	}

}
