package Aula11_Heranca2;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void receberAumento(float aum) {
		this.setSalario(this.getSalario() + aum);
		System.out.println("O(A) professor(a) de nome " + this.getNome()
				+ " recebeu um aumento e agora seu salário é de R$" + this.getSalario());
	}
}
