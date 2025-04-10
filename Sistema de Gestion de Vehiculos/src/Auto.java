/**
 * Subclase de Vehículo que representa un auto.
 */
public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    /**
     * Constructor para crear un objeto Auto.
     *
     * @param patente           Patente del auto.
     * @param marca             Marca del auto.
     * @param anio              Año de fabricación.
     * @param capacidadCargaKg  Capacidad de carga en kilogramos.
     * @param cantidadPasajeros Cantidad de pasajeros que puede transportar.
     * @throws IllegalArgumentException si la cantidad de pasajeros es inválida.
     */
    public Auto(String marca, String patente, int anio, double capacidadCargaKg, int cantidadPasajeros) {
        super(marca, patente, anio, capacidadCargaKg);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros <= 0) {
            throw new IllegalArgumentException("La cantidad de pasajeros debe ser mayor a cero.");
        }
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String informacion(){
        return super.informacion()+"\nCantidad de Pasajeros: "+cantidadPasajeros;
    }
}
