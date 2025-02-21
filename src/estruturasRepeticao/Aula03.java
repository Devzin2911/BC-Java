package estruturasRepeticao;

public class Aula03 {
	
	public static void main(String[] args) {
		for(int n = 1; n <= 5; n++) {
			
			
			if(n == 3) {
				System.out.println("Parou a execução, rodou o numero: " + n);
				break;
				
			} else {
				System.out.println(n);
			}
			
		}
	}
}
