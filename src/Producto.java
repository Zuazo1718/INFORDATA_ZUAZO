public class Producto {
    private int codProducto;
    private int codAlquiler;
    private String modelo;

    public Producto(int codProducto, int codAlquiler, String modelo) {
        this.setCodProducto(codProducto);
        this.setCodAlquiler(codAlquiler);
        this.setModelo(modelo);
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getCodAlquiler() {
        return codAlquiler;
    }

    public void setCodAlquiler(int codAlquiler) {
        this.codAlquiler = codAlquiler;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codProducto=" + codProducto +
                ", codAlquiler=" + codAlquiler +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
