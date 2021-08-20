public class AlquilerDeMonitores {
    private int codAlquiler;
    private String PreciosHora;

    public AlquilerDeMonitores(int codAlquiler, String preciosHora) {
        this.setCodAlquiler(codAlquiler);
        setPreciosHora(preciosHora);
    }

    public int getCodAlquiler() {
        return codAlquiler;
    }

    public void setCodAlquiler(int codAlquiler) {
        this.codAlquiler = codAlquiler;
    }

    public String getPreciosHora() {
        return PreciosHora;
    }

    public void setPreciosHora(String preciosHora) {
        PreciosHora = preciosHora;
    }
}
