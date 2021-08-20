public class Monitores {
    private int codigoMonitos;
    private String modelo;
    private int resolucionMaxima;

    public Monitores(int codigoMonitos, String modelo, int resolucionMaxima) {
        this.setCodigoMonitos(codigoMonitos);
        this.setModelo(modelo);
        this.setResolucionMaxima(resolucionMaxima);
    }

    public int getCodigoMonitos() {
        return codigoMonitos;
    }

    public void setCodigoMonitos(int codigoMonitos) {
        this.codigoMonitos = codigoMonitos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(int resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }
}
