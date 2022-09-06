package CodigoConPatronIterator;

public class Main {

    /**
     *
     * Utilizo el patrón Iterator porque me parece util a la hora de manejar muchos datos,
     * permite añadir elementos, acceder a ellos, incluso reiniciar a traves de funciones.
     */

    public static void main(String[] args) {
        Vehiculos vehiculos = new Vehiculos();
        vehiculos.crear(new Vehiculo("Seat", "familiar", "Gasolina", 5));
        vehiculos.crear(new Vehiculo("Audi", "coupe", "Gasolina", 3));
        vehiculos.crear(new Vehiculo("Mercedes", "coupe", "Electrico", 5));
        vehiculos.crear(new Vehiculo("Tesla", "familiar", "Electrico", 5));
        vehiculos.crear(new Vehiculo("Mercedes", "vito", "Diesel", 5));


        while (vehiculos.comprobarAumento()) {
            Vehiculo vehiculo = vehiculos.siguiente();
            System.out.println("Vehiculo: " + vehiculo.getMarca());
        }

        vehiculos.crear(new Vehiculo("Ferrari", "coupe", "Gasolina", 3));
        Vehiculo vehiculo = vehiculos.siguiente();
        System.out.println("Vehiculo: " + vehiculo.getMarca() + " tipo: " + vehiculo.getTipo());

        vehiculos.reset();
        System.out.println("Reiniciamos la lista de vehículos");

        while (vehiculos.comprobarAumento()) {
            vehiculo = vehiculos.siguiente();
            System.out.println("Vehiculo: " + vehiculo.getMarca());
        }

        vehiculos.crear(new Vehiculo("Toyota", "familiar", "Hibrido", 5));
        vehiculo = vehiculos.siguiente();
        System.out.println("Vehiculo: " + vehiculo.getMarca() + " tipo: " + vehiculo.getTipo());

    }

}
