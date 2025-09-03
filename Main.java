import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("-----/Menu/-----");
            System.out.println("Elige el tipo de vehículo a registrar:");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Bicicleta");
            System.out.println("0. Salir");
            System.out.println("--------------");
            System.out.print("Opción: ");
            opcion = sc.nextLine();

            if (!opcion.equals("0")) {
                if (opcion.equals("1") || opcion.equals("2") || opcion.equals("3")) {
                    System.out.println("Ingresa la marca:");
                    String marca = sc.nextLine();
                    System.out.println("Ingresa el modelo:");
                    String modelo = sc.nextLine();
                    System.out.println("Ingresa la velocidad máxima (km/h):");
                    int velocidadMaxima = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer

                    Transporte vehiculo = null;
                    switch (opcion) {
                        case "1":
                            vehiculo = new Carro(marca, modelo, velocidadMaxima);
                            break;
                        case "2":
                            vehiculo = new Moto(marca, modelo, velocidadMaxima);
                            break;
                        case "3":
                            vehiculo = new Bicicleta(marca, modelo, velocidadMaxima);
                            break;
                    }

                    System.out.println("\nInformación del vehículo:");
                    vehiculo.mostrarInformacion();
                    System.out.println("Tipo de combustible: " + vehiculo.tipoCombustible());
                    vehiculo.arrancar();
                    vehiculo.detener();
                } else {
                    System.out.println("Opción inválida");
                }
            }
        } while (!opcion.equals("0"));

        System.out.println("Saliendo...");
        sc.close();
    }
}