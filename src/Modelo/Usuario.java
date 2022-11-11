/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 * @author jeron
 * Clase para representar a los usuarios del sistema
 */
public class Usuario {
    /**
    *El nombre del usuario que actuará como identificador
    */
    private String nombre;
    
    /**
    *La contraseña usada por el usuario para acceder al sistema
    */
    private String contrasena;
    
    /**
     * Lista  de propiedades que pertenecen a este usuario
     */
    private List<Propiedad> propiedades;
    
    /**
     * Tipo de usuario: vecino/administrador 
     */
    private TipoUsuario tipoUsuario;
    
    /**
     * Teléfono del usuario
     */
    private String telefono;
    
    /**
     * Email del usuario
     */
    private String email;
    
    /**
     * Constructor base de usuario
     */
    public Usuario(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    
    /**
     * Recuperar nombre usuario
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Comprobar si el usuario tiene permisos de administrador
     */
    public boolean esAdministrador(){
        return this.tipoUsuario == TipoUsuario.Administrador;
    }
}
