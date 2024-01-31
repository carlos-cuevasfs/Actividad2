package geometria;

import java.util.Scanner;
public class Process {
	public void exe() {
		while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Que desea crear?\n 1.Circulo\n 2.Cuadrado\n 3.Salir\n Ingrese el numero de la opcion:");
		int choice = Integer.parseInt(scan.nextLine());
		switch (choice) {
			case 1:
				System.out.println("Elegiste Circulo, ingresa el valor del radio: ");
				String radio = scan.nextLine();
				double doubradio = Double.parseDouble(radio);
				System.out.println("El radio es: "+ doubradio +"\n Que deseas calcular, escribe el numero de la opcion \n 1.Circunferencia \n 2.Area\n 3.Salir");
				String option = scan.nextLine();
				int intoption = Integer.parseInt(option);
				switch (intoption) {
				 	case 1:
						Circle cir = new Circle();
						cir.cambioID(doubradio);
						System.out.println("La Circunferencia es :"+cir.calcularCircunferencia());
						break;
					case 2:
						Circle cir1 = new Circle();
						cir1.cambioID(doubradio);
						System.out.println("El Area es :"+cir1.calcularArea());
						break;
					case 3:
						System.out.println("Saliendo...");
						System.exit(0);
						break;
					default:
						System.out.println("Opcion invalida. Ingrese una opcion valida");
						break;
				}
				break;
			case 2:
				System.out.println("Elegiste Cuadrado, ingresa el valor de un lado: ");
				String lado = scan.nextLine();
				double lad = Double.parseDouble(lado);
				System.out.println("El lado es: "+ lad +"\n Que deseas calcular, escribe el numero de la opcion \n 1.Diagonal \n 2.Perimetro \n 3.Area\n 4.Salir");
				String opti = scan.nextLine();
				int opt = Integer.parseInt(opti);
				switch(opt) {
					case 1:
						Square squad = new Square();
						squad.cambioID(lad);
						System.out.println("La diagonal es :"+squad.calcularDiagonal());
						break;
					case 2:
						Square squad1 = new Square();
						squad1.cambioID(lad);
						System.out.println("El perimetro es :"+squad1.calcularPerimetro());
						break;
					case 3:
						Square squad11 = new Square();
						squad11.cambioID(lad);
						System.out.println("El area es :"+squad11.calcularArea());
						break;
					case 4:
						System.out.println("Saliendo...");
						System.exit(0);
						break;
					default:
						System.out.println("Opcion invalida. Ingrese una opcion valida");
						break;
				}
				break;
			case 3:
				System.out.println("Saliendo...");
				System.exit(0);
				break;
			default:
				System.out.println("Opcion invalida. Ingrese una opcion valida");
				break;
			}
		}	
	}
}
