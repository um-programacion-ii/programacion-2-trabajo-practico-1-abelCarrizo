/**
 * Subclase de Vehículo que representa un camión.
 */
public class Camion extends Vehiculo{
    private boolean tieneAcoplado;

    /**
     * Constructor de Camión.
     *
     * @param patente           la patente del camión
     * @param marca             la marca del camión
     * @param anio              el año del camión
     * @param capacidadCargaKg  la capacidad de carga en kg
     * @param tieneAcoplado     indica si el camión tiene acoplado
     */
    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado) {
        super(patente, marca, anio, capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public String informacion() {
        return super.informacion() + "\nTiene acoplado: " + this.tieneAcoplado;
    }
}
