public class CorreoTradicional extends Transportista {
    public CorreoTradicional(double tarifaBase) {
        super(tarifaBase);
    }
    @Override
    public double calcularCostoEnvio(double pesokg, double distancia) {
        return tarifaBase + (pesokg * 250) + (distancia * 15);
    }
}
