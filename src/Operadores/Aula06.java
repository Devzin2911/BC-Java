package Operadores;

public class Aula06 {
	
	public static void main(String[] args) {
		
		boolean cond1 = false;
		
		boolean cond2 = true;
		
		
		if(cond1 == true && cond2 == true) {
			System.out.println("As duas condições são verdadeiras");
		} 
		
		if(cond1 == true || cond2 == true) {
			System.out.println("Apenas uma das condições é verdadeira");
		} 
		
		if(!cond1 && !cond2) {
			System.out.println("Nenhuma das condições é verdadeira");
		}
		
	}
}

