public class Moto extends Transporte {

    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public String tipoCombustible() {
        return "Gasolina";
    }

    @Override
    public void arrancar() {
        System.out.println("La moto está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("La moto se ha detenido.");
    }
}