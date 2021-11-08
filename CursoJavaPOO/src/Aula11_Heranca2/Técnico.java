package Aula11_Heranca2;

public final class Técnico extends Aluno {
	private int registroProfissional;

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	public void praticar() {
		System.out.println("O aluno(a) técnico de nome " + this.getNome() + " está praticando");
	}
}
