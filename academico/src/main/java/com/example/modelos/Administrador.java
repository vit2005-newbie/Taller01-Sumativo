package com.example.modelos;

public class Administrador extends Usuario{

    public Administrador(String password, String usuario) {
        super(password, usuario);
    }


    public Usuario crearUsuarioConRol(String usuario,String password){
            Usuario u = new Usuario(usuario,password);
            return u;
            }


    public void asignarPermiso(String usuario){
        
    }

    public void actualizarSoftware(){
        
    }

    public void asignarResponsable(Curso curso, Profesor responsable){
    }
}
