package Aula02.Exercicio;

public class Controle {

	public static void main(String[] args) {
		ClasseControle controle = new ClasseControle();
		controle.modelo = "Controle Xbox Series X";
		controle.qnt_botoes = 19;
		controle.tipo_pilha = "AA";
		controle.peso = 540f;
		controle.ligar();
		controle.status();
		controle.jogar();
		
		ClasseControle controle2 = new ClasseControle();
		controle2.modelo = "Controle Xbox One";
		controle2.qnt_botoes = 18;
		controle2.tipo_pilha = "AA";
		controle2.peso = 520f;
		controle2.desligar();
		controle2.status();
		controle2.jogar();
	}
}
