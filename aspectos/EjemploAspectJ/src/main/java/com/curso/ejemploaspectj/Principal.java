/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.ejemploaspectj;

import beans.Mensaje;
import beans.Mensajero;
import beans.Persona;

/**
 *
 * @author usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Mensaje mensaje = new Mensaje();
        mensaje.setTexto("abc");
        System.out.println("Texto del mensaje: " + mensaje.getTexto());
        Mensajero mensajero = new Mensajero();
        mensajero.entregar("Mensaje uno");
        mensajero.entregar("Una persona", "Mensaje dos");
        Persona persona = new Persona();
        System.out.println(persona);
        System.out.println("Fin");
    }
    
}
