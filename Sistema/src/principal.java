
import java.awt.BorderLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Anderson
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    String CI_Lab;
    Conexion con = new Conexion();
     Object[][] data = con.datosExamenes();
    String[] columnas = {"CODIGO", "TIPO","NOMBRE","COSTO"};
    DefaultTableModel modelo = new DefaultTableModel(data, columnas) {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };
    String[] columnasPAC = {"CODIGO", "TIPO","NOMBRE","COSTO","RESULTADO"};
    DefaultTableModel modeloPac = new DefaultTableModel(null,columnasPAC) {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };
    //DefaultTableModel ListaExaPac = new DefaultTableModel();
    public principal() {
        initComponents();
        pnlFondo fondo = new pnlFondo(1366, 768);
        this.add(fondo, BorderLayout.CENTER);
        this.pack();
        fondo.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        
        //jTableListaExamenesPac.setModel(ListaExaPac);
    }

    public principal(String CI) {
        initComponents();
        CI_Lab = CI;
        pnlFondo fondo = new pnlFondo(1366, 768);
        this.add(fondo, BorderLayout.CENTER);
        this.pack();
        fondo.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);

        // jTableListaExamenes.setModel(listaExamenes);
        //jTableListaExamenesPac.setModel(ListaExaPac);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBarHerramientas = new javax.swing.JToolBar();
        jButton2Abrir = new javax.swing.JButton();
        jButton3Guardar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4NewUser = new javax.swing.JButton();
        jButton5AddUser = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton6Reportes = new javax.swing.JButton();
        jToolBarUsuarios = new javax.swing.JToolBar();
        jLabelNomUSR = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonSalir_TollBar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1CICliente = new javax.swing.JTextField();
        jButton1BUSCAR = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Nom_cli = new javax.swing.JTextField();
        jTextFieldApe_cli = new javax.swing.JTextField();
        jTextFieldEdad_cli = new javax.swing.JTextField();
        jTextFieldTel_cli = new javax.swing.JTextField();
        jTextFieldCorr_cli = new javax.swing.JTextField();
        jTextFieldDir_cli = new javax.swing.JTextField();
        jTextFieldCel_cli = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaExamenesPac = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaExamenes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Archivo = new javax.swing.JMenu();
        jMenuItemNuevo = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuItemAbrir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBarHerramientas.setRollover(true);

        jButton2Abrir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Desktop\\Sistema\\img\\carpeta (1).png")); // NOI18N
        jButton2Abrir.setFocusable(false);
        jButton2Abrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2Abrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarHerramientas.add(jButton2Abrir);

        jButton3Guardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Desktop\\Sistema\\img\\save.png")); // NOI18N
        jButton3Guardar.setFocusable(false);
        jButton3Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3Guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarHerramientas.add(jButton3Guardar);
        jToolBarHerramientas.add(jSeparator3);

        jButton4NewUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Desktop\\Sistema\\img\\user.png")); // NOI18N
        jButton4NewUser.setFocusable(false);
        jButton4NewUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4NewUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4NewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4NewUserActionPerformed(evt);
            }
        });
        jToolBarHerramientas.add(jButton4NewUser);

        jButton5AddUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Desktop\\Sistema\\img\\useradd.png")); // NOI18N
        jButton5AddUser.setFocusable(false);
        jButton5AddUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5AddUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5AddUserActionPerformed(evt);
            }
        });
        jToolBarHerramientas.add(jButton5AddUser);
        jToolBarHerramientas.add(jSeparator4);

        jButton6Reportes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Desktop\\Sistema\\img\\print.png")); // NOI18N
        jButton6Reportes.setFocusable(false);
        jButton6Reportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6Reportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarHerramientas.add(jButton6Reportes);

        jToolBarUsuarios.setRollover(true);

        jLabelNomUSR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNomUSR.setText("Anderson Naranjo");
        jToolBarUsuarios.add(jLabelNomUSR);
        jToolBarUsuarios.add(jSeparator2);

        jButtonSalir_TollBar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Desktop\\Sistema\\src\\img\\exit.png")); // NOI18N
        jButtonSalir_TollBar.setFocusable(false);
        jButtonSalir_TollBar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalir_TollBar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalir_TollBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalir_TollBarActionPerformed(evt);
            }
        });
        jToolBarUsuarios.add(jButtonSalir_TollBar);

        jLabel1.setText("CÉDULA: ");

        jButton1BUSCAR.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\Desktop\\Sistema\\img\\loupe.png")); // NOI18N
        jButton1BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BUSCARActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        jLabel4.setText("EDAD:");

        jLabel5.setText("TELÉFONO:");

        jLabel6.setText("CELULAR:");

        jLabel7.setText("CORREO: ");

        jLabel8.setText("DIRECCIÓN:");

        jTextField_Nom_cli.setEditable(false);

        jTextFieldApe_cli.setEditable(false);

        jTextFieldEdad_cli.setEditable(false);

        jTextFieldTel_cli.setEditable(false);

        jTextFieldCorr_cli.setEditable(false);

        jTextFieldDir_cli.setEditable(false);

        jTextFieldCel_cli.setEditable(false);

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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEdad_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldApe_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTel_cli)
                            .addComponent(jTextFieldCel_cli, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(35, 35, 35)
                            .addComponent(jTextFieldDir_cli))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(46, 46, 46)
                            .addComponent(jTextFieldCorr_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
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
                            .addComponent(jTextFieldApe_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldEdad_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldCorr_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldDir_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldTel_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldCel_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jTableListaExamenesPac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableListaExamenesPac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "TIPO", "NOMBRE", "COSTO"
            }
        ));
        jTableListaExamenesPac.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(jTableListaExamenesPac);

        jTableListaExamenes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableListaExamenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "TIPO", "NOMBRE", "COSTO"
            }
        ));
        jTableListaExamenes.setFillsViewportHeight(true);
        jTableListaExamenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListaExamenesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableListaExamenes);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu_Archivo.setText("Archivo");

        jMenuItemNuevo.setText("Nuevo");
        jMenu_Archivo.add(jMenuItemNuevo);

        jMenuItemGuardar.setText("Guardar");
        jMenu_Archivo.add(jMenuItemGuardar);

        jMenuItemAbrir.setText("Abrir");
        jMenu_Archivo.add(jMenuItemAbrir);
        jMenu_Archivo.add(jSeparator1);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu_Archivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenu_Archivo);

        jMenu2.setText("ver");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1CICliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1BUSCAR))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBarHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1CICliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1BUSCAR, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jButtonSalir_TollBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalir_TollBarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        login log = new login();
        log.setVisible(true);
    }//GEN-LAST:event_jButtonSalir_TollBarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ResultSet res = con.busquedLabo(CI_Lab);
        try {
            while (res.next()) {
                jLabelNomUSR.setText(res.getString(2) + " " + res.getString(3));
            }

        } catch (SQLException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        jTableListaExamenes.setModel(modelo);
        jTableListaExamenesPac.setModel(modeloPac);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BUSCARActionPerformed
        // TODO add your handling code here:
        String ci_cli = jTextField1CICliente.getText();
        if (Auxiliar.verificarCedula(ci_cli) == 1) {
            ResultSet res = con.datos_cli(ci_cli);
            try {
                while (res.next()) {
                    String[] edad = res.getString(3).split(" ");
                    jTextField_Nom_cli.setText(res.getString(1));
                    jTextFieldApe_cli.setText(res.getString(2));
                    jTextFieldEdad_cli.setText(edad[0]);
                    jTextFieldTel_cli.setText(res.getString(4));
                    jTextFieldCel_cli.setText(res.getString(5));
                    jTextFieldCorr_cli.setText(res.getString(6));
                    jTextFieldDir_cli.setText(res.getString(7));

                }
            } catch (SQLException ex) {
                Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jTextField1CICliente.setText("");
        }

    }//GEN-LAST:event_jButton1BUSCARActionPerformed

    private void jButton4NewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4NewUserActionPerformed
        // TODO add your handling code here:
        NewClient dialog = new NewClient(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton4NewUserActionPerformed

   

    private void jTableListaExamenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListaExamenesMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == 1) {
            // JOptionPane.showMessageDialog(null, "Pulso el izquierdo");
            if (evt.getClickCount() == 2) {
                TableModel modelo = jTableListaExamenes.getModel();
                int a = jTableListaExamenes.getSelectedRow();// evento al dar doble clic en la lista de los examenes para trasladarlo a la lista del paciente
                         
                    //JOptionPane.showMessageDialog(this, modelo.getValueAt(a, 0).toString());
                    Object[] d = new Object[4];
                    d[0]=modelo.getValueAt(a, 0);
                    d[1]=modelo.getValueAt(a, 1);
                    d[2]=modelo.getValueAt(a, 2);
                    d[3]=modelo.getValueAt(a, 3);
                    modeloPac.addRow(d);
                    jTableListaExamenesPac.setModel(modeloPac);
            }
        } else {
            //JOptionPane.showMessageDialog(null, "Pulso el derecho");

        }

    }//GEN-LAST:event_jTableListaExamenesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TableModel modelo = jTableListaExamenes.getModel();
        int a = jTableListaExamenes.getSelectedRow();
        int b = jTableListaExamenes.getSelectedRowCount();
        for (int i = 0; i < b; i++) {
            //JOptionPane.showMessageDialog(this, modelo.getValueAt(a, 0).toString());
             Object[] d = new Object[4];
                    d[0]=modelo.getValueAt(a, 0);
                    d[1]=modelo.getValueAt(a, 1);
                    d[2]=modelo.getValueAt(a, 2);
                    d[3]=modelo.getValueAt(a, 3);
                    modeloPac.addRow(d);
                    jTableListaExamenesPac.setModel(modeloPac);
            a += 1;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5AddUserActionPerformed
        // TODO add your handling code here:
         EditClient dialog = new EditClient(new javax.swing.JFrame(), true);
         dialog.setVisible(true);
         
    }//GEN-LAST:event_jButton5AddUserActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1BUSCAR;
    private javax.swing.JButton jButton2Abrir;
    private javax.swing.JButton jButton3Guardar;
    private javax.swing.JButton jButton4NewUser;
    private javax.swing.JButton jButton5AddUser;
    private javax.swing.JButton jButton6Reportes;
    private javax.swing.JButton jButtonSalir_TollBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelNomUSR;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAbrir;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemNuevo;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenu_Archivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTable jTableListaExamenes;
    private javax.swing.JTable jTableListaExamenesPac;
    private javax.swing.JTextField jTextField1CICliente;
    private javax.swing.JTextField jTextFieldApe_cli;
    private javax.swing.JTextField jTextFieldCel_cli;
    private javax.swing.JTextField jTextFieldCorr_cli;
    private javax.swing.JTextField jTextFieldDir_cli;
    private javax.swing.JTextField jTextFieldEdad_cli;
    private javax.swing.JTextField jTextFieldTel_cli;
    private javax.swing.JTextField jTextField_Nom_cli;
    private javax.swing.JToolBar jToolBarHerramientas;
    private javax.swing.JToolBar jToolBarUsuarios;
    // End of variables declaration//GEN-END:variables
}
