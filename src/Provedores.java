public class Provedores extends Persona{
    private int NIF;
    private String fechaAlquiler;
    private String direccion;
    private String servicioTecno;

    public Provedores(int NIF, String fechaAlquiler, String direccion, String servicioTecno,String nombre, String primerApellido, String segundoApellido, String dni) {
        super(nombre,primerApellido,segundoApellido,dni);
        this.setNIF(NIF);
        this.setFechaAlquiler(fechaAlquiler);
        this.setDireccion(direccion);
        this.setServicioTecno(servicioTecno);
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getServicioTecno() {
        return servicioTecno;
    }

    public void setServicioTecno(String servicioTecno) {
        this.servicioTecno = servicioTecno;
    }

    @Override
    public String toString() {
        return "Provedores{" +
                "NIF=" + NIF +
                ", fechaAlquiler='" + fechaAlquiler + '\'' +
                ", direccion='" + direccion + '\'' +
                ", servicioTecno='" + servicioTecno + '\'' +
                '}';
    }
}
