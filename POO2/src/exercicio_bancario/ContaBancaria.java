package exercicio_bancario;

public class ContaBancaria {
    int numero;	
	Double saldo;

	public ContaBancaria() {
		this.numero = 9999;
		this.saldo = -999.99;
	}

	public ContaBancaria(int numero, Double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public String toString() {
		return "Conta: "+this.numero+"- Saldo: "+this.saldo;
	}
	
	public String deposito(Double valor) {
		this.saldo+= valor;
		return "Depósito Efetuado com sucesso";
	}

	public String saque(Double valor) {
		if (this.saldo<= valor) {
			this.saldo= saldo-valor;
			return "Saque efetuado com sucesso";
		}
		return "Saque não efetuado, Saldo Insuficiente";
	}
	
	public String transferencia(ContaBancaria conta,Double valor) {
		if (this.saldo<= valor) {
			this.saldo= saldo-valor;
			conta.deposito(valor);
			return "Transferencia efetuada com sucesso";
		}
		return "Transferencia não efetuada, Saldo Insuficiente";
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}

