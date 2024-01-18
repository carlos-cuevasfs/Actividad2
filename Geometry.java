package geometry;

public class Geometry {

	public static void main(String[] args) {
		Cuadrado id = new Cuadrado(173938);
		System.out.println("Cuadrado ID");
		System.out.println("La medida de un lado es:"+id.lado);
		System.out.println("La diagonal es:"+ id.diagonal);
		System.out.println("El area es:"+ id.area);
		System.out.println("El perimetro es:"+ id.perimetro+"\n");
		
		Circulo id1 = new Circulo(173938);
		System.out.println("Circulo ID");
		System.out.println("La medida del radio es:"+id1.radio);
		System.out.println("La circunferencia es:"+ id1.circunferencia);
		System.out.println("El area es:"+ id1.area);
	}

}
