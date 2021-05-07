package br.com.alura;

public abstract class Conta {

	protected double saldo;

	public Conta(int agencia, int conta) {
		// TODO Auto-generated constructor stub
	}

	public double getSaldo() {
		return saldo;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			// problema
			throw new SaldoInsuficienteException("Saldo insuficiente: " + this.saldo);
		}
		this.saldo += valor;

	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);

	}

}
