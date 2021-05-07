package br.com.alura;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);

		conta.deposita(0);
	}

}
