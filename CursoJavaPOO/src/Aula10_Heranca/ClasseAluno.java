package Aula10_Heranca;

public class ClasseAluno extends ClassePessoa { // Serve para para uma classe herdar da classe Mae
	private int matr;
	private String curso;

	public int getMatr() {
		return matr;
	}

	public void setMatr(int matr) {
		this.matr = matr;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void cancelarMatr() {
		this.setMatr(0);
	}
}
