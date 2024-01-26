package geometria;

public class Square {
	public double lado;
	public double d;
	int id;
	public Square() {
		this(173938);
	}
	public Square(int id) {
		this.id = id;
		this.lado = id/100.0;
	}
	public void Cuadrado (int numero) {
		calcularDiagonal();
		calcularPerimetro();
        calcularArea();
	}
	double calcularDiagonal() {
		d = lado;
		return Math.sqrt(2*d*d);
	}
	double calcularPerimetro() {
		d = lado;
		return 4*d;
	}
	double calcularArea() {
		d = lado;
		return d*d;
	}
	void cambioID(double lad) {
		lado = lad;
	}
}
