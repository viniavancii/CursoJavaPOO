package Aula05;

public class Banco {
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	//Métodos personalizados	
		public void estadoAtual() {
			System.out.println("------------------------------");
			System.out.println("Conta: " + this.getNumConta());
			System.out.println("Dono: " + this.getDono());
			System.out.println("Tipo: " + this.getTipo());
			System.out.println("Saldo: " + this.getSaldo());
			System.out.println("Está ativa? " + this.getStatus());
		}
		
		public void abrirConta(String tipo) { // Precisa-se saber o tipo da conta antes de abri-lá
			this.setTipo(tipo); // Modifica a conta para CC ou CP
			this.setStatus(true); // Habilita o status da conta para verdadeiro
			if (tipo == "CC") { // Verifica o tipo e executa ações diferentes para cada tipo
				this.setSaldo(50);
			} else if (tipo == "CP") {
				this.setSaldo(150);
			}
			System.out.println("Conta aberta com sucesso");
		}

		public void fecharConta() {
			if (this.getSaldo() > 0) {
				System.out.println("Não é possível fechar a conta com saldo nela, saque o saldo antes de fechar");
			} else if (this.getSaldo() < 0) {
				System.out.println("Você tem débitos em conta, favor regularize a situação antes de fechar a conta");
			} else {
				this.status = false;
				System.out.println("Conta fechada com sucesso");
			}

		}

		public void depositar(float v) {
			if (this.getStatus()) {
				this.setSaldo(this.getSaldo() + v);
				System.out.println("Deposito realizado na conta de " + this.getDono());
			}else {
				System.out.println("Impossível depositar em uma conta fechada");
			}
		}

		public void sacar(float v) {
			if(this.getStatus()) {
				if (this.getSaldo() >= v){
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
				}else {
				System.out.println("Saldo insuficiente");
			}
			}else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}

		public void pagarMensalidade() {
			float v = 0;
			if (this.getTipo() == "CC") {
				v = 12;
			} else if (this.getTipo() == "CP") {
				v = 20;
			}
			
			if(this.getStatus()) {
				if(this.getSaldo() >= v) {
					this.setSaldo(this.getSaldo() - v);
					System.out.println("Mensalidade paga com sucesso por " + this.getDono());
				}else if (this.getSaldo() < v) {
					System.out.println("Saldo Insuficiente");
				}
			else {
					System.out.println("Impossível pagar");
				}
			}
			
			
		}
	
	//Metodos especiais
	public Banco() { //Metodo construtor
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
		
		
	

	
		
	



