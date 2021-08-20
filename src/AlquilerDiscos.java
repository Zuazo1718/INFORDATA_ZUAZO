public class AlquilerDiscos {
    private int codAlquilerDiscos;
    private int precioHora;
    private String capacidad;

    public AlquilerDiscos(int codAlquilerDiscos, int precioHora, String capacidad) {
        this.setCodAlquilerDiscos(codAlquilerDiscos);
        this.setPrecioHora(precioHora);
        this.setCapacidad(capacidad);
    }

    public int getCodAlquilerDiscos() {
        return codAlquilerDiscos;
    }

    public void setCodAlquilerDiscos(int codAlquilerDiscos) {
        this.codAlquilerDiscos = codAlquilerDiscos;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
