/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Productos;
import java.util.LinkedList;
import modelo.Pila;

/**
 *
 * @author juan_esteban.mendez
 */
public class MainPila{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila<Productos> listaP = new Pila<>();
        listaP.apilar(new Productos("mandarina",2,7000));
        listaP.apilar(new Productos("manzana",6,3000));
        listaP.apilar(new Productos("papa",1,2000));
        listaP.apilar(new Productos("papaya",7,8000));
        listaP.apilar(new Productos("tacos",4,19000));
        listaP.apilar(new Productos("hot dog",1,3000));
        
        System.out.println("Pila\n" + listaP.toString());
        listaP.desapilar();
        System.out.println("Pila\n" + listaP.toString());
        System.out.println("");
    }
    
}
