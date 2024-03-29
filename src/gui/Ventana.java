package gui;

import informacion.Libros;
import utilidad.Orden;
import java.util.LinkedList;

/**
 *
 * @author Daniel Andrade
 */
public class Ventana extends javax.swing.JFrame {

    private LinkedList<Libros> listaLibrosLinked = new LinkedList<>();
    private Libros[] listalibrosArray = new Libros[1];
    private Orden orden = new Orden();

    public Ventana() {
        initComponents();
        this.setTitle("5 Por Favor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        cajaNombre = new javax.swing.JTextField();
        cajaAutor = new javax.swing.JTextField();
        cajaGenero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaOrdenadaLinked = new javax.swing.JTextArea();
        ordenarmergeLinked = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSinOrdenar = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        ordeanrbubblearray = new javax.swing.JButton();
        ordenarbubbleLinked = new javax.swing.JButton();
        ordenarmergeArray = new javax.swing.JButton();
        ordenaradixLinked = new javax.swing.JButton();
        ordenarcountingArray = new javax.swing.JButton();
        ordenarcountingLinked = new javax.swing.JButton();
        ordenaradixArray = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cajaAno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaOrdenadaArray = new javax.swing.JTextArea();
        exit = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        jPanel2.add(cajaNombre);
        cajaNombre.setBounds(140, 60, 200, 30);
        cajaNombre.getAccessibleContext().setAccessibleName("Nombre");

        cajaAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAutorActionPerformed(evt);
            }
        });
        jPanel2.add(cajaAutor);
        cajaAutor.setBounds(140, 140, 200, 30);
        cajaAutor.getAccessibleContext().setAccessibleName("Autor");

        cajaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaGeneroActionPerformed(evt);
            }
        });
        jPanel2.add(cajaGenero);
        cajaGenero.setBounds(140, 100, 200, 30);
        cajaGenero.getAccessibleContext().setAccessibleName("Genero");

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre del libro:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 60, 140, 30);

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Genero:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 100, 130, 30);

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Año de Salida:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 180, 120, 30);

        agregar.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel2.add(agregar);
        agregar.setBounds(370, 60, 110, 150);

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LISTA ORDENADA(LinkedList)");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(740, 380, 370, 30);

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LIBROS");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(230, 10, 110, 30);

        listaOrdenadaLinked.setColumns(20);
        listaOrdenadaLinked.setRows(5);
        jScrollPane1.setViewportView(listaOrdenadaLinked);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(560, 420, 690, 130);

        ordenarmergeLinked.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenarmergeLinked.setText("MergeSort LinkedList");
        ordenarmergeLinked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarmergeLinkedActionPerformed(evt);
            }
        });
        jPanel2.add(ordenarmergeLinked);
        ordenarmergeLinked.setBounds(320, 380, 190, 30);

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LISTA DE LIBROS");
        jLabel9.setToolTipText("");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(810, 30, 230, 30);

        listaSinOrdenar.setColumns(20);
        listaSinOrdenar.setRows(5);
        jScrollPane2.setViewportView(listaSinOrdenar);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(560, 70, 690, 120);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel4.setText("Orden por año de salida");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(200, 440, 170, 30);

        ordeanrbubblearray.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordeanrbubblearray.setText("BubbleSort Array");
        ordeanrbubblearray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordeanrbubblearrayActionPerformed(evt);
            }
        });
        jPanel2.add(ordeanrbubblearray);
        ordeanrbubblearray.setBounds(70, 340, 180, 30);

        ordenarbubbleLinked.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenarbubbleLinked.setText("BubbleSort LinkedList");
        ordenarbubbleLinked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarbubbleLinkedActionPerformed(evt);
            }
        });
        jPanel2.add(ordenarbubbleLinked);
        ordenarbubbleLinked.setBounds(320, 340, 190, 30);

        ordenarmergeArray.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenarmergeArray.setText("MergeSort Array");
        ordenarmergeArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarmergeArrayActionPerformed(evt);
            }
        });
        jPanel2.add(ordenarmergeArray);
        ordenarmergeArray.setBounds(70, 380, 180, 30);

        ordenaradixLinked.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenaradixLinked.setText("RadixSort LinkedList");
        ordenaradixLinked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenaradixLinkedActionPerformed(evt);
            }
        });
        jPanel2.add(ordenaradixLinked);
        ordenaradixLinked.setBounds(320, 490, 190, 30);

        ordenarcountingArray.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenarcountingArray.setText("CountingSort Array");
        ordenarcountingArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarcountingArrayActionPerformed(evt);
            }
        });
        jPanel2.add(ordenarcountingArray);
        ordenarcountingArray.setBounds(70, 530, 180, 30);

        ordenarcountingLinked.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenarcountingLinked.setText("CountingSort LinkedList");
        ordenarcountingLinked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarcountingLinkedActionPerformed(evt);
            }
        });
        jPanel2.add(ordenarcountingLinked);
        ordenarcountingLinked.setBounds(320, 530, 190, 30);

        ordenaradixArray.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenaradixArray.setText("RadixSort Array");
        ordenaradixArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenaradixArrayActionPerformed(evt);
            }
        });
        jPanel2.add(ordenaradixArray);
        ordenaradixArray.setBounds(70, 490, 180, 30);

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel5.setText("Orden Alfabetico");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(220, 290, 130, 30);

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 2, 18)); // NOI18N
        jLabel6.setText("Seleccione el Metodo de Ordenamiento");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(110, 240, 360, 30);

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Autor:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(50, 140, 120, 30);

        cajaAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaAnoActionPerformed(evt);
            }
        });
        jPanel2.add(cajaAno);
        cajaAno.setBounds(140, 180, 200, 30);

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("LISTA ORDENADA(Arreglo)");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(750, 200, 340, 30);

        listaOrdenadaArray.setColumns(20);
        listaOrdenadaArray.setRows(5);
        jScrollPane3.setViewportView(listaOrdenadaArray);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(560, 240, 690, 130);

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(860, 563, 100, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 1280, 600);

        setSize(new java.awt.Dimension(1320, 669));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAutorActionPerformed

    private void cajaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaGeneroActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        ingresar();
    }//GEN-LAST:event_agregarActionPerformed

    private void ordenarmergeLinkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarmergeLinkedActionPerformed
        mergeLinked(listaLibrosLinked);
    }//GEN-LAST:event_ordenarmergeLinkedActionPerformed

    private void ordeanrbubblearrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordeanrbubblearrayActionPerformed
        bubbleArray(listalibrosArray);
    }//GEN-LAST:event_ordeanrbubblearrayActionPerformed

    private void ordenarbubbleLinkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarbubbleLinkedActionPerformed
        bubbleLinked(listaLibrosLinked);
    }//GEN-LAST:event_ordenarbubbleLinkedActionPerformed

    private void ordenarmergeArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarmergeArrayActionPerformed
        mergeArray(listalibrosArray);
    }//GEN-LAST:event_ordenarmergeArrayActionPerformed

    private void ordenaradixLinkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenaradixLinkedActionPerformed
        radixLinked(listaLibrosLinked);
    }//GEN-LAST:event_ordenaradixLinkedActionPerformed

    private void ordenarcountingArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarcountingArrayActionPerformed
        countingArray(listalibrosArray);
    }//GEN-LAST:event_ordenarcountingArrayActionPerformed

    private void ordenarcountingLinkedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarcountingLinkedActionPerformed
        countingLinked(listaLibrosLinked);
    }//GEN-LAST:event_ordenarcountingLinkedActionPerformed

    private void ordenaradixArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenaradixArrayActionPerformed
        radixArray(listalibrosArray);
    }//GEN-LAST:event_ordenaradixArrayActionPerformed

    private void cajaAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaAnoActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        salir();
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField cajaAno;
    private javax.swing.JTextField cajaAutor;
    private javax.swing.JTextField cajaGenero;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextArea listaOrdenadaArray;
    private javax.swing.JTextArea listaOrdenadaLinked;
    private javax.swing.JTextArea listaSinOrdenar;
    private javax.swing.JButton ordeanrbubblearray;
    private javax.swing.JButton ordenaradixArray;
    private javax.swing.JButton ordenaradixLinked;
    private javax.swing.JButton ordenarbubbleLinked;
    private javax.swing.JButton ordenarcountingArray;
    private javax.swing.JButton ordenarcountingLinked;
    private javax.swing.JButton ordenarmergeArray;
    private javax.swing.JButton ordenarmergeLinked;
    // End of variables declaration//GEN-END:variables

    private void ingresar() {

        String nombre = cajaNombre.getText();
        String autor = cajaAutor.getText();
        String genero = cajaGenero.getText();
        String ano = cajaAno.getText();
        String n = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
        String a = autor.toUpperCase().charAt(0) + autor.substring(1, autor.length()).toLowerCase();
        String g = genero.toUpperCase().charAt(0) + genero.substring(1, genero.length()).toLowerCase();
        Libros nuevoLibro = new Libros(n, a, g, ano);

        listaLibrosLinked.add(nuevoLibro);
        listalibrosArray = listaLibrosLinked.toArray(new Libros[listaLibrosLinked.size()]);

    }

    private void actualizaListado(LinkedList<Libros> listas) {
        StringBuilder lista = new StringBuilder();
        for (Libros libros : listas) {
            lista.append(libros.toString()).append("\n");
        }
        listaSinOrdenar.setText(lista.toString());
    }

    private void actualizaListadOrdenadoLinked(LinkedList<Libros> listas) {
        StringBuilder lista = new StringBuilder();
        for (Libros libros : listas) {
            lista.append(libros.toString()).append("\n");
        }
        listaOrdenadaLinked.setText(lista.toString());
    }

    private void actualizaListadOrdenadaArray(Libros[] listas) {
        StringBuilder lista1 = new StringBuilder();
        for (Libros libros : listas) {
            lista1.append(libros.toString()).append("\n");
        }
        listaOrdenadaArray.setText(lista1.toString());
    }

    private void bubbleLinked(LinkedList<Libros> lista) {
        orden.bubbleSortLinked(lista);
        actualizaListadOrdenadoLinked(lista);
    }

    private void bubbleArray(Libros[] listA) {
        orden.bubbleSortArray(listA);
        actualizaListadOrdenadaArray(listA);
    }

    private void mergeLinked(LinkedList<Libros> lista) {
        orden.mergeSortLinked(lista);
        actualizaListadOrdenadoLinked(lista);
    }

    private void mergeArray(Libros[] listA) {
        orden.mergeSortArray(listA, listA.length);
        actualizaListadOrdenadaArray(listA);
    }

    private void countingLinked(LinkedList<Libros> lista) {
        orden.countingSortLinked(lista);
        actualizaListadOrdenadoLinked(lista);
    }

    private void countingArray(Libros[] listA) {
        orden.countingSortArray(listA);
        actualizaListadOrdenadaArray(listA);
    }

    private void radixLinked(LinkedList<Libros> lista) {
        orden.radixSortLinked(lista);
        actualizaListadOrdenadoLinked(lista);
    }

    private void radixArray(Libros[] listA) {
        orden.radixSortArray(listA);
        actualizaListadOrdenadaArray(listA);
    }

    private void salir() {
        System.exit(0);
    }
}
