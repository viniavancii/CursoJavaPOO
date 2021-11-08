package Aula11_Heranca2;

public final class Bolsista extends Aluno {
	private float bolsa;

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	@Override // Sobreposição de método
	public void pagarMensa() {
		System.out.println(this.getNome() + " é bolsista, pagamento facilitado");
	}

	public void RenovarBolsa() {
		System.out.println("Renovando bolsa do(a) bolsista " + this.getNome());
	}
}
