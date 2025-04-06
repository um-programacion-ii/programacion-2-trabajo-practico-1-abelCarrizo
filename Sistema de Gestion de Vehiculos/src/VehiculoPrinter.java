/**
 * Clase responsable de mostrar información de los vehículos.
 * <p>
 * Aplica el principio SRP (Single Responsibility Principle),
 * separando la lógica de presentación de la lógica del modelo.
 * <p>
 * Esta clase puede extenderse para mostrar diferentes tipos de vehículos.
 *
 * @author Abel Carrizo
 */
public class VehiculoPrinter {

    /**
     * Imprime por consola la información básica de un vehículo.
     *
     * @param vehiculo el vehículo cuya información se desea imprimir
     */
    public void mostrarInformacion(Vehiculo vehiculo){
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Patente: " + vehiculo.getPatente());
        System.out.println("Anio: " + vehiculo.getAnio());
        System.out.println("Capacidad Kg: " + vehiculo.getCapacidadCargaKg());
        System.out.println("-----------------------------------------------");
    }
}
