import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Auto ford = new Auto("Ford Bronco", "patente1", 2025, 2349, 4);
        Auto jeep = new Auto("Jeep Renegade", "patente2", 2024, 1500, 4);

        Camion volkswagen = new Camion("Volkswagen Meteor", "patente3", 2024, 27500, true);
        Camion volvo = new Camion("Volvo FH", "patente4", 2024, 26000, true);

        vehiculos.add(ford);
        vehiculos.add(jeep);
        vehiculos.add(volkswagen);
        vehiculos.add(volvo);

        VehiculoPrinter info = new VehiculoPrinter();
        System.out.println("==== Lista de Vehículos ====");
        for (Vehiculo vehiculo : vehiculos) {
            info.mostrarInformacion(vehiculo);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Desea buscar un vehículo por patente? (s/n): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();

        if (respuesta.equals("s") || respuesta.equals("sí") || respuesta.equals("si")) {
            System.out.print("Ingrese la patente a buscar: ");
            String patenteBuscada = scanner.nextLine();

            boolean encontrado = false;
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getPatente().equalsIgnoreCase(patenteBuscada)) {
                    System.out.println("Vehículo encontrado:");
                    info.mostrarInformacion(vehiculo);
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró ningún vehículo con esa patente.");
            }
        } else {
            System.out.println("Búsqueda cancelada.");
        }

        scanner.close();
    }
}

