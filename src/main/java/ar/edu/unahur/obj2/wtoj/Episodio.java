package ar.edu.unahur.obj2.wtoj;

public class Episodio {
    private final Integer numero;
    private final String tituo;
    private Double costo;
    public Episodio(Integer numero, String tituo, Double costo) {
        this.numero = numero;
        this.tituo = tituo;
        this.costo = costo;
    }
    public Integer getNumero() {
        return numero;
    }
    public String getTituo() {
        return tituo;
    }
    public Double getCosto() {
        return costo;
    }
    public void setCosto(Double costo) {
        this.costo = costo;
    }
    
    
}
