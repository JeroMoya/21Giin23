/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controladores.ControladorUsuario;
import Modelo.Usuario;
/**
 *
 * @author jeron
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Iniciando sesion");
        Usuario nuevo = ControladorUsuario.inicarSesion("jero", "1234");
        System.out.println("Sesion Iniciada: "+ nuevo.getNombre());
    }
    
}
