package Metodos;

public class smartTV {
	
	boolean ligada = false;
	int canal = 3;
	int volume = 18;
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	
	public void aumentarVol() {
		volume++;
	}
	
	public void daiminuirVol() {
		volume--;
	}
	
	
	public void trocarCanalMais() {
		canal++;
	}
	
	public void trocarCanalMenos() {
		canal--;
	}
	
	public void ligar() {
		ligada =  true;
	}
	
	public void desligar() {
		ligada = false;
	}
}
