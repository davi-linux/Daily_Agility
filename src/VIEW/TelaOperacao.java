/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.Produto_DAO_Projeto;
import DTO.Produto_DTO_Projeto;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mr-mendes
 */
public class TelaOperacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaOperacao
     */
    public TelaOperacao() {
        initComponents();
        atualizarValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bd_produto?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        produtoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Produto p");
        produtoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery.getResultList();
        txtEstqMax = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtNcm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCalendario = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQtdEstoque = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combStatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEstqMin = new javax.swing.JTextField();
        txtLucro = new javax.swing.JFormattedTextField();
        txtPrecoCompra = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCodBarras = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnCarregar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtCod1 = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        btnLimpar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtPrecoVenda = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Cadastro - Sistema Cadastro");
        setForeground(java.awt.Color.black);
        setName("jfTelaOperacao"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtEstqMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 110, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 350, -1));

        txtId.setEditable(false);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 80, -1));
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 560, -1));
        getContentPane().add(txtNcm, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 110, -1));

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 115, 10));

        jLabel2.setText("Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 18, -1));

        jLabel3.setText("Data cadastro");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));
        getContentPane().add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 199, -1));

        jLabel4.setText("Nome");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel5.setText("Estoque Maximo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 151, -1));
        getContentPane().add(txtQtdEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 200, -1));

        jLabel6.setText("Quantidade Estoque");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 230, -1));

        combStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t", "Ativo", "Inativo" }));
        getContentPane().add(combStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 138, -1));

        jLabel7.setText("Status");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel8.setText("Descrição");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 151, -1));

        jLabel9.setText("NCM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 151, -1));

        jLabel10.setText("Estoque Minimo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 151, -1));

        jLabel11.setText("Preço de compra");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 151, -1));

        jLabel12.setText("Preço de venda");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 151, -1));
        getContentPane().add(txtEstqMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 130, -1));

        txtLucro.setText("%  ");
        getContentPane().add(txtLucro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 130, 30));

        txtPrecoCompra.setText("R$  ");
        getContentPane().add(txtPrecoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, 30));

        jLabel13.setText("Fator lucro");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 151, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/images.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 250, 190));

        jLabel14.setText("Codigo de Barra GTIN / EAN");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));
        getContentPane().add(txtCodBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 300, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/barraPesquisa.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, -1, 50));

        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 140, -1));

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 140, -1));

        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 140, -1));

        btnApagar.setText("Apagar");
        btnApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 140, -1));

        btnCarregar.setText("Carregar");
        btnCarregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 140, -1));

        btnImprimir.setText("Imprimir");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 220, 140, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fatec.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, -1, 170));
        getContentPane().add(txtCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 115, -1));
        getContentPane().add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 115, -1));

        btnLimpar1.setText("Limpar");
        btnLimpar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 140, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "cod", "Situacao", "Nome", "Descriçao", "Estoque Total"
                ,"Estoque Minimo","Estoque Maximo", "Preço Compra ","Preço Venda"
                , "Codigo de Barra", "NCM", "Lucro", "Data Cadastro"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 1080, 320));
        getContentPane().add(txtPrecoVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 110, -1));

        jMenu1.setText("Cadastro");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Tela inicial");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Quem Somos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator1);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Fale Conosco");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FaleConosco fl = new FaleConosco();
        fl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaInicio ti = new TelaInicio();
        ti.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        //LISTAR
        carregarCampos();

    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarProduto();
        limpar();
        atualizarValores();
        atualizarValores();
        

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed

        excluirProduto();
        limpar();
        atualizarValores();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // ALTERAR
        AlterarProduto();
        limpar();
        atualizarValores();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        QuemSomos qs = new QuemSomos();
        qs.setVisible(true);
        qs.setExtendedState(qs.MAXIMIZED_BOTH);
        qs.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOperacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOperacao().setVisible(true);
            }
        });
    }

    public void limpar() {

        txtCod1.setText("");
        txtId.setText("");
        txtData.setText("");
        txtEstqMin.setText("");
        txtNome.setText("");
        txtQtdEstoque.setText("");
        txtDescricao.setText("");
        txtEstqMax.setText("");
        txtEstqMax.setText("");
        txtPrecoCompra.setText("");
        txtPrecoVenda.setText("");
        txtLucro.setText("");
        txtNcm.setText("");
        txtCodBarras.setText("");
        combStatus.setSelectedItem(null);
        jCalendario.setDate(null);
    }

    private void carregarCampos() {

        int setar = jTable1.getSelectedRow();
        txtId.setText(jTable1.getModel().getValueAt(setar, 0).toString());
        txtCod1.setText(jTable1.getModel().getValueAt(setar, 1).toString());
        txtStatus.setText(jTable1.getModel().getValueAt(setar, 2).toString());
        txtNome.setText(jTable1.getModel().getValueAt(setar, 3).toString());
        txtDescricao.setText(jTable1.getModel().getValueAt(setar, 4).toString());
        txtQtdEstoque.setText(jTable1.getModel().getValueAt(setar, 5).toString());
        txtEstqMin.setText(jTable1.getModel().getValueAt(setar, 6).toString());
        txtEstqMax.setText(jTable1.getModel().getValueAt(setar, 7).toString());
        txtPrecoCompra.setText(jTable1.getModel().getValueAt(setar, 8).toString());
      
       // txtPrecoVenda.setText(jTable1.getModel().getValueAt(setar, 10).toString());
        txtPrecoVenda.setText(jTable1.getModel().getValueAt(setar, 9).toString());
        
        txtNcm.setText(jTable1.getModel().getValueAt(setar, 11).toString());
        txtLucro.setText(jTable1.getModel().getValueAt(setar, 12).toString());
        txtData.setText(jTable1.getModel().getValueAt(setar, 13).toString());
        txtCodBarras.setText(jTable1.getModel().getValueAt(setar, 10).toString());

    }

    private void CadastrarProduto() {

        String cod_produto, situacao_produto, nome_produto,
                descricao_produto, estoque_total, estoque_minimo,
                estoque_maximo_produto, preco_compra_produto,
                preco_venda_produto, codigo_barra_produto, ncm_produto,
                lucro_produto, data_cadastro__produto, testedata, testeStatus;

        /* data_cadastro__produto = txtData.getCalendar().toString();// TENTAR ACHAR A CONVERSAO
        date = dataTxt.getText();
        dataTxt.setText(data_cadastro__produto);
       
       
        situacao_produto = txtStatus.getSelectedItem().toString(); //COMBOBOX
        data_cadastro__produto = txtData.getCalendar().toString();// TENTAR ACHAR A CONVERSAO
        txtTeste.setText(situacao_produto);
        teste = txtTeste.getText();
        date = dataTxt.getText();*/
        situacao_produto = combStatus.getSelectedItem().toString(); //COMBOBOX
        txtStatus.setText(situacao_produto);
        situacao_produto = txtStatus.getText();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(jCalendario.getDate());
        data_cadastro__produto = jCalendario.getDate().toString();
        txtData.setText(dataFormatada);
        data_cadastro__produto = txtData.getText();

        cod_produto = txtCod1.getText();
        nome_produto = txtNome.getText();
        descricao_produto = txtDescricao.getText();
        estoque_total = txtQtdEstoque.getText();
        estoque_minimo = txtEstqMin.getText();
        estoque_maximo_produto = txtEstqMax.getText();
        preco_compra_produto = txtPrecoCompra.getText();
        ncm_produto = txtNcm.getText();
        lucro_produto = txtLucro.getText();
        preco_venda_produto = txtPrecoVenda.getText();
        codigo_barra_produto = txtCodBarras.getText();
        Produto_DTO_Projeto obj_produto_DTO = new Produto_DTO_Projeto();
        obj_produto_DTO.setSituacao_produto(situacao_produto);
        obj_produto_DTO.setData_cadastro__produto(data_cadastro__produto);
        obj_produto_DTO.setCod_produto(cod_produto);
        obj_produto_DTO.setNome_produto(nome_produto);
        obj_produto_DTO.setDescricao_produto(descricao_produto);
        obj_produto_DTO.setEstoque_total(estoque_total);
        obj_produto_DTO.setEstoque_minimo(estoque_minimo);
        obj_produto_DTO.setEstoque_maximo_produto(estoque_maximo_produto);
        obj_produto_DTO.setPreco_compra_produto(preco_compra_produto);
        obj_produto_DTO.setPreco_venda_produto(preco_venda_produto);
        obj_produto_DTO.setCodigo_barra_produto(codigo_barra_produto);
        obj_produto_DTO.setNcm_produto(ncm_produto);
        obj_produto_DTO.setLucro_produto(lucro_produto);

        Produto_DAO_Projeto objfuncinariodao = new Produto_DAO_Projeto();
        objfuncinariodao.cadastrarProduto(obj_produto_DTO);

    }

    private void AlterarProduto() {

        int id;

        String cod_produto, situacao_produto, nome_produto,
                descricao_produto, estoque_total, estoque_minimo,
                estoque_maximo_produto, preco_compra_produto,
                preco_venda_produto, codigo_barra_produto, ncm_produto,
                lucro_produto, data_cadastro__produto, testedata, testeStatus;

        /* data_cadastro__produto = txtData.getCalendar().toString();// TENTAR ACHAR A CONVERSAO
        date = dataTxt.getText();
        dataTxt.setText(data_cadastro__produto);
       
       
        situacao_produto = txtStatus.getSelectedItem().toString(); //COMBOBOX
        data_cadastro__produto = txtData.getCalendar().toString();// TENTAR ACHAR A CONVERSAO
        txtTeste.setText(situacao_produto);
        teste = txtTeste.getText();
        date = dataTxt.getText();*/
        id = Integer.parseInt(txtId.getText());
        situacao_produto = combStatus.getSelectedItem().toString(); //COMBOBOX
        txtStatus.setText(situacao_produto);
        situacao_produto = txtStatus.getText();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(jCalendario.getDate());
        data_cadastro__produto = jCalendario.getDate().toString();
        txtData.setText(dataFormatada);
        data_cadastro__produto = txtData.getText();

        cod_produto = txtCod1.getText();
        nome_produto = txtNome.getText();
        descricao_produto = txtDescricao.getText();
        estoque_total = txtQtdEstoque.getText();
        estoque_minimo = txtEstqMin.getText();
        estoque_maximo_produto = txtEstqMax.getText();
        preco_compra_produto = txtPrecoCompra.getText();
        preco_venda_produto = txtPrecoVenda.getText();
        codigo_barra_produto = txtCodBarras.getText();
        ncm_produto = txtNcm.getText();
        lucro_produto = txtLucro.getText();

        Produto_DTO_Projeto obj_produto_DTO = new Produto_DTO_Projeto();

        obj_produto_DTO.setId(id);
        obj_produto_DTO.setSituacao_produto(situacao_produto);
        obj_produto_DTO.setData_cadastro__produto(data_cadastro__produto);
        obj_produto_DTO.setCod_produto(cod_produto);
        obj_produto_DTO.setNome_produto(nome_produto);
        obj_produto_DTO.setDescricao_produto(descricao_produto);
        obj_produto_DTO.setEstoque_total(estoque_total);
        obj_produto_DTO.setEstoque_minimo(estoque_minimo);
        obj_produto_DTO.setEstoque_maximo_produto(estoque_maximo_produto);
        obj_produto_DTO.setPreco_compra_produto(preco_compra_produto);
        obj_produto_DTO.setPreco_venda_produto(preco_venda_produto);
        obj_produto_DTO.setCodigo_barra_produto(codigo_barra_produto);
        obj_produto_DTO.setNcm_produto(ncm_produto);
        obj_produto_DTO.setLucro_produto(lucro_produto);

        Produto_DAO_Projeto objfuncinariodao = new Produto_DAO_Projeto();
        objfuncinariodao.alterarproduto(obj_produto_DTO);

    }

    private void excluirProduto() {
        int id;
        id = Integer.parseInt(txtId.getText());

        Produto_DTO_Projeto objprodutodto = new Produto_DTO_Projeto();
        objprodutodto.setId(id);

        Produto_DAO_Projeto objprodutodao = new Produto_DAO_Projeto();
        objprodutodao.excluirproduto(objprodutodto);

    }

    private void atualizarValores() {
        try {
            Produto_DAO_Projeto objprodutodao = new Produto_DAO_Projeto();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setNumRows(0);
            ArrayList<Produto_DTO_Projeto> lista = objprodutodao.updateBD();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getCod_produto(),
                    lista.get(num).getSituacao_produto(),
                    lista.get(num).getNome_produto(),
                    lista.get(num).getDescricao_produto(),
                    lista.get(num).getEstoque_total(),
                    lista.get(num).getEstoque_minimo(),
                    lista.get(num).getEstoque_maximo_produto(),
                    lista.get(num).getPreco_compra_produto(),
                    lista.get(num).getPreco_venda_produto(),
                    lista.get(num).getCodigo_barra_produto(),
                    lista.get(num).getNcm_produto(),
                    lista.get(num).getLucro_produto(),
                    lista.get(num).getData_cadastro__produto()

                });

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "TelaOperacao Atualizar Valores:\n " + e);
        }

    }

    private void imprimir() {
        MessageFormat header = new MessageFormat("Impressão Padrão");
        MessageFormat footer = new MessageFormat("Página {0, number, integer}");
        try {
            jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Impressão não encontrada", e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> combStatus;
    private javax.persistence.EntityManager entityManager;
    private com.toedter.calendar.JDateChooser jCalendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTable jTable1;
    private java.util.List<VIEW.Produto> produtoList;
    private javax.persistence.Query produtoQuery;
    private javax.swing.JTextField txtCod1;
    private javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstqMax;
    private javax.swing.JTextField txtEstqMin;
    private javax.swing.JTextField txtId;
    private javax.swing.JFormattedTextField txtLucro;
    private javax.swing.JTextField txtNcm;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPrecoCompra;
    private javax.swing.JTextField txtPrecoVenda;
    private javax.swing.JTextField txtQtdEstoque;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
