package com.example.modelos;

import java.util.ArrayList;


public class Usuario {
    protected String usuario;
    protected String password;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Incidente> incidentes;

    public Usuario(String password, String usuario) {
        this.password = password;
        this.usuario = usuario;
    }

    protected boolean logIn(){
        return true;
    }



    protected boolean logOut(){
        return true;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/*    public void AtenderIncidentes(ArrayList<Incidente> listaIncidentes, int indice){
        if(indice >0){
            listaIncidentes.remove(indice);
        }
    }*/

    
}
