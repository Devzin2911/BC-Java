package Operadores;

public class Aula03 {
	
	public static void main(String[] args) {
		
		int numero = 5;
		
		//Para incrementar um valor a outro já existente
		numero = numero + 2;
		System.out.println(numero);
		numero = numero + 1;
		System.out.println(numero);
		numero++;
		System.out.println(numero);
		numero += 2;
		System.out.println(numero);
	
		/*
		System.out.println(numero ++);
		System.out.println(numero);
		System.out.println(++ numero);
		System.out.println(numero);
		*/
		
		//Para decrementar um valor a outro já existente
		numero = numero - 2;
		System.out.println(numero);
		numero = numero - 1;
		System.out.println(numero);
		numero--;
		System.out.println(numero);
		numero -= 2;
		System.out.println(numero);
		
		/*
		System.out.println(numero --);
		System.out.println(numero);
		System.out.println(-- numero);
		System.out.println(numero);
		*/
	}
}
