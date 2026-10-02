package sistemaenvios.modelo;

public class PaqueteEstandar extends Paquete {
    private int diasEstimados;

    public PaqueteEstandar(String codigoTrack, double pesoKg, String destino, int diasEstimados) {
        super(codigoTrack, pesoKg, destino);
        this.diasEstimados = diasEstimados;
    }

    public int getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(int diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    @Override
    public double calcularCostoEnvio() {
        return 1000 * getPesoKg();
    }
    
    @Override
    public boolean esAptoParaEnvioAereo() {
        return getPesoKg() <= 15;
    }
    
    @Override
    public String obtenerDetalle() {
        return "Paquete Estándar - Código: "
                + getCodigoTrack()
                + " | Destino: "
                + getDestino()
                + " | Peso: "
                + getPesoKg()
                + " kg | Días: "
                + diasEstimados;
    }
}