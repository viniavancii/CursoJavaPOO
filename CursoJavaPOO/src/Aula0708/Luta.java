package Aula0708;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private boolean aprovada;


	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public void marcarLuta(Lutador desafiado, Lutador desafiante) {
		if (desafiado.getCategoria().equals(desafiante.getCategoria()) && (desafiado != desafiante)) {
			this.aprovada = true;
			this.desafiado = desafiado;
			this.desafiante = desafiante;
		} else {
			this.aprovada = false;
			this.desafiante = null;
			this.desafiado = null;
		}

	}
	
	public void ganharRound() {
		
	}

	public void lutar() {
		int desafiadorWins = 0;
		int desafianteWins = 0;
		
		if(this.aprovada == true) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor1 = aleatorio.nextInt(2);
			int vencedor2 = aleatorio.nextInt(2);
			int vencedor3 = aleatorio.nextInt(2);
			
			
			if(vencedor1 == 1) {
				desafiadorWins = 1;
				System.out.println("\nO Vencedor do primeiro round �: " + this.desafiado.getNome());
			}else {
				desafianteWins = 1;
				System.out.println("\nO Vencedor do primeiro round �: " + this.desafiante.getNome());
			}
			
			if(vencedor2 == 1) {
				desafiadorWins++;
				System.out.println("O Vencedor do segundo round �: " + this.desafiado.getNome());
			}else {
				desafianteWins++;
				System.out.println("O Vencedor do segundo round �: " + this.desafiante.getNome());
			}
			
			if(desafiadorWins == 2) {
				System.out.println("\nO Vencedor da luta ap�s ganhar dois rounds dos tr�s �: " + this.desafiado.getNome());
			}else if (desafianteWins == 2) {
				System.out.println("\nO Vencedor da luta ap�s ganhar dois rounds dos tr�s �: " + this.desafiante.getNome());
			}else if (vencedor3 == 1) {
				desafiadorWins++;
				System.out.println("O vencedor ap�s o round de desempate �: "  + this.desafiado.getNome());
			}else {
				desafianteWins++;
				System.out.println("O vencedor ap�s o round de desempate �: "  + this.desafiante.getNome());
			}
			
			
			
			
			
			/*System.out.println("====== RESULTADO DA LUTA ======");
			switch (vencedor) {
			case 0: //empate
				System.out.println("\nA luta empatou");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
				
			case 1: // desafiante vence
				System.out.println("\nO Desafiante " + desafiante.getNome() + " ganhou");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
				
			case 2: // desafiado vence
				System.out.println("\nO Desafiado " + desafiado.getNome() + " ganhou");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			
			}*/
		}else {
			System.out.println("A Luta n�o pode acontecer");
		}
	}
}

