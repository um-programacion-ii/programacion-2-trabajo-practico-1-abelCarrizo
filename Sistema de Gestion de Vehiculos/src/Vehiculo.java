/**
 * Representa un vehículo genérico.
 * Contiene información básica como patente, marca, año y capacidad de carga.
 * <p>
 * Esta clase forma parte del sistema de gestión de vehículos.
 *
 * @author Abel Carrizo
 */
public class Vehiculo {
    private String marca;
    private String patente;
    private int anio;
    private double capacidadCargaKg;

    /**
     * Crea un nuevo objeto Vehículo con los valores proporcionados.
     *
     * @param patente           la patente del vehículo
     * @param marca             la marca del vehículo
     * @param anio              el año del vehículo
     * @param capacidadCargaKg  la capacidad de carga en kilogramos
     */
    public Vehiculo(String marca, String patente, int anio, double capacidadCargaKg) {
        this.marca = marca;
        this.patente = patente;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getPatente(){
        return patente;
    }

    public void setPatente(String patente){
        this.patente = patente;
    }

    public int getAnio(){
        return anio;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }

    public double getCapacidadCargaKg(){
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidad){
        this.capacidadCargaKg = capacidad;
    }

    public String informacion() {
        return "Marca: " + this.marca +
                "\nPatente: " + this.patente +
                "\nAño: " + this.anio +
                "\nCapacidad de carga (kg): " + this.capacidadCargaKg;
    }

}
