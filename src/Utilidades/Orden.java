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

    public void bubbleSortArray(List<Libros> arreglo) {
        int n = arreglo.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo.get(j).getNombre().compareToIgnoreCase(arreglo.get(j+1).getNombre())>1) {
                    // swap arr[j+1] and arr[j]
                    Libros temp = arreglo.get(j);
                    arreglo.set(j, arreglo.get(j + 1));
                    arreglo.set(j + 1, temp);
                }
            }
        }
    }
    
}
