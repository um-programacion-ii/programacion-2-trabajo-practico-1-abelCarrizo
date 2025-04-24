/**
 * Clase responsable de mostrar información de los vehículos.
 *
 * @author Abel Carrizo
 */
public class VehiculoPrinter {

    /**
     * Imprime la información del vehículo proporcionado.
     *
     * @param vehiculo Vehículo a imprimir.
     */
    public void mostrarInformacion(Vehiculo vehiculo) {
        System.out.println(vehiculo.informacion());
        System.out.println("--------------------");
    }
}