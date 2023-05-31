package utilidad;

import informacion.Libros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class Orden {

    public void bubbleSortLinked(LinkedList<Libros> arreglo) {
        int n = arreglo.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo.get(j).getNombre().compareToIgnoreCase(arreglo.get(j + 1).getNombre()) > 1) {

                    Libros temp = arreglo.get(j);
                    arreglo.set(j, arreglo.get(j + 1));
                    arreglo.set(j + 1, temp);
                }
            }
        }
    }

    public void bubbleSortArray(Libros[] arreglo) {
        for (int n = arreglo.length, i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arreglo[j].getNombre().compareToIgnoreCase(arreglo[j + 1].getNombre()) > arreglo[j + 1].getNombre().compareToIgnoreCase(arreglo[j + 1].getNombre())) {
                    Libros temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    private void mergeLinked(LinkedList<Libros> arreglo, LinkedList<Libros> pIzq, LinkedList<Libros> pDer) {
        int i = 0;
        int j = 0;
        int k = 0;

        // Combinar las dos partes en orden ascendente
        while (i < pIzq.size() && j < pDer.size()) {
            if (pIzq.get(i).getNombre().compareTo(pDer.get(j).getNombre()) <= 0) {
                arreglo.set(k, pIzq.get(i));
                i++;
            } else {
                arreglo.set(k, pDer.get(j));
                j++;
            }
            k++;
        }
    }

    public void mergeSortLinked(LinkedList<Libros> arreglo) {
        if (arreglo.size() <= 1) {
            return;
        }
        int medio = arreglo.size() / 2;
        LinkedList<Libros> pIzq = new LinkedList<>(arreglo.subList(0, medio));
        LinkedList<Libros> pDer = new LinkedList<>(arreglo.subList(medio, arreglo.size()));
        mergeSortLinked(pIzq);
        mergeSortLinked(pDer);
        mergeLinked(arreglo, pDer, pIzq);
    }

    public void mergeSort(Libros[] arreglo, int tamano) {
        if (tamano < 2) {
            return;
        }
        int mid = tamano / 2;
        Libros[] l = new Libros[mid];
        Libros[] r = new Libros[tamano - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arreglo[i];
        }
        for (int i = mid; i < tamano; i++) {
            r[i - mid] = arreglo[i];
        }
        mergeSort(l, mid);
        mergeSort(r, tamano - mid);

        merge(arreglo, l, r, mid, tamano - mid);
    }

    public void merge(Libros[] arreglo, Libros[] l, Libros[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getNombre().compareToIgnoreCase(arreglo[j + 1].getNombre()) <= r[j].getNombre().compareToIgnoreCase(arreglo[j + 1].getNombre())) {
                arreglo[k++] = l[i++];
            } else {
                arreglo[k++] = r[j++];
            }
        }
        while (i < left) {
            arreglo[k++] = l[i++];
        }
        while (j < right) {
            arreglo[k++] = r[j++];
        }
    }
    public void countingSortLinked(LinkedList<Libros> arreglo, int exp) {
        
        int n = arreglo.size();
        ArrayList<Libros> output = new ArrayList<>(Collections.nCopies(n, null));

        int[] count = new int[10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int anos = Integer.parseInt(arreglo.get(i).getAno());
            int digit = (anos / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int anos1 = Integer.parseInt(arreglo.get(i).getAno());
            int digit = (anos1 / exp) % 10;
            output.set(count[digit] - 1, arreglo.get(i));
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            arreglo.set(i, output.get(i));
        }
    }
    public void countingSortArray(Libros[] arreglo, int exp) {
        
        int n = arreglo.length;
        ArrayList<Libros> output = new ArrayList<>(Collections.nCopies(n, null));

        int[] count = new int[10];
        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int anos = Integer.parseInt(arreglo[i].getAno());
            int digit = (anos / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int anos1 = Integer.parseInt(arreglo[i].getAno());
            int digit = (anos1 / exp) % 10;
            output.set(count[digit] - 1, arreglo[i]);
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            arreglo[i] = output.get(i);
        }
    }
    public void radixSortLinked(LinkedList<Libros> arreglo) {
        // Encontrar el valor máximo en el número de temporadas
        int maxSeasons = 0;
        for (Libros libro : arreglo) {
            int anos = Integer.parseInt(libro.getAno());
            if (anos > maxSeasons) {
                maxSeasons = anos;
            }
        }

        for (int exp = 1; maxSeasons / exp > 0; exp *= 10) {
            countingSortLinked(arreglo, exp);
        }
    }
    public void radixSortArray(Libros[] arreglo) {
        // Encontrar el valor máximo en el número de temporadas
        int maxSeasons = 0;
        for (Libros libro : arreglo) {
            int anos3 = Integer.parseInt(libro.getAno());
            if (anos3 > maxSeasons) {
                maxSeasons = anos3;
            }
        }

        // Realizar el ordenamiento radix sort
        for (int exp = 1; maxSeasons / exp > 0; exp *= 10) {
            countingSortArray(arreglo, exp);
        }
    }
}
