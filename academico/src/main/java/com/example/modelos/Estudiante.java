package com.example.modelos;

import java.util.ArrayList;

public class Estudiante extends PersonalAcademico{
    private ArrayList<Curso> cursos;

    public Estudiante(String password, String usuario) {
        super(password, usuario);
    }

    public void solicitarinscripcionCurso(Curso curso){
        
    }

    public void realizarActividadSumativa(Curso curso,ActividadSumativa actividadSumativa){
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
}
