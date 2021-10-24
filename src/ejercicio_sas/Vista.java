/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_sas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JUAN DIEGO
 */
public class Vista extends javax.swing.JFrame {

    int filaseleccioanada;
    int i;
    int j;
    double id, roundDbl;
    
    String[] informacion = new String[12];

    DefaultTableModel dtmusu;

    /**
     * Creates new form Vista
     */
    public Vista() {

        initComponents();
        this.getContentPane().setBackground(Color.CYAN);

        dtmusu = new DefaultTableModel();
        dtmusu.addColumn("Primer Nombre");
        dtmusu.addColumn("Segundo Nombre");
        dtmusu.addColumn("Primer Apellido");
        dtmusu.addColumn("Segundo Apellido");
        dtmusu.addColumn("Pais ");
        dtmusu.addColumn("Tipo Identificación");
        dtmusu.addColumn("Número de identificación");
        dtmusu.addColumn("Corre");
        dtmusu.addColumn("Fecha Ingreso");
        dtmusu.addColumn("Area");
        dtmusu.addColumn("Estado");
        dtmusu.addColumn("Fecha y hora");

        this.jTable2.setModel(dtmusu);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        txtotronombre2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btbeditar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btbbuscar = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        txtprinombre = new javax.swing.JTextField();
        txtotronombre = new javax.swing.JTextField();
        txtprimerApellido = new javax.swing.JTextField();
        txtsegundoApellido = new javax.swing.JTextField();
        txtnumeroidentifi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcorre = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txttipoiden = new javax.swing.JComboBox<>();
        txtarea = new javax.swing.JComboBox<>();
        txtpais = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtotronombre1 = new javax.swing.JTextField();
        txtfechaingre = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtestado1 = new javax.swing.JLabel();
        txtfch = new javax.swing.JLabel();
        lblmss = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btbeliminar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jLabel14.setText("jLabel14");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ci.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("CIDENET"); // NOI18N
        getContentPane().setLayout(null);

        btbeditar.setText("EDITAR");
        btbeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbeditarActionPerformed(evt);
            }
        });
        getContentPane().add(btbeditar);
        btbeditar.setBounds(520, 50, 90, 23);
        btbeditar.getAccessibleContext().setAccessibleName("ELIMIINAR");
        btbeditar.getAccessibleContext().setAccessibleDescription("");

        btnagregar.setText("AGREGAR");
        btnagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnagregarMouseClicked(evt);
            }
        });
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar);
        btnagregar.setBounds(150, 670, 110, 23);

        btbbuscar.setLabel("BUSCAR");
        btbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbbuscar);
        btbbuscar.setBounds(300, 50, 90, 23);

        txtbuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbuscarCaretUpdate(evt);
            }
        });
        txtbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(10, 40, 280, 34);
        txtbuscar.getAccessibleContext().setAccessibleName("txtbuscar");

        txtprinombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprinombreActionPerformed(evt);
            }
        });
        txtprinombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprinombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtprinombre);
        txtprinombre.setBounds(136, 273, 170, 20);
        txtprinombre.getAccessibleContext().setAccessibleName("txtprinombre");

        txtotronombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtotronombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtotronombre);
        txtotronombre.setBounds(136, 304, 170, 20);

        txtprimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprimerApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtprimerApellido);
        txtprimerApellido.setBounds(136, 330, 170, 20);

        txtsegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsegundoApellidoActionPerformed(evt);
            }
        });
        txtsegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsegundoApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtsegundoApellido);
        txtsegundoApellido.setBounds(136, 356, 170, 20);

        txtnumeroidentifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumeroidentifiActionPerformed(evt);
            }
        });
        txtnumeroidentifi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumeroidentifiKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumeroidentifi);
        txtnumeroidentifi.setBounds(140, 450, 180, 20);

        jLabel2.setText("Otros Nombre:*");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 304, 98, 14);

        jLabel3.setText("Primer Apellido:*");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 333, 98, 14);

        jLabel4.setText("Segundo Apellido:*");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 359, 98, 14);

        jLabel5.setText("País del empleo*");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 390, 98, 14);

        jLabel6.setText("Tipo de Identificación*");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 410, 110, 14);

        jLabel7.setText("Número de Identificación*");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 450, 130, 14);
        getContentPane().add(txtcorreo);
        txtcorreo.setBounds(140, 480, 98, 0);

        jLabel9.setText("Fecha de ingreso*");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 580, 88, 14);

        jLabel11.setText("Área*");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 500, 60, 14);
        getContentPane().add(txtcorre);
        txtcorre.setBounds(150, 480, 70, 0);

        jLabel13.setText("Fecha y hora de registro: ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 620, 125, 14);

        txttipoiden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Cédula de Ciudadanía", " Cédula de Extranjería", " Pasaporte", " Permiso Especial" }));
        getContentPane().add(txttipoiden);
        txttipoiden.setBounds(140, 410, 130, 20);

        txtarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administración", "Financiera", " Compras", " Infraestructura", " Operación", " Talento Humano", " Servicios Varios" }));
        getContentPane().add(txtarea);
        txtarea.setBounds(140, 500, 106, 20);

        txtpais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombia ", " Estados Unidos" }));
        txtpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaisActionPerformed(evt);
            }
        });
        getContentPane().add(txtpais);
        txtpais.setBounds(140, 380, 80, 20);

        jLabel10.setBackground(new java.awt.Color(102, 255, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setText("BUSCAR");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 10, 100, 20);
        getContentPane().add(txtotronombre1);
        txtotronombre1.setBounds(136, 304, 170, 20);

        txtfechaingre.setDateFormatString("yyyy-MM-dd");
        txtfechaingre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechaingreKeyTyped(evt);
            }
        });
        getContentPane().add(txtfechaingre);
        txtfechaingre.setBounds(130, 580, 140, 20);

        jLabel15.setText("Primer Nombre:*");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 276, 98, 14);

        jTable2 = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setCellSelectionEnabled(true);
        jTable2.setDragEnabled(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 90, 1380, 120);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 480, 98, 0);

        jLabel17.setText("Estado:*");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 540, 70, 14);

        txtestado1.setText("Activo");
        getContentPane().add(txtestado1);
        txtestado1.setBounds(140, 540, 70, 14);
        getContentPane().add(txtfch);
        txtfch.setBounds(130, 630, 140, 30);

        lblmss.setText("Se genera automaticamente");
        getContentPane().add(lblmss);
        lblmss.setBounds(130, 610, 180, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ci.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 540, 286, 170);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ci.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 260, 286, 220);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ci.png"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(650, 410, 286, 180);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ci.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(930, 530, 286, 180);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ci.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(930, 280, 286, 180);

        btbeliminar.setText("ELIMINAR");
        btbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btbeliminar);
        btbeliminar.setBounds(420, 50, 90, 23);

        getAccessibleContext().setAccessibleName("CIDENET SAS");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtsegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsegundoApellidoActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed

        String n1 = txtprinombre.getText();
        String n2 = txtotronombre.getText();
        String ap1 = txtprimerApellido.getText();
        String ap2 = txtsegundoApellido.getText();
        if (txtprinombre.getText().isEmpty() || txtotronombre.getText().isEmpty()
                || txtprimerApellido.getText().isEmpty() || txtsegundoApellido.getText().
                isEmpty() || txtnumeroidentifi.getText().isEmpty() || n1.toLowerCase().contains("ñ") || n2.toLowerCase().contains("ñ")
                || ap1.toLowerCase().contains("ñ") || ap2.toLowerCase().contains("ñ")) {
            JOptionPane.showMessageDialog(this, "NO SE PUEDE DEJAR CAMPOS VACIOS E INCLUIR LA LETRA Ñ");
        } else {

            informacion[0] = txtprinombre.getText();
            informacion[1] = txtotronombre.getText();
            informacion[2] = txtprimerApellido.getText();
            informacion[3] = txtsegundoApellido.getText();
            informacion[4] = txtpais.getItemAt(WIDTH);
            informacion[5] = txttipoiden.getItemAt(WIDTH);
            informacion[6] = txtnumeroidentifi.getText();

            String evalu = null;
            id = (Math.random() * 100);

             roundDbl = Math.round(id * 100.0) / 100.0;
            

            if (informacion[4].equals(1)) {
                evalu = (txtprinombre.getText() + txtprimerApellido.getText() + roundDbl+ "@cidenet.com.co");
            } else {
                evalu = (txtprinombre.getText() + txtprimerApellido.getText() + roundDbl + "@cidenet.com.us");
            }

            if (evalu.length() >= 300) {
                JOptionPane.showMessageDialog(rootPane, "excede los limites del correo");

            } else {

                informacion[7] = evalu;
            }

            SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
            Date fe = new Date();
            fe = txtfechaingre.getDate();
            String fechaCadena = fecha.format(fe);

            informacion[8] = fechaCadena;
            informacion[9] = txtarea.getItemAt(WIDTH);
            informacion[10] = txtestado1.getText();

            DateTimeFormatter fecha2 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
            txtfch.setText(fecha2.format(LocalDateTime.now()));
            informacion[11] = txtfch.getText();
            dtmusu.addRow(informacion);

            txtprinombre.setText("");
            txtotronombre.setText("");
            txtprimerApellido.setText("");
            txtsegundoApellido.setText("");
            txtnumeroidentifi.setText("");

        }


    }//GEN-LAST:event_btnagregarActionPerformed

    private void txtpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpaisActionPerformed

    private void btbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbbuscarActionPerformed

        String buscar = txtbuscar.getText();

        if (buscar.isEmpty()) {
            jTable2.clearSelection();
            JOptionPane.showMessageDialog(this, "EL CAMPO ESTA VACIO");

        } else {

            for (i = 0; i < jTable2.getRowCount(); i++) {
                for (int j = 0; j < 10; j++) {
                    if (jTable2.getValueAt(i, j).equals(buscar)) {

                        jTable2.requestFocus();
                        jTable2.changeSelection(i, j, false, false);
                    }

                }
            }
        }


    }//GEN-LAST:event_btbbuscarActionPerformed

    private void txtprinombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprinombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprinombreActionPerformed

    private void txtnumeroidentifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroidentifiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroidentifiActionPerformed

    private void txtprinombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprinombreKeyTyped
        // TODO add your handling code here:

        if (txtprinombre.getText().length() >= 20) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "EXCEDE EL LIMITE DE CAMPO");

        }
    }//GEN-LAST:event_txtprinombreKeyTyped

    private void txtnumeroidentifiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumeroidentifiKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (txtnumeroidentifi.getText().length() >= 20) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "EXCEDE EL LIMITE DE CAMPO");

        }
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "SOLO SE PERMITE NÚMERO");
        }

    }//GEN-LAST:event_txtnumeroidentifiKeyTyped

    private void btnagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnagregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarMouseClicked

    private void txtfechaingreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaingreKeyTyped

    }//GEN-LAST:event_txtfechaingreKeyTyped

    private void btbeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbeditarActionPerformed
        // TODO add your handling code here:

        String[] informacion = new String[12];
        informacion[0] = txtprinombre.getText();
        informacion[1] = txtotronombre.getText();
        informacion[2] = txtprimerApellido.getText();
        informacion[3] = txtsegundoApellido.getText();
        informacion[4] = txtpais.getItemAt(WIDTH);
        informacion[5] = txttipoiden.getItemAt(WIDTH);
        informacion[6] = txtnumeroidentifi.getText();
        informacion[7] = (txtprinombre.getText() + txtsegundoApellido.getText() + roundDbl + "@cidenet.com");
        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        Date fe = new Date();
        fe = txtfechaingre.getDate();
        String fechaCadena = fecha.format(fe);

        informacion[8] = fechaCadena;

        informacion[9] = txtarea.getItemAt(WIDTH);
        informacion[10] = txtestado1.getText();

        DateTimeFormatter fecha2 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        txtfch.setText(fecha2.format(LocalDateTime.now()));
        informacion[11] = txtfch.getText();
        //dtmusu.addRow(informacion);

        for (int i = 0; i < jTable2.getColumnCount(); i++) {
            dtmusu.setValueAt(informacion[i], filaseleccioanada, i);

        }
        txtprinombre.setText("");
        txtotronombre.setText("");
        txtprimerApellido.setText("");
        txtsegundoApellido.setText("");
        txtnumeroidentifi.setText("");
    }//GEN-LAST:event_btbeditarActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:    

        //   txt.setText(jTable2.getValueAt(insert, 0).toString());
        int insert = jTable2.getSelectedRow();

        txtprinombre.setText(jTable2.getValueAt(insert, 0).toString());
        txtotronombre.setText(jTable2.getValueAt(insert, 1).toString());
        txtprimerApellido.setText(jTable2.getValueAt(insert, 2).toString());
        txtsegundoApellido.setText(jTable2.getValueAt(insert, 3).toString());
        txtnumeroidentifi.setText(jTable2.getValueAt(insert, 6).toString());


    }//GEN-LAST:event_jTable2MouseClicked

    private void txtbuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbuscarCaretUpdate
        // TODO add your handling code here:

    }//GEN-LAST:event_txtbuscarCaretUpdate

    private void txtotronombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtotronombreKeyTyped
        // TODO add your handling code here:
        if (txtotronombre.getText().length() >= 50) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "EXCEDE EL LIMITE DE CAMPO");

        }
    }//GEN-LAST:event_txtotronombreKeyTyped

    private void txtprimerApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprimerApellidoKeyTyped
        // TODO add your handling code here:
        if (txtprimerApellido.getText().length() >= 20) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "EXCEDE EL LIMITE DE CAMPO");

        }
    }//GEN-LAST:event_txtprimerApellidoKeyTyped

    private void txtsegundoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsegundoApellidoKeyTyped
        // TODO add your handling code here:
        if (txtsegundoApellido.getText().length() >= 20) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "EXCEDE EL LIMITE DE CAMPO");

        }
    }//GEN-LAST:event_txtsegundoApellidoKeyTyped

    private void btbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbeliminarActionPerformed
        // TODO add your handling code here:
        if (jTable2.getSelectedRow()==-1) 
            return;
        
            dtmusu.removeRow(jTable2.getSelectedRow());
        
        
        
    }//GEN-LAST:event_btbeliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbbuscar;
    private javax.swing.JButton btbeditar;
    private javax.swing.JButton btbeliminar;
    private javax.swing.JButton btnagregar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblmss;
    private javax.swing.JComboBox<String> txtarea;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JLabel txtcorre;
    private javax.swing.JLabel txtcorreo;
    private javax.swing.JLabel txtestado1;
    private javax.swing.JLabel txtfch;
    private com.toedter.calendar.JDateChooser txtfechaingre;
    private javax.swing.JTextField txtnumeroidentifi;
    private javax.swing.JTextField txtotronombre;
    private javax.swing.JTextField txtotronombre1;
    private javax.swing.JTextField txtotronombre2;
    private javax.swing.JComboBox<String> txtpais;
    private javax.swing.JTextField txtprimerApellido;
    private javax.swing.JTextField txtprinombre;
    private javax.swing.JTextField txtsegundoApellido;
    private javax.swing.JComboBox<String> txttipoiden;
    // End of variables declaration//GEN-END:variables
}
