/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Datos.Libros;
import java.util.List;

/**
 *
 * @author danie
 */
public class Orden {
    public void bubbleSort(List<Libros> arreglo) {
        for (int i = 0; i < arreglo.size() - 1; i++) {
            for (int j = 0; j < arreglo.size() - i - 1; j++) {
                if (arreglo.get(j).getNombre().hashCode()> arreglo.get(j + 1).getNombre().hashCode()) {
                    Libros aux = arreglo.get(j);
                    arreglo.set(j, arreglo.get(j + 1));
                    arreglo.set(j + 1, aux);
                }
            }
        }
    }
}
