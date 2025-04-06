import java.time.Year;

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
     * @throws IllegalArgumentException si alguno de los datos es inválido
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
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public String getPatente(){
        return patente;
    }

    public void setPatente(String patente){
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede estar vacía.");
        }
        this.patente = patente;
    }

    public int getAnio(){
        return anio;
    }

    public void setAnio(int anio){
        int anioActual = Year.now().getValue();
        if (anio < 1900 || anio > anioActual) {
            throw new IllegalArgumentException("El año debe estar entre 1900 y " + anioActual + ".");
        }
        this.anio = anio;
    }

    public double getCapacidadCargaKg(){
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidad){
        if (capacidad < 0) {
            throw new IllegalArgumentException("La capacidad de carga no puede ser negativa.");
        }
        this.capacidadCargaKg = capacidad;
    }

    public String informacion() {
        return "Marca: " + this.marca +
                "\nPatente: " + this.patente +
                "\nAño: " + this.anio +
                "\nCapacidad de carga (kg): " + this.capacidadCargaKg;
    }
}
