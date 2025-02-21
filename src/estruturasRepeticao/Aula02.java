package estruturasRepeticao;

public class Aula02 {
	
	public static void main(String[] args) {
		
		System.out.println("---- for no modo classico ----");
		String alunos[] = {"Felipe", "Josue", "Zoe", "Ana", "Gabriel"};
		for(int x=0; x < alunos.length; x++) {
			System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
		}
		
		System.out.println();
		
		
		System.out.println("---- comando for each ----");
		for(String aluno : alunos) {
			System.out.println("Nome do aluno é: " + aluno);	
		}
	}
}
