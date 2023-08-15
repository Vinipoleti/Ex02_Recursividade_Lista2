package Controller;

public class Divisao {

	public Divisao() {
		super ();
	}
	
	public int DivporSub ( int dividendo, int divisor) {
		
		if (dividendo>=divisor) { // dividendo precisa ser maior ou igual ao divisor
			return DivporSub (dividendo-divisor,divisor); // retorna na função obedecendo a condição subtraindo
		} else { 
			return dividendo; // retorna o dividendo pois após esse if ele se torna o resto
			}
	}
}
