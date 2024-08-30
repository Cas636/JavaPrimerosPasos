package main;

import Controlador.Interaccion;
import Modelo.Logica;
import Vista.Ventana;

public class Principal {

    public static void main(String[] args) {
        Ventana vista_prueba = new Ventana();
        Logica modelo_prueba = new Logica();
        
        Interaccion controlador_prueba =new Interaccion(vista_prueba, modelo_prueba);
        
        vista_prueba.setVisible(true);

    }

}
