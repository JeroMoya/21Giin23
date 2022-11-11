/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Usuario;
import Servicios.ServicioUsuario;

/**
 *
 * @author jeron
 * Esta clase se encargara de recibir y gestionar las peticiones
 * relacionadas con los usuarios
 */


public class ControladorUsuario {
    private static final ServicioUsuario _servicioUsuario = new ServicioUsuario();
    
    public static Usuario inicarSesion(String nombre, String contrasena){
        Usuario usuarioInicio = _servicioUsuario.validarInicioSesion(nombre, contrasena);
        return usuarioInicio;
    }
}
