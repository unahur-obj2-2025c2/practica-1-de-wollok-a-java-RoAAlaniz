package ar.edu.unahur.obj2.wtoj.usuario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.Contenido;
import ar.edu.unahur.obj2.wtoj.planes.PlanSuscribible;

public class Usuario {
    private PlanSuscribible plan;
    private List<Contenido> contenidos= new ArrayList<>();
    public Usuario(PlanSuscribible plan) {
        this.plan = plan;
    }
    public Usuario(PlanSuscribible plan, List<Contenido> contenidos) {
        this.plan = plan;
        this.contenidos = contenidos;
    }
    public PlanSuscribible getPlan() {
        return plan;
    }
    public void setPlan(PlanSuscribible plan) {
        this.plan = plan;
    }
    
    public void verContenido (Contenido contenido){
        contenidos.add(contenido);
    }
    public List<Contenido> getContenidos() {
        return contenidos;
    }
    public void setContenidos(List<Contenido> contenidos) {
        this.contenidos = contenidos;
    } 

}
