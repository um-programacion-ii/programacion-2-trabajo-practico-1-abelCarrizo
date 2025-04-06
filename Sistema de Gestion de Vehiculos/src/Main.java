public class Main {
    public static void main(String[] args) {
        Auto ford = new Auto("Ford Bronco", "abc123", 2025, 2349, 4);
        Auto jeep = new Auto("Jeep Renegade", "abc123", 2024, 1500, 4);

        Camion volkswagen = new Camion("Volkswagen Meteor", "abc123", 2024, 27500, true);
        Camion volvo = new Camion("Volvo FH", "abc123", 2024, 26000, true);

        VehiculoPrinter info = new VehiculoPrinter();

        info.mostrarInformacion(ford);
        info.mostrarInformacion(jeep);

        info.mostrarInformacion(volkswagen);
        info.mostrarInformacion(volvo);
    }
}

