package ar.edu.unahur.obj2.wtoj;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.Temporada;

public class Serie extends Contenido {
    private List<Temporada> temporadas = new ArrayList<>();

    public Serie(String titulo, Double costoBase, List<Temporada> temporadas) {
        super(titulo, costoBase);
        this.temporadas = temporadas;
    }

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }
    public void agregarTemporada(Temporada unTemporada){
        temporadas.add(unTemporada);
    }

    @Override
    protected Double doCosto() {
        return temporadas.stream().mapToDouble(t->costo()).average().orElse(0.0);
    }


}
