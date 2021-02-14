package com.firmino;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class App extends javax.swing.JFrame {

    private final static String VERSION = "1.3";

    public App() {
        FlatDarkLaf.install();
        initComponents();
        updateTable("Sucesso: Lista atualizada.");
        mVersionText.setText("Versão "+VERSION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        mLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mEditorID = new javax.swing.JSpinner();
        mEditorAutor = new javax.swing.JTextField();
        mEditorNome = new javax.swing.JTextField();
        mEditorDisciplina = new javax.swing.JComboBox<>();
        mEditorData = new javax.swing.JTextField();
        mEditorAno = new javax.swing.JComboBox<>();
        mEditorTurma = new javax.swing.JComboBox<>();
        mEditorLink = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        mButtonAdd = new javax.swing.JButton();
        mButtonEdit = new javax.swing.JButton();
        mButtonDelete = new javax.swing.JButton();
        mButtonRefresh = new javax.swing.JButton();
        mButtonNovo = new javax.swing.JButton();
        mOpenPlanilhas = new javax.swing.JButton();
        mImport = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        mStatusText = new javax.swing.JLabel();
        mButtonGithub = new javax.swing.JButton();
        mVersionText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMJPS - Gerenciador de Banco de Dados");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        mMainPanel.setForeground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        mLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mLogo.setIcon(new javax.swing.ImageIcon("res/logo.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setBorder(null);

        mTable.setBackground(new java.awt.Color(51, 51, 51));
        mTable.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mTable.setForeground(new java.awt.Color(204, 204, 204));
        mTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Autor", "Disciplina", "Data", "Link", "Ano", "Turma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mTable.setName("mTable"); // NOI18N
        mTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        mTable.getTableHeader().setReorderingAllowed(false);
        mTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(mTable);
        if (mTable.getColumnModel().getColumnCount() > 0) {
            mTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            mTable.getColumnModel().getColumn(0).setMaxWidth(30);
            mTable.getColumnModel().getColumn(3).setPreferredWidth(40);
            mTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            mTable.getColumnModel().getColumn(6).setPreferredWidth(20);
            mTable.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel2Layout = new java.awt.GridBagLayout();
        jPanel2Layout.columnWidths = new int[] {0, 10, 0, 10, 0, 10, 0};
        jPanel2Layout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        jPanel2.setLayout(jPanel2Layout);

        jLabel1.setBackground(new java.awt.Color(60, 63, 64));
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel1.setMaximumSize(new java.awt.Dimension(85, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(85, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(60, 63, 64));
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOME");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel2.setMaximumSize(new java.awt.Dimension(170, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(170, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setBackground(new java.awt.Color(60, 63, 64));
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AUTOR");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel3.setMaximumSize(new java.awt.Dimension(170, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(170, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setBackground(new java.awt.Color(60, 63, 64));
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DISCIPLINA");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel4.setMaximumSize(new java.awt.Dimension(110, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(110, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(60, 63, 64));
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DATA");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel5.setMaximumSize(new java.awt.Dimension(85, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(85, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setBackground(new java.awt.Color(60, 63, 64));
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LINK");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel6.setMaximumSize(new java.awt.Dimension(85, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(85, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel7.setBackground(new java.awt.Color(60, 63, 64));
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ANO");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel7.setMaximumSize(new java.awt.Dimension(85, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(85, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel8.setBackground(new java.awt.Color(60, 63, 64));
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TURMA");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel8.setMaximumSize(new java.awt.Dimension(85, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(85, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        jPanel2.add(jLabel8, gridBagConstraints);

        mEditorID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorID.setModel(new javax.swing.SpinnerNumberModel(1, 0, 99999, 1));
        mEditorID.setMaximumSize(new java.awt.Dimension(85, 20));
        mEditorID.setMinimumSize(new java.awt.Dimension(85, 20));
        mEditorID.setPreferredSize(new java.awt.Dimension(85, 20));
        mEditorID.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mEditorIDStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(mEditorID, gridBagConstraints);

        mEditorAutor.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorAutor.setMaximumSize(new java.awt.Dimension(170, 20));
        mEditorAutor.setMinimumSize(new java.awt.Dimension(170, 20));
        mEditorAutor.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorAutor, gridBagConstraints);

        mEditorNome.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorNome.setMaximumSize(new java.awt.Dimension(170, 20));
        mEditorNome.setMinimumSize(new java.awt.Dimension(170, 20));
        mEditorNome.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorNome, gridBagConstraints);

        mEditorDisciplina.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português", "Matemática", "Ciências", "Geografia", "História", "Inglês", "Artes", "Ed. Física", "Religião" }));
        mEditorDisciplina.setMaximumSize(new java.awt.Dimension(110, 20));
        mEditorDisciplina.setMinimumSize(new java.awt.Dimension(110, 20));
        mEditorDisciplina.setPreferredSize(new java.awt.Dimension(110, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(mEditorDisciplina, gridBagConstraints);

        mEditorData.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorData.setMaximumSize(new java.awt.Dimension(85, 20));
        mEditorData.setMinimumSize(new java.awt.Dimension(85, 20));
        mEditorData.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(mEditorData, gridBagConstraints);

        mEditorAno.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "EJA" }));
        mEditorAno.setMaximumSize(new java.awt.Dimension(85, 20));
        mEditorAno.setMinimumSize(new java.awt.Dimension(85, 20));
        mEditorAno.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(mEditorAno, gridBagConstraints);

        mEditorTurma.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "VII", "VIII" }));
        mEditorTurma.setMaximumSize(new java.awt.Dimension(85, 20));
        mEditorTurma.setMinimumSize(new java.awt.Dimension(85, 20));
        mEditorTurma.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(mEditorTurma, gridBagConstraints);

        mEditorLink.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorLink.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mEditorLink.setMaximumSize(new java.awt.Dimension(64, 20));
        mEditorLink.setMinimumSize(new java.awt.Dimension(64, 20));
        mEditorLink.setPreferredSize(new java.awt.Dimension(64, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(mEditorLink, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        mButtonAdd.setText("INSERIR");
        mButtonAdd.setFocusPainted(false);
        mButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonAddActionPerformed(evt);
            }
        });

        mButtonEdit.setText("ALTERAR");
        mButtonEdit.setFocusPainted(false);
        mButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonEditActionPerformed(evt);
            }
        });

        mButtonDelete.setText("EXCLUIR");
        mButtonDelete.setFocusPainted(false);
        mButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonDeleteActionPerformed(evt);
            }
        });

        mButtonRefresh.setText("RECARREGAR LISTA");
        mButtonRefresh.setFocusPainted(false);
        mButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonRefreshActionPerformed(evt);
            }
        });

        mButtonNovo.setText("NOVO");
        mButtonNovo.setFocusPainted(false);
        mButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonNovoActionPerformed(evt);
            }
        });

        mOpenPlanilhas.setText("Abrir Planilha");
        mOpenPlanilhas.setFocusPainted(false);
        mOpenPlanilhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mOpenPlanilhasActionPerformed(evt);
            }
        });

        mImport.setText("Colar da Planilha");
        mImport.setFocusPainted(false);
        mImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(mButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(mOpenPlanilhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mImport, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mButtonRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(mButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mOpenPlanilhas)
                    .addComponent(mImport))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        mStatusText.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        mButtonGithub.setText("Verificar Atualizações");
        mButtonGithub.setFocusPainted(false);
        mButtonGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonGithubActionPerformed(evt);
            }
        });

        mVersionText.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mVersionText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mStatusText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mVersionText, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mButtonGithub)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mButtonGithub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mStatusText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mVersionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mMainPanelLayout = new javax.swing.GroupLayout(mMainPanel);
        mMainPanel.setLayout(mMainPanelLayout);
        mMainPanelLayout.setHorizontalGroup(
            mMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(mMainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mMainPanelLayout.setVerticalGroup(
            mMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setAllComponentsEnabled(boolean enabled) {
        jScrollPane1.setEnabled(enabled);
        mButtonAdd.setEnabled(enabled);
        mButtonDelete.setEnabled(enabled);
        mButtonEdit.setEnabled(enabled);
        mButtonNovo.setEnabled(enabled);
        mButtonRefresh.setEnabled(enabled);
        mEditorAno.setEnabled(enabled);
        mEditorAutor.setEnabled(enabled);
        mEditorData.setEnabled(enabled);
        mEditorDisciplina.setEnabled(enabled);
        mEditorID.setEnabled(enabled);
        mEditorLink.setEnabled(enabled);
        mEditorNome.setEnabled(enabled);
        mEditorTurma.setEnabled(enabled);
        mTable.setEnabled(enabled);
    }

    private void setStatusText(String text) {
        mStatusText.setText(text);
    }

    private void updateTable(String messageAfterUpdate) {
        setAllComponentsEnabled(false);
        setStatusText("Atualizando lista...");
        while (mTable.getModel().getRowCount() > 0) {
            ((DefaultTableModel) mTable.getModel()).removeRow(0);
        }
        new Sql("SELECT * FROM Documentos ORDER BY ID;").setOnPostExecuteListener((ResultSet rs, String feedback) -> {
            try {
                while (rs.next()) {
                    ((DefaultTableModel) mTable.getModel()).addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("autor"),
                        rs.getString("disciplina"),
                        rs.getString("data"),
                        rs.getString("link"),
                        rs.getString("ano"),
                        rs.getString("turma")
                    });
                }
                setStatusText(messageAfterUpdate);
            } catch (SQLException ex) {
                setStatusText("Erro: " + ex.getLocalizedMessage());
            } finally {
                setAllComponentsEnabled(true);
            }
        }).start();
    }

    private String getClipboard() throws IOException, UnsupportedFlavorException {
        String clip = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable content = clipboard.getContents(null);
        if (content != null && content.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            clip = (String) content.getTransferData(DataFlavor.stringFlavor);
        }
        return clip;
    }

    private void mButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonNovoActionPerformed
        mTable.clearSelection();
        int id = 0;
        for (int count = id; count < mTable.getModel().getRowCount(); count++) {
            if (((int) mTable.getModel().getValueAt(count, 0)) > id) {
                id = ((int) mTable.getModel().getValueAt(count, 0));
            }
        }
        mEditorID.setValue(id + 1);
        mEditorNome.setText("");
        mEditorAutor.setText("");
        mEditorDisciplina.setSelectedIndex(0);
        mEditorData.setText(String.valueOf(new SimpleDateFormat("dd/MM/yyyy").format(new Date())));
        mEditorLink.setText("");
        mEditorAno.setSelectedIndex(0);
        mEditorTurma.setSelectedIndex(0);
    }//GEN-LAST:event_mButtonNovoActionPerformed

    private void mButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonAddActionPerformed
        setAllComponentsEnabled(false);
        setStatusText("Enviando documento...");
        new Sql("INSERT INTO documentos VALUES ("
                + mEditorID.getValue() + ","
                + "'" + mEditorNome.getText() + "',"
                + "'" + mEditorAutor.getText() + "',"
                + "'" + String.valueOf(mEditorDisciplina.getItemAt(mEditorDisciplina.getSelectedIndex())) + "',"
                + "'" + mEditorData.getText() + "',"
                + "'" + mEditorLink.getText() + "',"
                + "'" + String.valueOf(mEditorAno.getItemAt(mEditorAno.getSelectedIndex())) + "',"
                + "'" + String.valueOf(mEditorTurma.getItemAt(mEditorTurma.getSelectedIndex())) + "');")
                .setOnPostExecuteListener((ResultSet rs, String feedback) -> {
                    if (feedback.equals("")) {
                        updateTable("Sucesso: Documento enviado.");
                    } else {
                        setStatusText(feedback);
                    }
                    setAllComponentsEnabled(true);
                }).start();
    }//GEN-LAST:event_mButtonAddActionPerformed

    private void mButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonRefreshActionPerformed
        mEditorID.setValue(1);
        mEditorNome.setText("");
        mEditorAutor.setText("");
        mEditorDisciplina.setSelectedIndex(0);
        mEditorData.setText(String.valueOf(new SimpleDateFormat("dd/MM/yyyy").format(new Date())));
        mEditorLink.setText("");
        mEditorAno.setSelectedIndex(0);
        mEditorTurma.setSelectedIndex(0);
        updateTable("Sucesso: Lista atualizada.");
    }//GEN-LAST:event_mButtonRefreshActionPerformed

    private void mEditorIDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mEditorIDStateChanged
        for (int rowIndex = 0; rowIndex < mTable.getModel().getRowCount(); rowIndex++) {
            if (((int) ((DefaultTableModel) mTable.getModel()).getValueAt(rowIndex, 0)) == (int) mEditorID.getValue()) {
                mEditorNome.setText((String) mTable.getValueAt(rowIndex, 1));
                mEditorAutor.setText((String) mTable.getValueAt(rowIndex, 2));
                mEditorDisciplina.setSelectedItem(mTable.getValueAt(rowIndex, 3));
                mEditorData.setText((String.valueOf(mTable.getValueAt(rowIndex, 4))));
                mEditorLink.setText((String) mTable.getValueAt(rowIndex, 5));
                mEditorAno.setSelectedItem(mTable.getValueAt(rowIndex, 6));
                mEditorTurma.setSelectedItem(mTable.getValueAt(rowIndex, 7));
            }
        }
    }//GEN-LAST:event_mEditorIDStateChanged

    private void mTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mTableMousePressed
        int rowSelected = ((JTable) evt.getSource()).rowAtPoint(evt.getPoint());
        mEditorID.setValue(((JTable) evt.getSource()).getValueAt(rowSelected, 0));
        mEditorNome.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 1));
        mEditorAutor.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 2));
        mEditorDisciplina.setSelectedItem(((JTable) evt.getSource()).getValueAt(rowSelected, 3));
        mEditorData.setText((String.valueOf(((JTable) evt.getSource()).getValueAt(rowSelected, 4))));
        mEditorLink.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 5));
        mEditorAno.setSelectedItem(((JTable) evt.getSource()).getValueAt(rowSelected, 6));
        mEditorTurma.setSelectedItem(((JTable) evt.getSource()).getValueAt(rowSelected, 7));
    }//GEN-LAST:event_mTableMousePressed

    private void mButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonDeleteActionPerformed
        int opcao = JOptionPane.showConfirmDialog(mMainPanel,
                "Tem certeza que deseja excluir o documento de ID " + mEditorID.getValue() + "? Essa ação é irreversível.",
                "Exclusão",
                JOptionPane.YES_NO_OPTION
        );

        if (opcao == 0) {
            setAllComponentsEnabled(false);
            setStatusText("Excluindo documento...");
            new Sql("DELETE FROM DOCUMENTOS WHERE ID=" + mEditorID.getValue())
                    .setOnPostExecuteListener((ResultSet rs, String feedback) -> {
                        if (feedback.equals("")) {
                            updateTable("Sucesso: Documento excuido.");
                        } else {
                            setStatusText(feedback);
                        }
                        setAllComponentsEnabled(true);
                    }).start();
        }
    }//GEN-LAST:event_mButtonDeleteActionPerformed

    private void mButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonEditActionPerformed
        int opcao = JOptionPane.showConfirmDialog(mMainPanel,
                "Tem certeza que deseja editar o documento de ID " + mEditorID.getValue() + "? Essa ação é irreversível.",
                "Exclusão",
                JOptionPane.YES_NO_OPTION
        );

        if (opcao == 0) {
            setAllComponentsEnabled(false);
            setStatusText("Editando documento...");
            new Sql("UPDATE documentos "
                    + "SET nome= '" + mEditorNome.getText() + "',"
                    + "autor= '" + mEditorAutor.getText() + "',"
                    + "disciplina= '" + String.valueOf(mEditorDisciplina.getItemAt(mEditorDisciplina.getSelectedIndex())) + "',"
                    + "data= '" + mEditorData.getText() + "',"
                    + "link= '" + mEditorLink.getText() + "',"
                    + "ano= '" + String.valueOf(mEditorAno.getItemAt(mEditorAno.getSelectedIndex())) + "',"
                    + "turma= '" + String.valueOf(mEditorTurma.getItemAt(mEditorTurma.getSelectedIndex())) + "' "
                    + "WHERE ID=" + mEditorID.getValue())
                    .setOnPostExecuteListener((ResultSet rs, String feedback) -> {
                        if (feedback.equals("")) {
                            updateTable("Sucesso: Documento editado.");
                        } else {
                            setStatusText(feedback);
                        }
                        setAllComponentsEnabled(true);
                    }).start();
        }
    }//GEN-LAST:event_mButtonEditActionPerformed

    private void mButtonGithubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonGithubActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/firminoveras/EMJPS-SGBD/releases"));
        } catch (URISyntaxException | IOException ex) {
            setStatusText("Erro: Não foi possivel abrir navegador.");
        }
    }//GEN-LAST:event_mButtonGithubActionPerformed

    private void mImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mImportActionPerformed
        try {
            String query = "", preview = "";
            String[] clip = getClipboard().split("\n");
            for (String line : clip) {
                String[] column = line.split(String.valueOf((char) 9));
                query += "INSERT INTO documentos VALUES ("
                        + column[0] + ","
                        + "'" + column[1] + "',"
                        + "'" + column[2] + "',"
                        + "'" + column[3] + "',"
                        + "'" + column[4] + "',"
                        + "'" + column[5] + "',"
                        + "'" + column[6] + "',"
                        + "'" + column[7] + "');\n";
                preview += column[0] + " - " + column[1] + " - " + column[2] + " - " + column[3] + " - " + column[4] + " - " + column[6] + " - " + column[7] + "\n";
            }
            int confirm = JOptionPane.showConfirmDialog(mMainPanel,
                    "Tem certeza que deseja adicionar os " + clip.length + " documentos abaixo?\n" + preview,
                    "Inserção em Massa", JOptionPane.YES_NO_OPTION);

            if (confirm == 0) {
                setAllComponentsEnabled(false);
                setStatusText("Inserindo em Massa...");
                new Sql(query).setOnPostExecuteListener((ResultSet rs, String feedback) -> {
                    if (feedback.equals("")) {
                        updateTable("Sucesso: " + clip.length + " documentos em massa inseridos.");
                    } else {
                        setStatusText(feedback);
                    }
                    setAllComponentsEnabled(true);
                }).start();
            }
        } catch (IOException | UnsupportedFlavorException ex) {
            System.out.println(ex.getMessage());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            JOptionPane.showMessageDialog(mMainPanel, "Formato não aceito, tenha certeza de que está copiando toda a linha da planilha e que está usando o Planilha do Google. Evite copiar linhas em branco.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mImportActionPerformed

    private void mOpenPlanilhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mOpenPlanilhasActionPerformed
         try {
            Desktop.getDesktop().browse(new URI("https://docs.google.com/spreadsheets/d/1W8IUcbsLwruiXyXgFGoUYN4HQAtxRfdaIgObKZVbTs8/edit?usp=sharing"));
        } catch (URISyntaxException | IOException ex) {
            setStatusText("Erro: Não foi possivel abrir navegador.");
        }
    }//GEN-LAST:event_mOpenPlanilhasActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mButtonAdd;
    private javax.swing.JButton mButtonDelete;
    private javax.swing.JButton mButtonEdit;
    private javax.swing.JButton mButtonGithub;
    private javax.swing.JButton mButtonNovo;
    private javax.swing.JButton mButtonRefresh;
    private javax.swing.JComboBox<String> mEditorAno;
    private javax.swing.JTextField mEditorAutor;
    private javax.swing.JTextField mEditorData;
    private javax.swing.JComboBox<String> mEditorDisciplina;
    private javax.swing.JSpinner mEditorID;
    private javax.swing.JTextField mEditorLink;
    private javax.swing.JTextField mEditorNome;
    private javax.swing.JComboBox<String> mEditorTurma;
    private javax.swing.JButton mImport;
    private javax.swing.JLabel mLogo;
    private javax.swing.JPanel mMainPanel;
    private javax.swing.JButton mOpenPlanilhas;
    private javax.swing.JLabel mStatusText;
    private javax.swing.JTable mTable;
    private javax.swing.JLabel mVersionText;
    // End of variables declaration//GEN-END:variables
}
