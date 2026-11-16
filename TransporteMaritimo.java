public class TransporteMaritimo extends Transportista {
    public TransporteMaritimo(double tarifaBase) {
        super(tarifaBase);
    }

    @Override
    public double calcularCostoEnvio(double pesokg, double distancia) {
        return tarifaBase + (pesokg * 500) + (distancia * 5);
    }
}