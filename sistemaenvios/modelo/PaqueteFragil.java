package sistemaenvios.modelo;

public class PaqueteFragil extends Paquete {
    private String nivelProteccion;

    public PaqueteFragil(String codigoTrack, double pesoKg, String destino, String nivelProteccion) {
        super(codigoTrack, pesoKg, destino);
        this.nivelProteccion = nivelProteccion;
    }

    public String getNivelProteccion() {
        return nivelProteccion;
    }

    public void setNivelProteccion(String nivelProteccion) {
        if (!nivelProteccion.equalsIgnoreCase("Baja")
                && !nivelProteccion.equalsIgnoreCase("Media")
                && !nivelProteccion.equalsIgnoreCase("Alta")) {
            throw new IllegalArgumentException("Nivel de protección inválido");
        }
        this.nivelProteccion = nivelProteccion;
    }

    @Override
    public double calcularCostoEnvio() {
        double costo = 1000 * getPesoKg();
        if (nivelProteccion.equalsIgnoreCase("Alta")) {
            costo *= 1.30;
        } else if (nivelProteccion.equalsIgnoreCase("Media")) {
            costo *= 1.15;
        }

        return costo;
    }

    @Override
    public boolean esAptoParaEnvioAereo() {
        return false;
    }

    @Override
    public String obtenerDetalle() {
        return "Paquete Frágil - Código: "
                + getCodigoTrack()
                + " | Destino: "
                + getDestino()
                + " | Peso: "
                + getPesoKg()
                + " kg | Protección: "
                + nivelProteccion;
    }
}