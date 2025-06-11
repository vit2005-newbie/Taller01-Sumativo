package com.example.modelos;

import java.util.Date;

public abstract class ActividadSumativa {
    protected String titulo;
    protected Date fechaDeEntrega;
    protected float puntajeMax;
    protected String contenido;
    protected float calificacion;
    protected String id;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }
    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }
    public float getPuntajeMax() {
        return puntajeMax;
    }
    public void setPuntajeMax(float puntajeMax) {
        this.puntajeMax = puntajeMax;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public float getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
