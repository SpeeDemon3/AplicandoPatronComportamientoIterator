package Refactorizacion;

import static Refactorizacion.InvocaVehiculo.getVehiculo;
import static Refactorizacion.InvocaVehiculo.imprimeCoche;

public class Main {

    public static void main(String[] args) {

        Vehiculo coche = getVehiculo();

        imprimeCoche(coche);
    }

}
