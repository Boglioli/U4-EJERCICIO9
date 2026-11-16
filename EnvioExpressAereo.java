public class EnvioExpressAereo extends Transportista {
    public EnvioExpressAereo(double tarifaBase) {
        super(tarifaBase);
    }
    @Override
    public double calcularCostoEnvio(double pesokg, double distancia) {
        return tarifaBase + (pesokg * 500) + (distancia * 40);
}
}