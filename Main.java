public class Main {
    public static void main(String[] args) {
        CotizadorEnvios cotizador = new CotizadorEnvios();
        Transportista correo = new CorreoTradicional(500);
        Transportista aereo = new EnvioExpressAereo(1000);
        Transportista maritimo = new TransporteMaritimo(250);
        double peso = 10;
        double distancia = 100;
        System.out.println("correo tradicional");
        cotizador.cotizar(correo, peso, distancia);
        System.out.println("-------------------------");
        System.out.println("envio express aereo");
        cotizador.cotizar(aereo, peso, distancia);
        System.out.println("-------------------------");
        System.out.println("transporte maritimo");
        cotizador.cotizar(maritimo, peso, distancia);
    }
}
