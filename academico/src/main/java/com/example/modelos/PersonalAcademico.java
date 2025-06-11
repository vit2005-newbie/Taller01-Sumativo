package com.example.modelos;

import java.util.ArrayList;

public class PersonalAcademico extends Usuario{
    protected ArrayList<Incidente> incidentes;

    public PersonalAcademico(String password, String usuario) {
        super(password, usuario);
    }

    
    public void reportarError(String email,String contenido){
    }

    public boolean solicitarAsesoramientoDelSistema(String email, String contenido){
        return true;
    }

    public void comentarEnForo(Foro foro,String comentario){
    }

    public ArrayList<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(ArrayList<Incidente>  listaIncidentes) {
        this.incidentes = listaIncidentes;
    }
    
}
