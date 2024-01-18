package geometry;

public class Circulo {
	public double radio;
	public double circunferencia;
	public double area;
	
	public Circulo (int numero) {
		this.radio = numero/100.0;
		calcularCircunferencia();
        calcularArea();
	}
	private double calcularCircunferencia() {
		this.circunferencia = Math.PI*2*radio;
		return circunferencia;
	}
	private double calcularArea() {
		this.area = Math.PI*radio*radio;
		return area;
	}
}
