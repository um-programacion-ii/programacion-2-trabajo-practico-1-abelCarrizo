public class Main {
    public static void main(String[] args) {
        Camion ford = new Camion("Ford Bronco", "abcdef", 2025, 2349, true);
        Camion fiat = new Camion("Fiat Cronos", "ghijklm", 2024, 1136, false);
        Camion jeep = new Camion("Jeep Renegade", "nopqrs", 2024, 1500, true);

        VehiculoPrinter info = new VehiculoPrinter();
        info.mostrarInformacion(ford);
        info.mostrarInformacion(fiat);
        info.mostrarInformacion(jeep);
    }
}

