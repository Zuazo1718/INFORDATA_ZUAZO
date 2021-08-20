public class Cliente extends Persona{
    private int ci;
    private String direccion;
    private int telefono;
    private String fechaCompra;
    private String factura;

    public Cliente(int ci, String direccion, int telefono, String fechaCompra, String factura, String nombre, String primerApellido, String segundoApellido, String dni) {
        super(nombre,primerApellido,segundoApellido,dni);
        this.setCi(ci);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setFechaCompra(fechaCompra);
        this.setFactura(factura);
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}
