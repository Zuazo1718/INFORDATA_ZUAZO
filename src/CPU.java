public class CPU {
    private int codCPU;
    private String modelo;
    private int memoriaPrincipal;
    private String PaisOrigen;
    private String fechaFabricacion;

    public CPU(int codCPU, String modelo, int memoriaPrincipal, String paisOrigen, String fechaFabricacion) {
        this.setCodCPU(codCPU);
        this.setModelo(modelo);
        this.setMemoriaPrincipal(memoriaPrincipal);
        setPaisOrigen(paisOrigen);
        this.setFechaFabricacion(fechaFabricacion);
    }

    public int getCodCPU() {
        return codCPU;
    }

    public void setCodCPU(int codCPU) {
        this.codCPU = codCPU;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }
}
