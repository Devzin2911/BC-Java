package estruturasCondicionais;


public class resultadoEscolar {
	
	public static void main(String[] args) {
		
		System.out.println("Digite sua nota: ");
		double nota = 7.0;
		
		if(nota >= 7) {
			System.out.println("Parabéns, está aprovado");
			
		} else if(nota >= 5 && nota < 7) {
			System.out.println("Você está de recuperação");
		}else {
			System.out.println("É uma pena, você foi reprovado");
		}
	}
}
