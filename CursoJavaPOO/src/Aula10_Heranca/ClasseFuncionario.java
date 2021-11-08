package Aula10_Heranca;

public class ClasseFuncionario extends ClassePessoa {
	private String setor;
	private boolean trabalhando;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	public void mudarTrabalho() {
		if (this.trabalhando == false) {
			this.trabalhando = true;
		} else {
			this.trabalhando = false;
		}

		// this.trabalhando = ! this.trabalhando; //recebe o inverso
	}
}
