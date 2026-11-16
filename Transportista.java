public abstract class Transportista {
    protected double tarifaBase;
    public Transportista(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    public abstract double calcularCostoEnvio(double pesokg, double distancia);
}
