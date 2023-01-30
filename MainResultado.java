package actividadCuadradoCirculo;

import java.util.Scanner;

public class MainResultado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String square="cuadrado";
		String circle= "circulo";
		String diagonal= "diagonal";
		String perimetro= "perimetro";
		String area= "area";
		String circunferencia= "circunferencia";
		while (true) {
		System.out.println("Que figura quieres hacer, cuadrado o circulo? Si quieres salirte escribe salir");
		String eleccion = scan.nextLine();
		switch(eleccion) {
			case "cuadrado":
				System.out.println("Cuanto mide el lado del cuadrado?");
				String lado = scan.nextLine();
				int ladoent= Integer.parseInt(lado);
				Cuadrado uno = new Cuadrado(ladoent);
				System.out.println("Que quieres calcular, diagonal perimetro o area?");
				String calculo = scan.nextLine();
				if (calculo.equals(diagonal)) {
					System.out.println(uno.calculaDiagonal()); 
					break;
				} else if (calculo.equals(perimetro)) {
					System.out.println(uno.calculaPerimetro());
					break;
				} else if (calculo.equals(area)) {
					System.out.println(uno.calculaArea());
					break;
				} else {
					System.out.println("Esa operacion no se puede o escribe sin acentos y todo en minusculas");
					break;
					}	
			case "circulo":
				System.out.println("Cuanto mide el radio del circulo?");
				String radio = scan.nextLine();
				int radioent= Integer.parseInt(radio);
				Circulo cir = new Circulo(radioent);
				System.out.println("Que quieres calcular, area o circunferencia?");
				String calculocirc = scan.nextLine();
				if (calculocirc.equals(area)) {
					System.out.println(cir.calcularArea());
					break;
				} else if (calculocirc.equals(circunferencia)) {
					System.out.println(cir.calcularCircu());
					break;
				} else {
					System.out.println("Esa operacion no se puede o escribe sin acentos y todo en minusculas");
					break;
					}
			case"salir":
				System.out.println("Adios");
				System.exit(0);
				break;
			}
		}
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		