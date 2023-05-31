package utilidad;

import informacion.Libros;
import java.util.ArrayList;
import java.util.Arrays;
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

    public void mergeSortArray(Libros[] arreglo, int tamano) {
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
        mergeSortArray(l, mid);
        mergeSortArray(r, tamano - mid);

        mergeArray(arreglo, l, r, mid, tamano - mid);
    }

    public void mergeArray(Libros[] arreglo, Libros[] l, Libros[] r, int left, int right) {

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

    public void countingLinked(LinkedList<Libros> arreglo, int exp) {

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

    public void countingArray(Libros[] arreglo, int exp) {

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

    public void countingSortArray(Libros[] arreglo) {
        int n = arreglo.length;

        String maxAñoSalida = Arrays.stream(arreglo)
                .map(Libros::getAno)
                .max(String::compareTo)
                .orElse("");
        String minAñoSalida = Arrays.stream(arreglo)
                .map(Libros::getAno)
                .min(String::compareTo)
                .orElse("");

        int range = Integer.parseInt(maxAñoSalida) - Integer.parseInt(minAñoSalida) + 1;

        int[] count = new int[range];
        for (Libros libro : arreglo) {
            int index = Integer.parseInt(libro.getAno()) - Integer.parseInt(minAñoSalida);
            count[index]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        Libros[] sortedArr = new Libros[n];
        for (int i = n - 1; i >= 0; i--) {
            int index = Integer.parseInt(arreglo[i].getAno()) - Integer.parseInt(minAñoSalida);
            sortedArr[count[index] - 1] = arreglo[i];
            count[index]--;
        }

        System.arraycopy(sortedArr, 0, arreglo, 0, n);
    }

    public void countingSortLinked(LinkedList<Libros> arreglo) {
        int n = arreglo.size();

        String maxAñoSalida = arreglo.stream()
                .map(Libros::getAno)
                .max(String::compareTo)
                .orElse("");
        String minAñoSalida = arreglo.stream()
                .map(Libros::getAno)
                .min(String::compareTo)
                .orElse("");

        int range = Integer.parseInt(maxAñoSalida) - Integer.parseInt(minAñoSalida) + 1;

        int[] count = new int[range];
        for (Libros libro : arreglo) {
            int index = Integer.parseInt(libro.getAno()) - Integer.parseInt(minAñoSalida);
            count[index]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        LinkedList<Libros> sortedList = new LinkedList<>();
        for (int i = n - 1; i >= 0; i--) {
            int index = Integer.parseInt(arreglo.get(i).getAno()) - Integer.parseInt(minAñoSalida);
            sortedList.addFirst(arreglo.get(i));
            count[index]--;
        }

        arreglo.clear();
        arreglo.addAll(sortedList);
    }

    public void radixSortLinked(LinkedList<Libros> arreglo) {

        int b = 0;
        for (Libros libro : arreglo) {
            int anos = Integer.parseInt(libro.getAno());
            if (anos > b) {
                b = anos;
            }
        }

        for (int exp = 1; b / exp > 0; exp *= 10) {
            countingLinked(arreglo, exp);
        }
    }

    public void radixSortArray(Libros[] arreglo) {

        int v = 0;
        for (Libros libro : arreglo) {
            int anos3 = Integer.parseInt(libro.getAno());
            if (anos3 > v) {
                v = anos3;
            }
        }

        for (int exp = 1; v / exp > 0; exp *= 10) {
            countingArray(arreglo, exp);
        }
    }
}
