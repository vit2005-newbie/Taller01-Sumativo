package com.example.modelos;

import java.util.ArrayList;

public class Profesor extends PersonalAcademico{
    private ArrayList<Curso> cursosACargo;

    public Profesor(String password, String usuario) {
        super(password, usuario);
    }

    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
    }

    public float calificarActividadSumativa(Curso curso,Estudiante estudiante,ActividadSumativa actividadSumativa){
        float calificacion = 0;
        System.out.println("Calificando");
        return calificacion;
    }

    public void aceptarinscripcion(Curso curso,String usuarioEstudiante){
    }

    public void crearNuevoForo(Foro foro){
    }

    public ArrayList<Curso> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(ArrayList<Curso> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }
}
