package ar.edu;

public class Idra {
    private static Idra instance = new Idra();
    private Idra(){} // Constructor anuado
    private Double valor= 0.5;
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public static Idra getInstance(){
        return instance;
    }

}
