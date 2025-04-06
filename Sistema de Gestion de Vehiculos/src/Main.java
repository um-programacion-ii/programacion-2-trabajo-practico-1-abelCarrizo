public class Main {
    public static void main(String[] args) {
        Vehiculo ford = new Vehiculo("Ford Bronco", "abcdef", 2025, 2349);
        Vehiculo fiat = new Vehiculo("Fiat Cronos", "ghijklm", 2024, 1136);
        Vehiculo jeep = new Vehiculo("Jeep Renegade", "nopqrs", 2024, 1500);

        VehiculoPrinter info = new VehiculoPrinter();
        info.mostrarInformacion(ford);
        info.mostrarInformacion(fiat);
        info.mostrarInformacion(jeep);
    }
}

