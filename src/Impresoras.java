public class Impresoras {
    private String codImpresora;
    private String ModeloImpresora;
    private int velocidad;

    public Impresoras(String codImpresora, String modeloImpresora, int velocidad) {
        this.setCodImpresora(codImpresora);
        setModeloImpresora(modeloImpresora);
        this.setVelocidad(velocidad);
    }

    public String getCodImpresora() {
        return codImpresora;
    }

    public void setCodImpresora(String codImpresora) {
        this.codImpresora = codImpresora;
    }

    public String getModeloImpresora() {
        return ModeloImpresora;
    }

    public void setModeloImpresora(String modeloImpresora) {
        ModeloImpresora = modeloImpresora;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
