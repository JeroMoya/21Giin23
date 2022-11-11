/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 * Pago correspondiente a una subscripcion y un periodo de tiempo
 * @author jeron
 */
public class Liquidación {
    /**
     * Identificador de la liquidacion
     */
    private String Identificador;
    
    /**
     * Fecha inicio del periodo
     */
    private Date fechaInicio;
    
    /**
     * Fecha fin del periodo
     */
    private Date fechaFin;
    
    /**
     * Subscripcion asociada a la liquidacion
     */
    private Subscripcion subscripcion;
    
    /**
     * Define si el pago ha sido realizado
     */
    private Boolean pagado;
}
