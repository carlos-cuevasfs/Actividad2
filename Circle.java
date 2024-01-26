package geometria;

public class Circle {
	double id;
	public double radio;
	public double d;
	
	public Circle() {
		this(173938);
	}
	public Circle(int id) {
		this.id = id;
		this.radio = id/100.0;
	}
	public void Circulo() {
		calcularCircunferencia();
        calcularArea();
	}
	double calcularCircunferencia() {
		d = radio;
		return Math.PI*2*d;
	}
	 double calcularArea() {
		d= radio;
		return Math.PI*radio*radio;
	}
	void cambioID(double doubradio) {
		radio = doubradio;
	}
}
