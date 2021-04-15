package br.com.alura.strategy;

public class RealizarTesteCartoes implements IEnvioParaFg7 {

	private int valor = 1;

	@Override
	public void envioParaFg7() {
		System.out.println(valor);
	}

}
