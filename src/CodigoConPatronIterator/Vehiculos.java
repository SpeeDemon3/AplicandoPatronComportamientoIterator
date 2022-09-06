package CodigoConPatronIterator;

import java.util.ArrayList;

public class Vehiculos implements VehiculoIterator{

    private ArrayList<Vehiculo> vehiculos = new ArrayList();

    private int posicion = 0;

    public void crear(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    @Override
    public boolean comprobarAumento() {
        return posicion < vehiculos.size();
    }

    @Override
    public void reset() {

    }

    public Vehiculo siguiente() {
        Vehiculo vehiculo = vehiculos.get(posicion);
        posicion++;
        return vehiculo;
    }

}
