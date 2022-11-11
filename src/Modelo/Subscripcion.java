/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase que relaciona Propiedades y servicios
 * @author jeron
 */
public class Subscripcion {
    /**
     * Identificador de la suscripcion
     */
    private String identificador;
    
    /**
     * Tarifa aplicada a la subscripcion
     */
    private Tarifa tarifa;
    
    /**
     * Propiedad que contrata los servicios
     */
    private Propiedad propiedad;
    
    /**
     * Servicio contratado
     */
    private Servicio servicio;
    //Podria añadirse fecha de inicio/fin
}
