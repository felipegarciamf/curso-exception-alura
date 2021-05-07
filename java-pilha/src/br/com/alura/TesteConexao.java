package br.com.alura;

public class TesteConexao {

	public static void main(String[] args) {
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
		} catch (IllegalStateException e) {
			System.out.println(e);
		} finally {
			con.fecha();
		}

	}

}
