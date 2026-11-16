public class CotizadorEnvios {
    public void cotizar(Transportista transportista, double pesokg, double distancia) {
        double costo = transportista.calcularCostoEnvio(pesokg, distancia);
        System.out.println("costo del envio: $ " + costo);
    }
}
