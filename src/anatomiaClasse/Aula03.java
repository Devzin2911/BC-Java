package anatomiaClasse;

public class Aula03 {

	public static void main(String[] args) {
		// estrutura de declaração de variáveis
		
		String nome = "Gabriel";
		String sobrenome = " Rocha";
		
		String nomeCompleto = nomeCompleto(nome, sobrenome);
		
		int anoFabricaco = 2020;
		
		boolean simNao = true;
		
		System.out.println(nomeCompleto);
		// Métodos são aplicados no infinitivo
	}
	
	
	public static String nomeCompleto(String nome, String sobrenome) {
		return nome.concat("Resultado do método ==> " + nome.concat(sobrenome));
	}
	
}
