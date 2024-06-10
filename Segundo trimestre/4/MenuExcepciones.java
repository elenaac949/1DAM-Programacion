package paq1;

import java.util.Scanner;

public class MenuExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scLine = new Scanner(System.in);

		boolean salir = false;
		do {
			Scanner scInt = new Scanner(System.in);
			System.out.println("MENÚ RESTAURANTE");
			System.out.println("--1-- Ver el menú del día");
			System.out.println("--2-- Realizar una reserva");
			System.out.println("--3-- Ver los platos especiales");
			System.out.println("--4-- Salir del programa");
			System.out.println("\n Elija una opción");
			int opcion=0;
			
			try {
				opcion = scInt.nextInt();
			} catch (Exception e) {
			
			}

			switch (opcion) {

			case 1:
				System.out.println("***Menú del día: 12 euros***");
				System.out.println("Incluye primero, segundo , bebida y postre o café");
				System.out.println("\nPrimeros Platos:");
				System.out.println("Arroz a la cubana");
				System.out.println("Lentejas");
				System.out.println("Paella Valenciana");
				System.out.println("\nSegundos platos:");
				System.out.println("Entrecot con patatas");
				System.out.println("Lubina al horno");
				System.out.println("Alcahofas con Jamón");
				System.out.println("\nMedio Menú: primero o segundo + bebida+ postre o café ---7,5 euros");
				System.out.println("\nArroz con leche/ Gelatina de frutas/Helado/Natillas caseras/Fruta de temporada");
				System.out.println();
				System.err.println("Pulse enter para volver al menú principal");
				scLine.nextLine();
				break;

			case 2:

				System.out.println("***Reserva***");
				System.out.println("Nombre de la reserva:");
				
				String nombre = scLine.nextLine();
				int numPersonas=51;
				
				while (numPersonas>50 || numPersonas<=1) {
				System.out.println("Numero de personas (Máximo 50)");
				scInt = new Scanner(System.in);
				try {
					numPersonas = scInt.nextInt();
				} catch (Exception e) {
					System.out.println("Debe introducir un numero");
				} //El numero de personas no puede ser negativo o un numero3	
				}
				System.out.println("Reserva hecha: "+nombre+ " , "+numPersonas+" comensales");
				
				System.err.println("Pulse enter para volver al menú principal");
				scLine.nextLine();
				break;

			case 3:
				boolean volver = false;
				do {
					scInt = new Scanner(System.in);
					System.out.println("***Platos especiales***");
					System.out.println("--5--Platos especiales de la semana");
					System.out.println("--6--Platos vegetarianos");
					System.out.println("--7--Volver al Menú principal");
					System.out.println("\nElija una opción");
					
					int esp=0;
					try {
						esp = scInt.nextInt();
					} catch (Exception e) {

					}
					
					switch (esp) {
					case 5:
						System.out.println("***Platos especiales de la semana***");

						System.out.println("\nHuevos rellenos de atún y pimiento:  15 euros");
						System.out.println("Hamburguesa de pollo con setas:   15 euros");
						System.out.println("Rape con salsa de almendras: 20 euros");
						System.err.println("Pulse enter para volver al menú especial");
						scLine.nextLine();
						break;

					case 6:
						System.out.println("***Platos especiales de la semana***");

						System.out.println("\nTortilla de espárragos:  15 euros");
						System.out.println("Hamburguesa de quinoa y alubias:   15 euros");
						System.out.println("Crema de puerro y guisantes:  15 euros");
						System.err.println("Pulse enter para volver al menú especial");
						if (scLine.nextLine() != null) {
							break;
						}
						break;
						
					default:
						System.out.println("\nIntroduce una de las opciones mostradas\n");
						break;
					case 7:
						volver=true;
						break;
					}
					
				} 
				while (!volver);	
				break;

			case 4:
				System.out.println("¿Quiere salir del programa? (s/n)");
				String respuesta = scLine.nextLine();
				if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("s")) {
					System.out.println("Hasta luego :)");
					salir = true;
				}
				break;
			default: 
				System.out.println("\n***INTRODUCE UNA OPCIÓN DE LAS MOSTRADAS***");
			}
		} while (!salir);

	}

}
