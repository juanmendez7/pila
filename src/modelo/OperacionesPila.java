/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author juan_esteban.mendez
 */
public class OperacionesPila {
    public <T extends Base> Pila<T> pilaDuplicada(Pila<T> pilaOriginal){
        Pila<T> pilaDuplicada = new Pila<>();
        Pila<T> pilaAuxiliar = new Pila<>();
        
        while (!pilaOriginal.estaVacia()){
             T element=pilaOriginal.desapilar();
             pilaAuxiliar.apilar(element);
        }
        
        while(!pilaAuxiliar.estaVacia()){
            T element=pilaAuxiliar.desapilar();
            T copiaelement= (T) element.copy();
            
            pilaOriginal.apilar(element);
            pilaDuplicada.apilar(element);
            
        }
        
        return pilaDuplicada;
    }
    
}
