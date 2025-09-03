public class Bicicleta extends Transporte {

    public Bicicleta(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String tipoCombustible() {
        return "No usa combustible";
    }

    @Override
    public void arrancar() {
        System.out.println("La bicicleta está lista para pedalear.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se ha detenido.");
    }
}