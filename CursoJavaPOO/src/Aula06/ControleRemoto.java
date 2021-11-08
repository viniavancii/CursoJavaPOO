package Aula06;

public class ControleRemoto implements Controlador { // Implementa a interface Controlador

	// Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// Método especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// Métodos abstratos
	@Override // Serve para sobreescrever o que foi programado na interface, no caso, nada
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado() == true) {
			System.out.println("------ MENU ------");
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());

			for (int i = 0; i <= this.getVolume(); i += 10) {
				System.out.printf("|");
			}
		}else {
			System.out.println("TV desligada");
		}
	}

	@Override
	public void fecharMenu() {
		if(this.getLigado() == true) {
		System.out.println("\nFechando menu...");
		}
	}

	@Override
	public void maisVolume() {
		if (this.getLigado() == true) {
			this.setVolume(this.getVolume() + 5);
		}else {
			System.out.println("Impossível aumentar volume");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado() == true) {
			this.setVolume(this.getVolume() - 5);
		}else {
			System.out.println("Impossível diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		if (this.getLigado() == true && this.getTocando() == false) {
			this.setTocando(true);
		}else {
			System.out.println("Não conseguir reproduzir");
		}
	}

	@Override
	public void pause() {
		if (this.getLigado() == true && this.getTocando() == true) {
			this.setTocando(false);
		}else {
			System.out.println("Não consegui pausar");
		}
	}

}
