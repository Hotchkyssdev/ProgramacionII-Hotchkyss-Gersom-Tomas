package sistemaenvios.modelo;

public abstract class Paquete implements Enviable {
    private String codigoTrack;
    private double pesoKg;
    private String destino;

    public Paquete(String codigoTrack, double pesoKg, String destino) {
        setCodigoTrack(codigoTrack);
        setPesoKg(pesoKg);
        setDestino(destino);
    }

    public String getCodigoTrack() {
        return codigoTrack;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public String getDestino() {
        return destino;
    }

    public void setCodigoTrack(String codigoTrack) {
        if (codigoTrack == null || codigoTrack.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede estar vacío");
        }
        this.codigoTrack = codigoTrack;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        }
        this.pesoKg = pesoKg;
    }

    public void setDestino(String destino) {
        if (destino == null || destino.trim().isEmpty()) {
            throw new IllegalArgumentException("El destino no puede estar vacío");
        }
        this.destino = destino;
    }

    public void actualizarDestino(String nuevoDestino) {
        setDestino(nuevoDestino);
    }
    
    public void actualizarDestino(String nuevoDestino, boolean express) {
        if (express) {
            setDestino(nuevoDestino + "[PRIORITARIO]");
        } else {
            setDestino(nuevoDestino);
        }
    }

    public abstract String obtenerDetalle();
}