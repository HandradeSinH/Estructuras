/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import Datos.Libros;
import Utilidades.Orden;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Andrade
 */
public class Ventana extends javax.swing.JFrame {

    private List<Libros> listaLibros;
    
    public Ventana() {
        initComponents();
        this.setTitle("AppLibros");
        listaLibros = new ArrayList<>();
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
        listaOrdenada = new javax.swing.JTextArea();
        ordenar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaSinOrdenar = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        ordeanrbubblearray = new javax.swing.JButton();
        ordenar2 = new javax.swing.JButton();
        ordenar3 = new javax.swing.JButton();
        ordenar4 = new javax.swing.JButton();
        ordenar5 = new javax.swing.JButton();
        ordenar6 = new javax.swing.JButton();
        ordenar7 = new javax.swing.JButton();

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
        jLabel3.setText("Autor:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 140, 120, 30);

        agregar.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel2.add(agregar);
        agregar.setBounds(370, 60, 120, 110);

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LISTA ORDENADA");
        jLabel7.setToolTipText("");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1130, 70, 230, 30);

        jLabel8.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("LIBROS");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 10, 110, 30);

        listaOrdenada.setColumns(20);
        listaOrdenada.setRows(5);
        jScrollPane1.setViewportView(listaOrdenada);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(1040, 110, 410, 200);

        ordenar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenar.setText("MergeSort LinkedList");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });
        jPanel2.add(ordenar);
        ordenar.setBounds(320, 250, 190, 30);

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LISTA DE LIBROS");
        jLabel9.setToolTipText("");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(650, 70, 230, 30);

        listaSinOrdenar.setColumns(20);
        listaSinOrdenar.setRows(5);
        jScrollPane2.setViewportView(listaSinOrdenar);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(560, 110, 410, 200);

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel4.setText("Seleccione el Metodo de Ordenamiento");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(130, 180, 280, 30);

        ordeanrbubblearray.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordeanrbubblearray.setText("BubbleSort ArrayList");
        ordeanrbubblearray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordeanrbubblearrayActionPerformed(evt);
            }
        });
        jPanel2.add(ordeanrbubblearray);
        ordeanrbubblearray.setBounds(70, 210, 180, 30);

        ordenar2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenar2.setText("BubbleSort LinkedList");
        ordenar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenar2ActionPerformed(evt);
            }
        });
        jPanel2.add(ordenar2);
        ordenar2.setBounds(320, 210, 190, 30);

        ordenar3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenar3.setText("MergeSort ArrayList");
        ordenar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenar3ActionPerformed(evt);
            }
        });
        jPanel2.add(ordenar3);
        ordenar3.setBounds(70, 250, 180, 30);

        ordenar4.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenar4.setText("RadixSort LinkedList");
        ordenar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenar4ActionPerformed(evt);
            }
        });
        jPanel2.add(ordenar4);
        ordenar4.setBounds(320, 290, 190, 30);

        ordenar5.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenar5.setText("CountingSort ArrayList");
        ordenar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenar5ActionPerformed(evt);
            }
        });
        jPanel2.add(ordenar5);
        ordenar5.setBounds(70, 330, 180, 30);

        ordenar6.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenar6.setText("CountingSort LinkedList");
        ordenar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenar6ActionPerformed(evt);
            }
        });
        jPanel2.add(ordenar6);
        ordenar6.setBounds(320, 330, 190, 30);

        ordenar7.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        ordenar7.setText("RadixSort ArrayList");
        ordenar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenar7ActionPerformed(evt);
            }
        });
        jPanel2.add(ordenar7);
        ordenar7.setBounds(70, 290, 180, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 1480, 380);

        setSize(new java.awt.Dimension(1517, 416));
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

    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        ordenar(listaLibros);
    }//GEN-LAST:event_ordenarActionPerformed

    private void ordeanrbubblearrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordeanrbubblearrayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordeanrbubblearrayActionPerformed

    private void ordenar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenar2ActionPerformed

    private void ordenar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenar3ActionPerformed

    private void ordenar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenar4ActionPerformed

    private void ordenar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenar5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenar5ActionPerformed

    private void ordenar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenar6ActionPerformed

    private void ordenar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordenar7ActionPerformed

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
    private javax.swing.JTextField cajaAutor;
    private javax.swing.JTextField cajaGenero;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextArea listaOrdenada;
    private javax.swing.JTextArea listaSinOrdenar;
    private javax.swing.JButton ordeanrbubblearray;
    private javax.swing.JButton ordenar;
    private javax.swing.JButton ordenar2;
    private javax.swing.JButton ordenar3;
    private javax.swing.JButton ordenar4;
    private javax.swing.JButton ordenar5;
    private javax.swing.JButton ordenar6;
    private javax.swing.JButton ordenar7;
    // End of variables declaration//GEN-END:variables

    private void ingresar() {
        String nombre = cajaNombre.getText();
        String autor = cajaAutor.getText();
        String genero = cajaGenero.getText();
        String n = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
        String a = autor.toUpperCase().charAt(0) + autor.substring(1, autor.length()).toLowerCase();
        String g = genero.toUpperCase().charAt(0) + genero.substring(1, genero.length()).toLowerCase();
        Libros nuevoLibro = new Libros(n, a, g);
        listaLibros.add(nuevoLibro);
        actualizaListado1(listaLibros);
    }

    private void actualizaListado1(List<Libros> listas) {
        StringBuilder lista = new StringBuilder();
        for (Libros libros : listas) {
            lista.append(libros.toString()).append("\n");
        }
        listaSinOrdenar.setText(lista.toString());
    }

    private void actualizaListado2(List<Libros> listas) {
        StringBuilder lista = new StringBuilder();
        for (Libros libros : listas) {
            lista.append(libros.toString()).append("\n");
        }
        listaOrdenada.setText(lista.toString());
    }

    private void ordenar(List<Libros> lista) {
        Orden orden = new Orden();
        orden.bubbleSortArray(lista);
        actualizaListado2(lista);
    }

    private void salir() {
        System.exit(0);
    }
}
