package geometria;

import java.util.Scanner;
public class Process {
	public void exe() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el numero de la figura que quiere calcular:\n 1)Circulo\n 2)Cuadrado");
		String figure = scan.nextLine();
		int intEscaneado = Integer.parseInt(figure);
				if (intEscaneado == 1) {
					System.out.println("Elegiste Circulo, ingresa el valor del radio: ");
					String radio = scan.nextLine();
					double doubradio = Double.parseDouble(radio);
					System.out.println("El radio es: "+ doubradio +"\n Que deseas calcular, escribe el numero de la opcion \n 1)Circunferencia \n 2)Area");
					String option = scan.nextLine();
					int intoption = Integer.parseInt(option);
						if (intoption == 1) {
							Circle cir = new Circle();
							cir.cambioID(doubradio);
							System.out.println("La Circunferencia es :"+cir.calcularCircunferencia());
							}
						else if (intoption == 2) {
							Circle cir = new Circle();
							cir.cambioID(doubradio);
							System.out.println("El Area es :"+cir.calcularArea());
							}
						else {
							System.out.println("Error!");
						}
				}
				else if (intEscaneado == 2){
					System.out.println("Elegiste Cuadrado, ingresa el valor de un lado: ");
					String lado = scan.nextLine();
					double lad = Double.parseDouble(lado);
					System.out.println("El radio es: "+ lad +"\n Que deseas calcular, escribe el numero de la opcion \n 1)Diagonal \n 2)Perimetro \n 3)Area");
					String option = scan.nextLine();
					int opt = Integer.parseInt(option);
						if (opt == 1) {
							Square squad = new Square();
							squad.cambioID(lad);
							System.out.println("La diagonal es :"+squad.calcularDiagonal());
						}
						else if (opt == 2) {
							Square squad = new Square();
							squad.cambioID(lad);
							System.out.println("El perimetro es :"+squad.calcularPerimetro());
						}
						else if (opt == 3) {
							Square squad = new Square();
							squad.cambioID(lad);
							System.out.println("El area es :"+squad.calcularArea());
						}
						else {
							System.out.println("Error!");
						}
				}
				else {
					System.out.println("Error!");
				}
			scan.close();
			}
		}
