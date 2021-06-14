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

    private final static String VERSION = "1.5";    
    private final static int TABLE_ID_APOSTILAS = 0;
    private final static int TABLE_ID_LIVROS = 1;
    
    private int TableIdAtual = 0;

    public App() {
        FlatDarkLaf.install();
        initComponents();
        mVersionText.setText("Versão " + VERSION);
        javax.swing.SwingUtilities.invokeLater(() -> {
            Sql.setPassword(JOptionPane.showInputDialog("Senha de acesso ao Banco de Dados: "));
            updateTable("Sucesso: Lista atualizada.", TABLE_ID_APOSTILAS);
        });
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
        Tabs = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mApostilaID = new javax.swing.JSpinner();
        mApostilaAutor = new javax.swing.JTextField();
        mApostilaNome = new javax.swing.JTextField();
        mApostilaDisciplina = new javax.swing.JComboBox<>();
        mApostilaData = new javax.swing.JTextField();
        mApostilaAno = new javax.swing.JComboBox<>();
        mApostilaTurma = new javax.swing.JComboBox<>();
        mApostilaPDF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        mApostilaInsert = new javax.swing.JButton();
        mApostilaUpdate = new javax.swing.JButton();
        mApostilaButtonDelete = new javax.swing.JButton();
        mApostilaButtonRefresh = new javax.swing.JButton();
        mApostilaButtonNovo = new javax.swing.JButton();
        mApostilaButtonOpenPlanilha = new javax.swing.JButton();
        mApostilaButtonPastePlanilha = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        mLivroID = new javax.swing.JSpinner();
        mLivroAutor = new javax.swing.JTextField();
        mLivroTitulo = new javax.swing.JTextField();
        mLivroEditora = new javax.swing.JTextField();
        mLivroImagem = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        mLivroPDF = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        mLivroButtonInsert = new javax.swing.JButton();
        mLivroButtonUpdate = new javax.swing.JButton();
        mLivroButtonDelete = new javax.swing.JButton();
        mLivroButtonRefresh = new javax.swing.JButton();
        mLivroButtonNovo = new javax.swing.JButton();
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

        Tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabsStateChanged(evt);
            }
        });

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

        mApostilaID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mApostilaID.setModel(new javax.swing.SpinnerNumberModel(1, 0, 99999, 1));
        mApostilaID.setMaximumSize(new java.awt.Dimension(85, 20));
        mApostilaID.setMinimumSize(new java.awt.Dimension(85, 20));
        mApostilaID.setPreferredSize(new java.awt.Dimension(85, 20));
        mApostilaID.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mApostilaIDStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(mApostilaID, gridBagConstraints);

        mApostilaAutor.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mApostilaAutor.setMaximumSize(new java.awt.Dimension(170, 20));
        mApostilaAutor.setMinimumSize(new java.awt.Dimension(170, 20));
        mApostilaAutor.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mApostilaAutor, gridBagConstraints);

        mApostilaNome.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mApostilaNome.setMaximumSize(new java.awt.Dimension(170, 20));
        mApostilaNome.setMinimumSize(new java.awt.Dimension(170, 20));
        mApostilaNome.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mApostilaNome, gridBagConstraints);

        mApostilaDisciplina.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mApostilaDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Português", "Matemática", "Ciências", "Geografia", "História", "Inglês", "Artes", "Ed. Física", "Religião" }));
        mApostilaDisciplina.setMaximumSize(new java.awt.Dimension(110, 20));
        mApostilaDisciplina.setMinimumSize(new java.awt.Dimension(110, 20));
        mApostilaDisciplina.setPreferredSize(new java.awt.Dimension(110, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(mApostilaDisciplina, gridBagConstraints);

        mApostilaData.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mApostilaData.setMaximumSize(new java.awt.Dimension(85, 20));
        mApostilaData.setMinimumSize(new java.awt.Dimension(85, 20));
        mApostilaData.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(mApostilaData, gridBagConstraints);

        mApostilaAno.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mApostilaAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "EJA" }));
        mApostilaAno.setMaximumSize(new java.awt.Dimension(85, 20));
        mApostilaAno.setMinimumSize(new java.awt.Dimension(85, 20));
        mApostilaAno.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel2.add(mApostilaAno, gridBagConstraints);

        mApostilaTurma.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mApostilaTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "VII", "VIII" }));
        mApostilaTurma.setMaximumSize(new java.awt.Dimension(85, 20));
        mApostilaTurma.setMinimumSize(new java.awt.Dimension(85, 20));
        mApostilaTurma.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(mApostilaTurma, gridBagConstraints);

        mApostilaPDF.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mApostilaPDF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mApostilaPDF.setMaximumSize(new java.awt.Dimension(64, 20));
        mApostilaPDF.setMinimumSize(new java.awt.Dimension(64, 20));
        mApostilaPDF.setPreferredSize(new java.awt.Dimension(64, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(mApostilaPDF, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        mApostilaInsert.setText("INSERIR");
        mApostilaInsert.setFocusPainted(false);
        mApostilaInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApostilaInsertActionPerformed(evt);
            }
        });

        mApostilaUpdate.setText("ALTERAR");
        mApostilaUpdate.setFocusPainted(false);
        mApostilaUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApostilaUpdateActionPerformed(evt);
            }
        });

        mApostilaButtonDelete.setText("EXCLUIR");
        mApostilaButtonDelete.setFocusPainted(false);
        mApostilaButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApostilaButtonDeleteActionPerformed(evt);
            }
        });

        mApostilaButtonRefresh.setText("RECARREGAR LISTA");
        mApostilaButtonRefresh.setFocusPainted(false);
        mApostilaButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApostilaButtonRefreshActionPerformed(evt);
            }
        });

        mApostilaButtonNovo.setText("NOVO");
        mApostilaButtonNovo.setFocusPainted(false);
        mApostilaButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApostilaButtonNovoActionPerformed(evt);
            }
        });

        mApostilaButtonOpenPlanilha.setText("Abrir Planilha");
        mApostilaButtonOpenPlanilha.setFocusPainted(false);
        mApostilaButtonOpenPlanilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApostilaButtonOpenPlanilhaActionPerformed(evt);
            }
        });

        mApostilaButtonPastePlanilha.setText("Colar da Planilha");
        mApostilaButtonPastePlanilha.setFocusPainted(false);
        mApostilaButtonPastePlanilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApostilaButtonPastePlanilhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mApostilaButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mApostilaButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(mApostilaInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mApostilaUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mApostilaButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(mApostilaButtonOpenPlanilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mApostilaButtonPastePlanilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mApostilaButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mApostilaButtonRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mApostilaUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(mApostilaInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mApostilaButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mApostilaButtonOpenPlanilha)
                    .addComponent(mApostilaButtonPastePlanilha))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        Tabs.addTab("Apostilas", jPanel4);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        java.awt.GridBagLayout jPanel7Layout = new java.awt.GridBagLayout();
        jPanel7Layout.columnWidths = new int[] {0, 10, 0};
        jPanel7Layout.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        jPanel7.setLayout(jPanel7Layout);

        jLabel9.setBackground(new java.awt.Color(60, 63, 64));
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel9.setMaximumSize(new java.awt.Dimension(85, 20));
        jLabel9.setMinimumSize(new java.awt.Dimension(85, 20));
        jLabel9.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 2);
        jPanel7.add(jLabel9, gridBagConstraints);

        jLabel10.setBackground(new java.awt.Color(60, 63, 64));
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TÍTULO");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel10.setMaximumSize(new java.awt.Dimension(170, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(170, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel7.add(jLabel10, gridBagConstraints);

        jLabel11.setBackground(new java.awt.Color(60, 63, 64));
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("AUTOR");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel11.setMaximumSize(new java.awt.Dimension(170, 20));
        jLabel11.setMinimumSize(new java.awt.Dimension(170, 20));
        jLabel11.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jPanel7.add(jLabel11, gridBagConstraints);

        jLabel13.setBackground(new java.awt.Color(60, 63, 64));
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("EDITORA");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel13.setMaximumSize(new java.awt.Dimension(85, 20));
        jLabel13.setMinimumSize(new java.awt.Dimension(85, 20));
        jLabel13.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 11, 0, 0);
        jPanel7.add(jLabel13, gridBagConstraints);

        jLabel14.setBackground(new java.awt.Color(60, 63, 64));
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("LINK IMAGEM");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel14.setMaximumSize(new java.awt.Dimension(85, 20));
        jLabel14.setMinimumSize(new java.awt.Dimension(85, 20));
        jLabel14.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        jPanel7.add(jLabel14, gridBagConstraints);

        mLivroID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mLivroID.setModel(new javax.swing.SpinnerNumberModel(1, 0, 99999, 1));
        mLivroID.setMaximumSize(new java.awt.Dimension(85, 20));
        mLivroID.setMinimumSize(new java.awt.Dimension(85, 20));
        mLivroID.setPreferredSize(new java.awt.Dimension(85, 20));
        mLivroID.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mLivroIDStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 2);
        jPanel7.add(mLivroID, gridBagConstraints);

        mLivroAutor.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mLivroAutor.setMaximumSize(new java.awt.Dimension(170, 20));
        mLivroAutor.setMinimumSize(new java.awt.Dimension(170, 20));
        mLivroAutor.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel7.add(mLivroAutor, gridBagConstraints);

        mLivroTitulo.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mLivroTitulo.setMaximumSize(new java.awt.Dimension(170, 20));
        mLivroTitulo.setMinimumSize(new java.awt.Dimension(170, 20));
        mLivroTitulo.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel7.add(mLivroTitulo, gridBagConstraints);

        mLivroEditora.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mLivroEditora.setMaximumSize(new java.awt.Dimension(85, 20));
        mLivroEditora.setMinimumSize(new java.awt.Dimension(85, 20));
        mLivroEditora.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel7.add(mLivroEditora, gridBagConstraints);

        mLivroImagem.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mLivroImagem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mLivroImagem.setMaximumSize(new java.awt.Dimension(64, 20));
        mLivroImagem.setMinimumSize(new java.awt.Dimension(64, 20));
        mLivroImagem.setPreferredSize(new java.awt.Dimension(64, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel7.add(mLivroImagem, gridBagConstraints);

        jLabel17.setBackground(new java.awt.Color(60, 63, 64));
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("LINK PDF");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel17.setMaximumSize(new java.awt.Dimension(85, 20));
        jLabel17.setMinimumSize(new java.awt.Dimension(85, 20));
        jLabel17.setPreferredSize(new java.awt.Dimension(85, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        jPanel7.add(jLabel17, gridBagConstraints);

        mLivroPDF.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mLivroPDF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        mLivroPDF.setMaximumSize(new java.awt.Dimension(64, 20));
        mLivroPDF.setMinimumSize(new java.awt.Dimension(64, 20));
        mLivroPDF.setPreferredSize(new java.awt.Dimension(64, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel7.add(mLivroPDF, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        mLivroButtonInsert.setText("INSERIR");
        mLivroButtonInsert.setFocusPainted(false);
        mLivroButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLivroButtonInsertActionPerformed(evt);
            }
        });

        mLivroButtonUpdate.setText("ALTERAR");
        mLivroButtonUpdate.setFocusPainted(false);
        mLivroButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLivroButtonUpdateActionPerformed(evt);
            }
        });

        mLivroButtonDelete.setText("EXCLUIR");
        mLivroButtonDelete.setFocusPainted(false);
        mLivroButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLivroButtonDeleteActionPerformed(evt);
            }
        });

        mLivroButtonRefresh.setText("RECARREGAR LISTA");
        mLivroButtonRefresh.setFocusPainted(false);
        mLivroButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLivroButtonRefreshActionPerformed(evt);
            }
        });

        mLivroButtonNovo.setText("NOVO");
        mLivroButtonNovo.setFocusPainted(false);
        mLivroButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLivroButtonNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mLivroButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mLivroButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(mLivroButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mLivroButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mLivroButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mLivroButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mLivroButtonRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mLivroButtonInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(mLivroButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mLivroButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Tabs.addTab("Livros", jPanel6);

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
                .addComponent(mStatusText, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mVersionText, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mButtonGithub)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(Tabs)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(Tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setAllComponentsEnabled(boolean enabled) {
        jScrollPane1.setEnabled(enabled);
        mApostilaInsert.setEnabled(enabled);
        mApostilaButtonDelete.setEnabled(enabled);
        mApostilaUpdate.setEnabled(enabled);
        mApostilaButtonNovo.setEnabled(enabled);
        mApostilaButtonRefresh.setEnabled(enabled);
        mApostilaAno.setEnabled(enabled);
        mApostilaAutor.setEnabled(enabled);
        mApostilaData.setEnabled(enabled);
        mApostilaDisciplina.setEnabled(enabled);
        mApostilaID.setEnabled(enabled);
        mApostilaPDF.setEnabled(enabled);
        mApostilaNome.setEnabled(enabled);
        mApostilaTurma.setEnabled(enabled);
        mTable.setEnabled(enabled);        
        mLivroButtonUpdate.setEnabled(enabled);
        mLivroAutor.setEnabled(enabled);
        mLivroEditora.setEnabled(enabled);
        mLivroButtonDelete.setEnabled(enabled);
        mLivroID.setEnabled(enabled);
        mLivroImagem.setEnabled(enabled);
        mLivroButtonInsert.setEnabled(enabled);
        mLivroButtonNovo.setEnabled(enabled);
        mLivroPDF.setEnabled(enabled);
        mLivroButtonRefresh.setEnabled(enabled);
        mLivroTitulo.setEnabled(enabled); 
        Tabs.setEnabled(enabled); 
    }

    private void setStatusText(String text) {
        mStatusText.setText(text);
    }

    private void updateTable(String messageAfterUpdate, int tableId) {
        setAllComponentsEnabled(false);
        setStatusText("Atualizando lista...");
        while (mTable.getModel().getRowCount() > 0) {
            ((DefaultTableModel) mTable.getModel()).removeRow(0);
        }
        
        if(tableId==TABLE_ID_APOSTILAS){
            mTable.setModel(new javax.swing.table.DefaultTableModel(new Object [][] { },
                new String [] {"ID", "Nome", "Autor", "Disciplina", "Data", "Link", "Ano", "Turma"}) {
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
            new Sql("SELECT * FROM Documentos ORDER BY ID;") {
                @Override
                public void onQueryConcluida(ResultSet rs) {
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
                }

                @Override
                public void onQueryErro(String feedback) {
                    setStatusText("Erro: " + feedback);
                    setAllComponentsEnabled(true);
                }
            }.start();
        } else{
             mTable.setModel(new javax.swing.table.DefaultTableModel(new Object [][] { },
                new String [] {"ID", "Título", "Autor", "Editora", "Link Capa", "Link PDF"}) {
                    Class[] types = new Class [] {
                        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean [] {false, false, false, false, false, false};

                    public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
             new Sql("SELECT * FROM livros ORDER BY ID;") {
                @Override
                public void onQueryConcluida(ResultSet rs) {
                    try {
                        while (rs.next()) {
                            ((DefaultTableModel) mTable.getModel()).addRow(new Object[]{
                                rs.getInt("id"),
                                rs.getString("titulo"),
                                rs.getString("autor"),
                                rs.getString("editora"),
                                rs.getString("url_img"),
                                rs.getString("url_pdf")
                            });
                        }
                        setStatusText(messageAfterUpdate);
                    } catch (SQLException ex) {
                        setStatusText("Erro: " + ex.getLocalizedMessage());
                    } finally {
                        setAllComponentsEnabled(true);
                    }
                }

                @Override
                public void onQueryErro(String feedback) {
                    setStatusText("Erro: " + feedback);
                    setAllComponentsEnabled(true);
                }
            }.start();
        }
        TableIdAtual = tableId;
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

    private void mApostilaButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApostilaButtonNovoActionPerformed
        mTable.clearSelection();
        int id = 0;
        for (int count = id; count < mTable.getModel().getRowCount(); count++) {
            if (((int) mTable.getModel().getValueAt(count, 0)) > id) {
                id = ((int) mTable.getModel().getValueAt(count, 0));
            }
        }
        mApostilaID.setValue(id + 1);
        mApostilaNome.setText("");
        mApostilaAutor.setText("");
        mApostilaDisciplina.setSelectedIndex(0);
        mApostilaData.setText(String.valueOf(new SimpleDateFormat("dd/MM/yyyy").format(new Date())));
        mApostilaPDF.setText("");
        mApostilaAno.setSelectedIndex(0);
        mApostilaTurma.setSelectedIndex(0);
    }//GEN-LAST:event_mApostilaButtonNovoActionPerformed

    private void mApostilaInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApostilaInsertActionPerformed
        setAllComponentsEnabled(false);
        setStatusText("Enviando documento...");
        new Sql("INSERT INTO documentos VALUES ("
                + mApostilaID.getValue() + ","
                + "'" + mApostilaNome.getText() + "',"
                + "'" + mApostilaAutor.getText() + "',"
                + "'" + String.valueOf(mApostilaDisciplina.getItemAt(mApostilaDisciplina.getSelectedIndex())) + "',"
                + "'" + mApostilaData.getText() + "',"
                + "'" + mApostilaPDF.getText() + "',"
                + "'" + String.valueOf(mApostilaAno.getItemAt(mApostilaAno.getSelectedIndex())) + "',"
                + "'" + String.valueOf(mApostilaTurma.getItemAt(mApostilaTurma.getSelectedIndex())) + "');") {
            @Override
            public void onQueryConcluida(ResultSet rs) {
                updateTable("Sucesso: Documento enviado.", TABLE_ID_APOSTILAS);
            }

            @Override
            public void onQueryErro(String feedback) {
                setStatusText("Erro: " + feedback);
                setAllComponentsEnabled(true);
            }
        }.start();
    }//GEN-LAST:event_mApostilaInsertActionPerformed

    private void mApostilaButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApostilaButtonRefreshActionPerformed
        mApostilaID.setValue(1);
        mApostilaNome.setText("");
        mApostilaAutor.setText("");
        mApostilaDisciplina.setSelectedIndex(0);
        mApostilaData.setText(String.valueOf(new SimpleDateFormat("dd/MM/yyyy").format(new Date())));
        mApostilaPDF.setText("");
        mApostilaAno.setSelectedIndex(0);
        mApostilaTurma.setSelectedIndex(0);
        updateTable("Sucesso: Lista atualizada.", TABLE_ID_APOSTILAS);
    }//GEN-LAST:event_mApostilaButtonRefreshActionPerformed

    private void mApostilaIDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mApostilaIDStateChanged
        for (int rowIndex = 0; rowIndex < mTable.getModel().getRowCount(); rowIndex++) {
            if (((int) ((DefaultTableModel) mTable.getModel()).getValueAt(rowIndex, 0)) == (int) mApostilaID.getValue()) {
                mApostilaNome.setText((String) mTable.getValueAt(rowIndex, 1));
                mApostilaAutor.setText((String) mTable.getValueAt(rowIndex, 2));
                mApostilaDisciplina.setSelectedItem(mTable.getValueAt(rowIndex, 3));
                mApostilaData.setText((String.valueOf(mTable.getValueAt(rowIndex, 4))));
                mApostilaPDF.setText((String) mTable.getValueAt(rowIndex, 5));
                mApostilaAno.setSelectedItem(mTable.getValueAt(rowIndex, 6));
                mApostilaTurma.setSelectedItem(mTable.getValueAt(rowIndex, 7));
            }
        }
    }//GEN-LAST:event_mApostilaIDStateChanged

    private void mTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mTableMousePressed
        int rowSelected = ((JTable) evt.getSource()).rowAtPoint(evt.getPoint());
        if(TableIdAtual == TABLE_ID_APOSTILAS){
            mApostilaID.setValue(((JTable) evt.getSource()).getValueAt(rowSelected, 0));
            mApostilaNome.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 1));
            mApostilaAutor.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 2));
            mApostilaDisciplina.setSelectedItem(((JTable) evt.getSource()).getValueAt(rowSelected, 3));
            mApostilaData.setText((String.valueOf(((JTable) evt.getSource()).getValueAt(rowSelected, 4))));
            mApostilaPDF.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 5));
            mApostilaAno.setSelectedItem(((JTable) evt.getSource()).getValueAt(rowSelected, 6));
            mApostilaTurma.setSelectedItem(((JTable) evt.getSource()).getValueAt(rowSelected, 7));
        } else{
            mLivroID.setValue(((JTable) evt.getSource()).getValueAt(rowSelected, 0));
            mLivroTitulo.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 1));
            mLivroAutor.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 2));
            mLivroEditora.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 3));
            mLivroImagem.setText((String.valueOf(((JTable) evt.getSource()).getValueAt(rowSelected, 4))));
            mLivroPDF.setText((String) ((JTable) evt.getSource()).getValueAt(rowSelected, 5));
        }       
    }//GEN-LAST:event_mTableMousePressed

    private void mApostilaButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApostilaButtonDeleteActionPerformed
        String id = String.valueOf(mApostilaID.getValue());
        int opcao = JOptionPane.showConfirmDialog(mMainPanel,
                "Tem certeza que deseja excluir a apostila de ID " + id + "? Essa ação é irreversível.",
                "Exclusão",
                JOptionPane.YES_NO_OPTION
        );

        if (opcao == 0) {
            setAllComponentsEnabled(false);
            setStatusText("Excluindo entrada...");
            new Sql("DELETE FROM documentos WHERE ID=" + id) {
                @Override
                public void onQueryConcluida(ResultSet rs) {
                    updateTable("Sucesso: apostila excuida.", TableIdAtual);
                }

                @Override
                public void onQueryErro(String feedback) {
                    setStatusText(feedback);
                    setAllComponentsEnabled(true);
                }
            }.start();
        }
    }//GEN-LAST:event_mApostilaButtonDeleteActionPerformed

    private void mApostilaUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApostilaUpdateActionPerformed
        int opcao = JOptionPane.showConfirmDialog(mMainPanel,
                "Tem certeza que deseja editar a apostila de ID " + mApostilaID.getValue() + "? Essa ação é irreversível.",
                "Edição",
                JOptionPane.YES_NO_OPTION
        );

        if (opcao == 0) {
            setAllComponentsEnabled(false);
            setStatusText("Editando documento...");
            new Sql("UPDATE documentos "
                    + "SET nome= '" + mApostilaNome.getText() + "',"
                    + "autor= '" + mApostilaAutor.getText() + "',"
                    + "disciplina= '" + String.valueOf(mApostilaDisciplina.getItemAt(mApostilaDisciplina.getSelectedIndex())) + "',"
                    + "data= '" + mApostilaData.getText() + "',"
                    + "link= '" + mApostilaPDF.getText() + "',"
                    + "ano= '" + String.valueOf(mApostilaAno.getItemAt(mApostilaAno.getSelectedIndex())) + "',"
                    + "turma= '" + String.valueOf(mApostilaTurma.getItemAt(mApostilaTurma.getSelectedIndex())) + "' "
                    + "WHERE ID=" + mApostilaID.getValue()) {
                @Override
                public void onQueryConcluida(ResultSet rs) {
                    updateTable("Sucesso: Todos os documentos de ID " + mApostilaID.getValue() + " foram modificados.", TABLE_ID_APOSTILAS);
                }

                @Override
                public void onQueryErro(String feedback) {
                    setStatusText(feedback);
                    setAllComponentsEnabled(true);
                }
            }.start();
        }
    }//GEN-LAST:event_mApostilaUpdateActionPerformed

    private void mButtonGithubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonGithubActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/firminoveras/EMJPS-SGBD/releases"));
        } catch (URISyntaxException | IOException ex) {
            setStatusText("Erro: Não foi possivel abrir navegador.");
        }
    }//GEN-LAST:event_mButtonGithubActionPerformed

    private void mApostilaButtonPastePlanilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApostilaButtonPastePlanilhaActionPerformed
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
                new Sql(query) {
                    @Override
                    public void onQueryConcluida(ResultSet rs) {
                        updateTable("Sucesso: " + clip.length + " documentos em massa inseridos.", TABLE_ID_APOSTILAS);
                    }

                    @Override
                    public void onQueryErro(String feedback) {
                        setStatusText(feedback);
                        setAllComponentsEnabled(true);
                    }
                }.start();
            }
        } catch (IOException | UnsupportedFlavorException ex) {
            System.out.println(ex.getMessage());
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            JOptionPane.showMessageDialog(mMainPanel, "Formato não aceito, tenha certeza de que está copiando toda a linha da planilha e que está usando o Planilha do Google. Evite copiar linhas em branco.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_mApostilaButtonPastePlanilhaActionPerformed

    private void mApostilaButtonOpenPlanilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApostilaButtonOpenPlanilhaActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://docs.google.com/spreadsheets/d/1W8IUcbsLwruiXyXgFGoUYN4HQAtxRfdaIgObKZVbTs8/edit?usp=sharing"));
        } catch (URISyntaxException | IOException ex) {
            setStatusText("Erro: Não foi possivel abrir navegador.");
        }
    }//GEN-LAST:event_mApostilaButtonOpenPlanilhaActionPerformed

    private void mLivroIDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mLivroIDStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_mLivroIDStateChanged

    private void TabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabsStateChanged
         if(Sql.havePassword()) updateTable("Tabela mudada para "+ Tabs.getTitleAt(Tabs.getSelectedIndex()), Tabs.getSelectedIndex());
    }//GEN-LAST:event_TabsStateChanged

    private void mLivroButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLivroButtonInsertActionPerformed
        setAllComponentsEnabled(false);
        setStatusText("Adicionando livro...");
        new Sql("INSERT INTO livros VALUES ("
                + mLivroID.getValue() + ","
                + "'" + mLivroTitulo.getText() + "',"
                + "'" + mLivroAutor.getText() + "',"
                + "'" + mLivroEditora.getText() + "',"
                + "'" + mLivroImagem.getText() + "',"
                  + "'" + mLivroPDF.getText() + "');") {
            @Override
            public void onQueryConcluida(ResultSet rs) {
                updateTable("Sucesso: Livro adicionado.", TABLE_ID_LIVROS);
            }

            @Override
            public void onQueryErro(String feedback) {
                setStatusText("Erro: " + feedback);
                setAllComponentsEnabled(true);
            }
        }.start();
    }//GEN-LAST:event_mLivroButtonInsertActionPerformed

    private void mLivroButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLivroButtonUpdateActionPerformed
        int opcao = JOptionPane.showConfirmDialog(mMainPanel,
                "Tem certeza que deseja o livro de ID " + mLivroID.getValue() + "? Essa ação é irreversível.",
                "Edição",
                JOptionPane.YES_NO_OPTION
        );

        if (opcao == 0) {
            setAllComponentsEnabled(false);
            setStatusText("Editando livro...");
            new Sql("UPDATE livros "
                    + "SET titulo= '" + mLivroTitulo.getText() + "',"
                    + "autor= '" + mLivroAutor.getText() + "',"
                    + "editora= '" + mLivroEditora.getText() + "',"
                    + "url_img= '" + mLivroImagem.getText() + "',"
                    + "url_pdf= '" + mLivroPDF.getText() + "' "
                    + "WHERE ID=" + mLivroID.getValue()) {
                @Override
                public void onQueryConcluida(ResultSet rs) {
                    updateTable("Sucesso: Todos os livros de ID " + mLivroID.getValue() + " foram modificados.", TABLE_ID_LIVROS);
                }

                @Override
                public void onQueryErro(String feedback) {
                    setStatusText(feedback);
                    setAllComponentsEnabled(true);
                }
            }.start();
        }
    }//GEN-LAST:event_mLivroButtonUpdateActionPerformed

    private void mLivroButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLivroButtonDeleteActionPerformed
        String id = String.valueOf(mLivroID.getValue());
        int opcao = JOptionPane.showConfirmDialog(mMainPanel,
                "Tem certeza que deseja excluir o livro de ID " + id + "? Essa ação é irreversível.",
                "Exclusão",
                JOptionPane.YES_NO_OPTION
        );

        if (opcao == 0) {
            setAllComponentsEnabled(false);
            setStatusText("Excluindo livro...");
            new Sql("DELETE FROM livros WHERE ID=" + id) {
                @Override
                public void onQueryConcluida(ResultSet rs) {
                    updateTable("Sucesso: livro excuido.", TABLE_ID_LIVROS);
                }

                @Override
                public void onQueryErro(String feedback) {
                    setStatusText(feedback);
                    setAllComponentsEnabled(true);
                }
            }.start();
        }
    }//GEN-LAST:event_mLivroButtonDeleteActionPerformed

    private void mLivroButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLivroButtonRefreshActionPerformed
        mLivroID.setValue(1);
        mLivroTitulo.setText("");
        mLivroAutor.setText("");
        mLivroEditora.setText("");
        mLivroPDF.setText("");
        mLivroImagem.setText("");        
        updateTable("Sucesso: Livros atualizada.", TABLE_ID_LIVROS);
    }//GEN-LAST:event_mLivroButtonRefreshActionPerformed

    private void mLivroButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLivroButtonNovoActionPerformed
        mTable.clearSelection();
        int id = 0;
        for (int count = id; count < mTable.getModel().getRowCount(); count++) {
            if (((int) mTable.getModel().getValueAt(count, 0)) > id) {
                id = ((int) mTable.getModel().getValueAt(count, 0));
            }
        }
        mLivroID.setValue(id + 1);
        mLivroTitulo.setText("");
        mLivroAutor.setText("");
        mLivroPDF.setText("");
        mLivroImagem.setText(""); 
        mLivroEditora.setText("");
    }//GEN-LAST:event_mLivroButtonNovoActionPerformed

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
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mApostilaAno;
    private javax.swing.JTextField mApostilaAutor;
    private javax.swing.JButton mApostilaButtonDelete;
    private javax.swing.JButton mApostilaButtonNovo;
    private javax.swing.JButton mApostilaButtonOpenPlanilha;
    private javax.swing.JButton mApostilaButtonPastePlanilha;
    private javax.swing.JButton mApostilaButtonRefresh;
    private javax.swing.JTextField mApostilaData;
    private javax.swing.JComboBox<String> mApostilaDisciplina;
    private javax.swing.JSpinner mApostilaID;
    private javax.swing.JButton mApostilaInsert;
    private javax.swing.JTextField mApostilaNome;
    private javax.swing.JTextField mApostilaPDF;
    private javax.swing.JComboBox<String> mApostilaTurma;
    private javax.swing.JButton mApostilaUpdate;
    private javax.swing.JButton mButtonGithub;
    private javax.swing.JTextField mLivroAutor;
    private javax.swing.JButton mLivroButtonDelete;
    private javax.swing.JButton mLivroButtonInsert;
    private javax.swing.JButton mLivroButtonNovo;
    private javax.swing.JButton mLivroButtonRefresh;
    private javax.swing.JButton mLivroButtonUpdate;
    private javax.swing.JTextField mLivroEditora;
    private javax.swing.JSpinner mLivroID;
    private javax.swing.JTextField mLivroImagem;
    private javax.swing.JTextField mLivroPDF;
    private javax.swing.JTextField mLivroTitulo;
    private javax.swing.JLabel mLogo;
    private javax.swing.JPanel mMainPanel;
    private javax.swing.JLabel mStatusText;
    private javax.swing.JTable mTable;
    private javax.swing.JLabel mVersionText;
    // End of variables declaration//GEN-END:variables
}
