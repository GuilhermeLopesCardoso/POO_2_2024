package exercicio_bancario;

public class ContaBancariaCorrente {
    public ContaBancariaCorrente() {
		super();
	}

	public ContaBancariaCorrente(int numeroConta, double saldo) {
		super(numeroConta, saldo);
	}

	@Override
	 public boolean Saque(double valor) {
        if(saldo >= valor) {
            this.saldo -=  valor;
            return true;
        }return false;
    }
	@Override
	 public boolean Deposito(double valor) {
        this.saldo +=valor;
        return true;
    }
	@Override
	 public boolean Transferencia(ContaBancaria destino, double valor ) {
	        if(Saque(valor)) {
	            if(destino.Deposito(valor)) {
	                return true;
	            }else {
	                Deposito(valor);
	                return false;
	            }
	        }return false;
	    }
	
}