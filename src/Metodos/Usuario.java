package Metodos;

public class Usuario {

	public static void main(String[] args) throws Exception {
		
		
		
		smartTV smarttv = new smartTV();
		
		System.out.println("TV ligada ? " + smarttv.ligada);
		System.out.println("Canal Atual: " + smarttv.canal);
		System.out.println("Volume: " + smarttv.volume);
		System.out.println("================================");
		System.out.println("================================");
		System.out.println();
		
		smarttv.ligar();
		
		smarttv.aumentarVol();
		smarttv.aumentarVol();
		smarttv.aumentarVol();
		smarttv.aumentarVol();
		
		smarttv.mudarCanal(16);
		
		
		System.out.println("TV ligada ? " + smarttv.ligada);
		System.out.println("Canal Atual: " + smarttv.canal);
		System.out.println("Volume: " + smarttv.volume);
	}
	
}
