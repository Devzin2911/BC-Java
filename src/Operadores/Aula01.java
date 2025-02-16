package Operadores;

public class Aula01 {
	
	/* atribuição -> =
	 * diferente -> !=
	 * < ==> menor que
	 * > ==> maior que
	 * <= ---> menor ou igual a
	 * >= ---> maior ou igual a
	 * == ---> igual
	 * ! ---> não
	 * || ---> ou
	 * && ---> e
	 * 	+ ---> soma
	 * - ---> subtração
	 * * ---> multiplicação
	 *'/' ---> divisao
	 * % ---> resto da divisao
	 * + -->  quando usado com variaveis de texto
	 * é chamado de concatenaçao de textos
	 * */
	
	
	
	public static void main(String[] args) {
		// String nomeCompleto = "Linguagem" + " Java";
		String concatenacao = "?";
		
		concatenacao = 1 + 1 + 1 + "1";
		
		System.out.println(concatenacao);
		
		concatenacao = 1 + "1" + 1 + 1;
		
		System.out.println(concatenacao);
		
		
		concatenacao = 1 + "1" + 1 + "1";
		
		System.out.println(concatenacao);
		
		concatenacao = "1" + 1 + 1 + 1;
		
		System.out.println(concatenacao);
		
		concatenacao = "1" + (1+1+1);
		
		System.out.println(concatenacao);
	}
}
