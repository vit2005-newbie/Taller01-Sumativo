package com.example.modelos;

import java.util.ArrayList;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private ActividadSumativa actividadesSumativas;
    private ArrayList<Foro> foros;
    private ArrayList<Estudiante> estudiantesInscritos;
    private ArrayList<Estudiante> estudiatesEnEsperaDeInscripcion;
    private Profesor responsable;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }
    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }
    public ActividadSumativa getActividadesSumativas() {
        return actividadesSumativas;
    }
    public void setActividadesSumativas(ActividadSumativa actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }
    
    public Profesor getResponsable() {
        return responsable;
    }
    public void setResponsable(Profesor responsable) {
        this.responsable = responsable;
    }

    public void setForos(ArrayList<Foro> foros) {
        this.foros = foros;
    }

    public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public void setEstudiatesEnEsperaDeInscripcion(ArrayList<Estudiante> estudiatesEnEsperaDeInscripcion) {
        this.estudiatesEnEsperaDeInscripcion = estudiatesEnEsperaDeInscripcion;
    }

    public ArrayList<Foro> getForos() {
        return foros;
    }

    public ArrayList<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public ArrayList<Estudiante> getEstudiatesEnEsperaDeInscripcion() {
        return estudiatesEnEsperaDeInscripcion;
    }

}
