package CodigoConPatronIterator;

public class Vehiculo {

        private String marca;
        private String tipo;
        private String motor;
        private int puertas;

        private Vehiculo() {};

        public Vehiculo(String marca, String tipo, String motor, int puertas) {
            this.marca = marca;
            this.tipo = tipo;
            this.motor = motor;
            this.puertas = puertas;
        }
        public String getMarca() {
            return marca;
        }

        public String getTipo() {
            return tipo;
        }

        public String getMotor() {
            return motor;
        }

        public int getPuertas() {
            return puertas;
        }


}
