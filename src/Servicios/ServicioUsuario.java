/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Modelo.Usuario;

/**
 *
 * @author jeron
 */
public class ServicioUsuario {
    public Usuario validarInicioSesion(String nombre, String contrasena){
        //TODO Acceso a base de datos para devolver el usuario
        return new Usuario(nombre,contrasena);
    }
}
