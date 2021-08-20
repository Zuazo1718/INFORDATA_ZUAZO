import java.util.List;

public class EmpresaFabricante {
    private String nombre;
    private String direccion;
    private int numeroEmpleados;
    private List<Provedores> provedores;

    public EmpresaFabricante(String nombre, String direccion,List<Provedores> provedores, int numeroEmpleados){
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setProvedores(provedores);
        this.setNumeroEmpleados(numeroEmpleados);
    }

    public EmpresaFabricante(String nombre, String direccion, int numeroEmpleados) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setNumeroEmpleados(numeroEmpleados);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
    public List<Provedores> getProvedores() {
        return provedores;
    }

    public void setProvedores(List<Provedores> provedores) {
        this.provedores = provedores;
    }

    @Override
    public String toString() {
        return "EmpresaFabricante{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroEmpleados=" + numeroEmpleados +
                '}';
    }
}
