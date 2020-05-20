package Entidade;

public class Retangulo {

	public double largura;
	public double altura;
	
	public double area() {
		double a = largura + altura;
		return a;
	}
	
	public double perimitro() {
		double p = 2 * (largura + altura);
		return p;
	}
	
	public double diagonal() {
		double d = Math.sqrt( altura * altura + largura * largura);
		return d;
}
}