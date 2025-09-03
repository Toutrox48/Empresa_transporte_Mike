public class Carro extends Transporte {

    public Carro(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String tipoCombustible() {
        return "Gasolina";
    }

    @Override
    public void arrancar() {
        System.out.println("El carro está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El carro se ha detenido.");
    }
}