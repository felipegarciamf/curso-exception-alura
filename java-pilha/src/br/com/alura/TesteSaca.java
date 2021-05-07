package br.com.alura;

public class TesteSaca {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(123, 321);
		
		
		contaCorrente.deposita(10);
		
		
		try {
			contaCorrente.saca(190);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println(contaCorrente.getSaldo());
	}
	
}
