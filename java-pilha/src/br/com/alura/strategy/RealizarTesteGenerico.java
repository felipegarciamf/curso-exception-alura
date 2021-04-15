package br.com.alura.strategy;

public class RealizarTesteGenerico implements IEnvioParaFg7 {

	private final int valor;
	
	
	public RealizarTesteGenerico(int valor) {
		this.valor = valor;
	}


	@Override
	public void envioParaFg7() {
		System.out.println(valor);
	}

}
