
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ander
 */
public class Facturacion extends javax.swing.JFrame {

    /**
     * Creates new form Facturacion
     */
    public Facturacion() {
        initComponents();
    }
    Conexion con = new Conexion();
    String CI_Cli;
    
        private void limpiado_Bloqueo() {
        ////////////////////////////////77
//        int fil = modeloPac.getRowCount() - 1;
//        //  Limpiado del jTable de paciente
//        if (fil >= 0) {
//            for (int j = fil; j >= 0; j--) {
//                modeloPac.removeRow(modeloPac.getRowCount() - 1);
//
//            }
//        }
        //limpiado de los jTextFiel

        jTextField1CICliente.setText("");
        jTextField_Nom_cli.setText("");
        jTextFieldApe_cli.setText("");

        jTextFieldTel_cli.setText("");
        jTextFieldCel_cli.setText("");
//        jTextFieldNumConsult.setText("");
        jTextFieldDir_cli.setText("");
//        jTextFieldTotal.setText("");
//        jTextFieldFecCon.setText("");
//        total = 0;
//        jTableListaExamenesPac.setEnabled(false);
//        jTableListaExamenes.setEnabled(false);
        //jTextFieldBuscarExamen.setEnabled(false);

        ///////////////////////////////////7
    }
    private void busquedaLlenadoCliente(String ci_cli) {
        if (Auxiliar.verificarCedula(ci_cli) == 1) {
            ResultSet res = con.datos_cli(ci_cli);
            try {
                while (res.next()) {
                    String[] edad = res.getString(3).split(" ");
                    jTextField_Nom_cli.setText(res.getString(1));
                    jTextFieldApe_cli.setText(res.getString(2));
                    
                    jTextFieldTel_cli.setText(res.getString(4));
                    jTextFieldCel_cli.setText(res.getString(5));
                    
                    jTextFieldDir_cli.setText(res.getString(7));
                    
                }
                Calendar c = new GregorianCalendar();
                String dia = Integer.toString(c.get(Calendar.DATE));
                String mes = Integer.toString(c.get(Calendar.MONTH));
                String año = Integer.toString(c.get(Calendar.YEAR));
               
                
                int consulta = con.contConsltas() + 1;
//                jTextFieldNumConsult.setText(String.valueOf(consulta));
            } catch (SQLException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            limpiado_Bloqueo();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogClientes = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jTextFieldBuscaCliente = new javax.swing.JTextField();
        cmbBusquedaCliente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDialogConsultas = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableBusConsultas = new javax.swing.JTable();
        jTextFieldBuscaConsultas = new javax.swing.JTextField();
        cmbBusquedaConsultas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Nom_cli = new javax.swing.JTextField();
        jTextFieldApe_cli = new javax.swing.JTextField();
        jTextFieldTel_cli = new javax.swing.JTextField();
        jTextFieldDir_cli = new javax.swing.JTextField();
        jTextFieldCel_cli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1CICliente = new javax.swing.JTextField();
        jButton1BUSCAR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsultas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableClientes);

        jTextFieldBuscaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldBuscaClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBuscaClienteFocusLost(evt);
            }
        });
        jTextFieldBuscaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscaClienteMouseClicked(evt);
            }
        });
        jTextFieldBuscaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaClienteKeyTyped(evt);
            }
        });

        cmbBusquedaCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA", "NOMBRE", "APELLIDO", "CORREO" }));

        javax.swing.GroupLayout jDialogClientesLayout = new javax.swing.GroupLayout(jDialogClientes.getContentPane());
        jDialogClientes.getContentPane().setLayout(jDialogClientesLayout);
        jDialogClientesLayout.setHorizontalGroup(
            jDialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialogClientesLayout.createSequentialGroup()
                        .addComponent(cmbBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialogClientesLayout.setVerticalGroup(
            jDialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldBuscaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(cmbBusquedaCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTableBusConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableBusConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBusConsultasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableBusConsultas);

        jTextFieldBuscaConsultas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldBuscaConsultasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBuscaConsultasFocusLost(evt);
            }
        });
        jTextFieldBuscaConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscaConsultasMouseClicked(evt);
            }
        });
        jTextFieldBuscaConsultas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaConsultasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaConsultasKeyTyped(evt);
            }
        });

        cmbBusquedaConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA", "NOMBRE", "APELLIDO", "CORREO" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("CONSULTAS");

        javax.swing.GroupLayout jDialogConsultasLayout = new javax.swing.GroupLayout(jDialogConsultas.getContentPane());
        jDialogConsultas.getContentPane().setLayout(jDialogConsultasLayout);
        jDialogConsultasLayout.setHorizontalGroup(
            jDialogConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogConsultasLayout.createSequentialGroup()
                .addGroup(jDialogConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogConsultasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialogConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDialogConsultasLayout.createSequentialGroup()
                                .addComponent(cmbBusquedaConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBuscaConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jDialogConsultasLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel4)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jDialogConsultasLayout.setVerticalGroup(
            jDialogConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogConsultasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jDialogConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldBuscaConsultas)
                    .addComponent(cmbBusquedaConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.setOpaque(false);

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        jLabel5.setText("TELÉFONO:");

        jLabel6.setText("CELULAR:");

        jLabel8.setText("DIRECCIÓN:");

        jTextField_Nom_cli.setEditable(false);
        jTextField_Nom_cli.setOpaque(false);

        jTextFieldApe_cli.setEditable(false);
        jTextFieldApe_cli.setOpaque(false);

        jTextFieldTel_cli.setEditable(false);
        jTextFieldTel_cli.setOpaque(false);

        jTextFieldDir_cli.setEditable(false);
        jTextFieldDir_cli.setOpaque(false);

        jTextFieldCel_cli.setEditable(false);
        jTextFieldCel_cli.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50)
                                .addComponent(jTextField_Nom_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)
                                .addComponent(jTextFieldApe_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTel_cli)
                            .addComponent(jTextFieldCel_cli, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(jTextFieldDir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Nom_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldApe_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldTel_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldCel_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldDir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setText("CÉDULA: ");

        jTextField1CICliente.setFocusCycleRoot(true);
        jTextField1CICliente.setFocusTraversalPolicyProvider(true);
        jTextField1CICliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1CIClienteFocusGained(evt);
            }
        });
        jTextField1CICliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1CIClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1CIClienteKeyTyped(evt);
            }
        });

        jButton1BUSCAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loupe.png"))); // NOI18N
        jButton1BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BUSCARActionPerformed(evt);
            }
        });

        tblConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblConsultas);

        jButton1.setText("Añanir Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jTextField1CICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1BUSCAR)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1CICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1BUSCAR, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1CIClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1CIClienteFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1CIClienteFocusGained

    private void jTextField1CIClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1CIClienteKeyReleased
        // TODO add your handling code here:
        int d= jTextField1CICliente.getText().length();
        CI_Cli=jTextField1CICliente.getText();
        if (d==10) {
            String ci_cli = jTextField1CICliente.getText();
            busquedaLlenadoCliente(ci_cli);
        }
    }//GEN-LAST:event_jTextField1CIClienteKeyReleased

    private void jTextField1CIClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1CIClienteKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1CIClienteKeyTyped

    private void jButton1BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BUSCARActionPerformed
        // TODO add your handling code here:
        jDialogClientes.setVisible(true);
        jDialogClientes.setSize(500, 220);
        jDialogClientes.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1BUSCARActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        // TODO add your handling code here:
        int c= evt.getClickCount();
        if(c==2){
            int a= jTableClientes.getSelectedRow();
            String ce = jTableClientes.getValueAt(a,0).toString();
            jTextField1CICliente.setText(ce);
            String ci_cli = jTextField1CICliente.getText();
            busquedaLlenadoCliente(ci_cli);
            jDialogClientes.setVisible(false);
        }
    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jTextFieldBuscaClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBuscaClienteFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextFieldBuscaClienteFocusGained

    private void jTextFieldBuscaClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBuscaClienteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaClienteFocusLost

    private void jTextFieldBuscaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscaClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaClienteMouseClicked

    private void jTextFieldBuscaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaClienteKeyReleased
        // TODO add your handling code here:

        String tip =cmbBusquedaCliente.getSelectedItem().toString().trim();
        Object[][] d;
        Object[] c={"DEDULA", "NOMBRE", "APELLIDO", "E-MAIL","DIRECCION"};
        d = con.bus_cli(jTextFieldBuscaCliente.getText().trim(),tip);
        DefaultTableModel mode = new DefaultTableModel(d, c) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        jTableClientes.setModel(mode);

    }//GEN-LAST:event_jTextFieldBuscaClienteKeyReleased

    private void jTextFieldBuscaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaClienteKeyTyped

    private void jTableBusConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBusConsultasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableBusConsultasMouseClicked

    private void jTextFieldBuscaConsultasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBuscaConsultasFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaConsultasFocusGained

    private void jTextFieldBuscaConsultasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBuscaConsultasFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaConsultasFocusLost

    private void jTextFieldBuscaConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscaConsultasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaConsultasMouseClicked

    private void jTextFieldBuscaConsultasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaConsultasKeyReleased
        // TODO add your handling code here:
        String tip =cmbBusquedaCliente.getSelectedItem().toString().trim();
        Object[][] d;
        Object[] c={"COD", "NOMBRES","EXAMENES","COSTO","ABONO"};
        
        DefaultTableModel mode = new DefaultTableModel( null, c) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        String bus=jTextField1CICliente.getText();
        Connection cn = con.cc;
        
        ResultSet res = null;
        String sql="";
        try {
                if (tip.equals("CEDULA")) {
                sql = "SELECT CED_CLI,NOM_CLI,APE_CLI,"
                        + "E_MAIL,DIR_CLI FROM CLIENTES WHERE CED_CLI LIKE '" + bus + "%'";
                 
                }
                if (tip.equals("NOMBRE")) {
                    sql = "SELECT CED_CLI,NOM_CLI,APE_CLI,"
                        + "E_MAIL,DIR_CLI FROM CLIENTES WHERE NOM_CLI LIKE '%" + bus + "%'";
                 
                }
                if (tip.equals("APELLIDO")) {
                     sql = "SELECT CED_CLI,NOM_CLI,APE_CLI,"
                        + "E_MAIL,DIR_CLI FROM CLIENTES WHERE APE_CLI LIKE '%" + bus + "%'";
                 
                }
            

            PreparedStatement pstm = cn.prepareStatement(sql);
            res = pstm.executeQuery();
            int i = 0;
            Object[] row = new Object[5];
            while (res.next()) {

                row[0] = res.getString(1);
                row[1] = res.getString(2);
                row[2] = res.getString(3);
                row[3] = res.getString(4);
                row[4] = res.getString(5);

                mode.addRow(row);
            }
            tblConsultas.setModel(mode);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        jTableClientes.setModel(mode);
        
        
    }//GEN-LAST:event_jTextFieldBuscaConsultasKeyReleased

    private void jTextFieldBuscaConsultasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaConsultasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaConsultasKeyTyped

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
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbBusquedaCliente;
    private javax.swing.JComboBox<String> cmbBusquedaConsultas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1BUSCAR;
    private javax.swing.JDialog jDialogClientes;
    private javax.swing.JDialog jDialogConsultas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableBusConsultas;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextField1CICliente;
    private javax.swing.JTextField jTextFieldApe_cli;
    private javax.swing.JTextField jTextFieldBuscaCliente;
    private javax.swing.JTextField jTextFieldBuscaConsultas;
    private javax.swing.JTextField jTextFieldCel_cli;
    private javax.swing.JTextField jTextFieldDir_cli;
    private javax.swing.JTextField jTextFieldTel_cli;
    private javax.swing.JTextField jTextField_Nom_cli;
    private javax.swing.JTable tblConsultas;
    // End of variables declaration//GEN-END:variables
}
