package br.com.alura;

public class ContaCorrente extends Conta implements Tributavel {


	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
	}

	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);

	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		System.out.println(super.saldo);
	}

	
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}