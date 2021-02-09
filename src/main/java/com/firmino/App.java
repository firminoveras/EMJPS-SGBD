package com.firmino;

import com.formdev.flatlaf.FlatDarkLaf;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class App extends javax.swing.JFrame {

    public App() {
        FlatDarkLaf.install();
        initComponents();
        updateTable("Sucesso: Lista atualizada.");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mMainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
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
        jPanel5 = new javax.swing.JPanel();
        mStatusText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMJPS - Gerenciador de Banco de Dados");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);

        mMainPanel.setForeground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mTableMouseClicked(evt);
            }
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
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(60, 63, 64));
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOME");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 16));
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
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 16));
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
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(60, 63, 64));
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DATA");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setBackground(new java.awt.Color(60, 63, 64));
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LINK");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel7.setBackground(new java.awt.Color(60, 63, 64));
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ANO");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel8.setBackground(new java.awt.Color(60, 63, 64));
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TURMA");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanel2.add(jLabel8, gridBagConstraints);

        mEditorID.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorID.setModel(new javax.swing.SpinnerNumberModel(1, 0, 99999, 1));
        mEditorID.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mEditorIDStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorID, gridBagConstraints);

        mEditorAutor.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorAutor, gridBagConstraints);

        mEditorNome.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorNome, gridBagConstraints);

        mEditorDisciplina.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorDisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Portugu�s", "Matem�tica", "Ci�ncias", "Geografia", "Hist�ria", "Ingl�s", "Artes", "Ed. F�sica", "Religi�o" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorDisciplina, gridBagConstraints);

        mEditorData.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorData, gridBagConstraints);

        mEditorAno.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "5", "6", "7", "8", "9", "EJA" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorAno, gridBagConstraints);

        mEditorTurma.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        mEditorTurma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "I", "II" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorTurma, gridBagConstraints);

        mEditorLink.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(mEditorLink, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        mButtonAdd.setText("INSERIR");
        mButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonAddActionPerformed(evt);
            }
        });

        mButtonEdit.setText("ALTERAR");
        mButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonEditActionPerformed(evt);
            }
        });

        mButtonDelete.setText("EXCLUIR");
        mButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonDeleteActionPerformed(evt);
            }
        });

        mButtonRefresh.setText("RECARREGAR LISTA");
        mButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonRefreshActionPerformed(evt);
            }
        });

        mButtonNovo.setText("NOVO");
        mButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButtonNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mButtonDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mButtonRefresh)
                .addGap(18, 18, 18)
                .addComponent(mButtonAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mButtonEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mButtonDelete)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        mStatusText.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mStatusText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mStatusText, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void mTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mTableMouseClicked

    }//GEN-LAST:event_mTableMouseClicked

    private void mButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButtonNovoActionPerformed
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
                "Tem certeza que deseja excluir o documento de ID " + mEditorID.getValue() + "? Essa a��o � irrevers�vel.",
                "Exclus�o",
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
                "Tem certeza que deseja editar o documento de ID " + mEditorID.getValue() + "? Essa a��o � irrevers�vel.",
                "Exclus�o",
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
    private javax.swing.JPanel mMainPanel;
    private javax.swing.JLabel mStatusText;
    private javax.swing.JTable mTable;
    // End of variables declaration//GEN-END:variables

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

}