public class Vehiculo {
    private String marca;
    private String patente;
    private int anio;
    private double capacidadCargaKg;

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

    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Patente: " + patente);
        System.out.println("Anio: " + anio);
        System.out.println("Capacidad Kg: " + capacidadCargaKg);
    }
}
