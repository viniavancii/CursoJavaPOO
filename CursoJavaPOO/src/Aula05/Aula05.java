package Aula05;

public class Aula05 {

	public static void main(String[] args) {
		Banco p1 = new Banco();
		p1.setDono("Jubileu");
		p1.setNumConta(11111);
		p1.abrirConta("CC");
		
		
		Banco p2 = new Banco();
		p2.setDono("André");
		p2.setNumConta(22222);
		p2.abrirConta("CP");
		
		
		p1.depositar(100);
		p2.depositar(500);
		p2.sacar(100);
		p1.pagarMensalidade();
		p2.pagarMensalidade();
		
		p1.estadoAtual();
		p2.estadoAtual();
		
	}
}
