package Refactorizacion;

public class InvocaVehiculo {

    public static Vehiculo getVehiculo() {
        Vehiculo coche = new CocheBuilder("seat")
                .setTipo("Familiar")
                .setPuertas(5)
                .setMotor("Gasolina")
                .build();
        return coche;
    }


    public static void imprimeCoche(Vehiculo coche) {
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Puertas: " + coche.getPuertas());
        System.out.println("Motor: " + coche.getMotor());
    }

}
