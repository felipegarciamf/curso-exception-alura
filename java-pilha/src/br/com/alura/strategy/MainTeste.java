package br.com.alura.strategy;

public class MainTeste {

	public static void main(String[] args) {

		RealizarTesteCartoes teste = new RealizarTesteCartoes();
		RealizarTesteGenerico teste2 = new RealizarTesteGenerico(2);
		
		ChainOfResposabilty mteste = new ChainOfResposabilty();
		
		mteste.envioParaFg7(teste);
		mteste.envioParaFg7(teste2);
		
		

	}

	
}
