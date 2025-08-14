package ar.edu.unahur.obj2.wtoj.planes;

import java.util.List;

import ar.edu.unahur.obj2.wtoj.Contenido;
import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanBasico implements PlanSuscribible {
    private Integer limite;
    private Double costoBase;
    public PlanBasico(Integer limite, Double costoBase) {
        this.limite = limite;
        this.costoBase = costoBase;
    }
    @Override
    public Double costoPlan(Usuario usuario) {
        List<Contenido> contenidoUsuario = usuario.getContenidos();
        List<Contenido> excedentes = contenidoUsuario.subList(limite, contenidoUsuario);
        if(limite >= contenidoUsuario.size()){
            return costoBase;
        } else{
            return costoBase + excedentes.stream().mapToDouble(c -> c.costo());
        }

        
    }
    
    



}
