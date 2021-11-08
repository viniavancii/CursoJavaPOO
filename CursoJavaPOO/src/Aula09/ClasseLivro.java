package Aula09;

public class ClasseLivro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int pagAtual;
	private boolean aberto;
	private ClassePessoa leitor;

	// Metodo construtor
	public ClasseLivro(String titulo, String autor, int totalPaginas, ClassePessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}

	// Metodos acessores
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public ClassePessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(ClassePessoa leitor) {
		this.leitor = leitor;
	}

	// Metodo especial
	public String detalhes() { // Gerou um método toString() que foi renomeado para detalhes()
		return "================ LIVRO ================ \nTitulo: " + titulo + " \nAutor: " + autor
				+ "\nTotal de Páginas: " + totalPaginas + "\nPágina Atual: " + pagAtual + "\nEstá aberto? " + aberto
				+ "\nQuem está lendo " + leitor.getNome() + "\nIdade do leitor: " + leitor.getIdade() + "\nDo sexo: "
				+ leitor.getSexo();
	}

	// Metodos abstratos
	@Override
	public void abrir() {
		if (this.aberto == true) {
			System.out.println("O livro já está aberto");
		} else {
			this.setAberto(true);
		}
	}

	@Override
	public void fechar() {
		if (this.aberto == false) {
			System.out.println("O livro já está fechado");
		} else {
			this.setAberto(false);
		}
	}

	@Override
	public void folhear(int p) {
		if(p > totalPaginas) {
			System.out.println("O livro tem " + this.totalPaginas + " páginas, não é possível folhear acima do total de páginas");
			pagAtual = 0;
		}else {
			this.pagAtual = p; // Quantas páginas eu quero folhear
		}
	}

	@Override
	public void avancarPag() {
		if (this.pagAtual >= this.totalPaginas) {
			System.out.println("Impossível avançar, você já está na última página do livro");
		} else {
			this.setPagAtual(this.getPagAtual() + 1);
		}
	}

	@Override
	public void voltarPag() {
		if (this.pagAtual <= 0) {
			System.out.println("Impossível voltar a página, você está na primeira página");
		} else {
			this.setPagAtual(this.getPagAtual() - 1);
		}
	}
}
