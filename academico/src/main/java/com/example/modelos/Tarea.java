package com.example.modelos;

import java.util.Date;

public class Tarea extends ActividadSumativa {
    private Date fechaDePublicacion;

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
}
