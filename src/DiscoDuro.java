public class DiscoDuro {
    private int fechaFavricadaD;
    private int capacidadD;
    private String codHDD;

    public DiscoDuro(int fechaFavricadaD, int capacidadD, String codHDD) {
        this.setFechaFavricadaD(fechaFavricadaD);
        this.setCapacidadD(capacidadD);
        this.setCodHDD(codHDD);
    }

    public int getFechaFavricadaD() {
        return fechaFavricadaD;
    }

    public void setFechaFavricadaD(int fechaFavricadaD) {
        this.fechaFavricadaD = fechaFavricadaD;
    }

    public int getCapacidadD() {
        return capacidadD;
    }

    public void setCapacidadD(int capacidadD) {
        this.capacidadD = capacidadD;
    }

    public String getCodHDD() {
        return codHDD;
    }

    public void setCodHDD(String codHDD) {
        this.codHDD = codHDD;
    }
}
