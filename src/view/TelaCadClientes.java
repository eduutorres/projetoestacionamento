/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modal.Data;

/**
 *
 * @author Eduardo
 */
public class TelaCadClientes extends javax.swing.JDialog {

    Conexao Con_contasareceber;
    Conexao Con_cliente;
    Conexao Con_preco;
    String datacadastro = "01/01/1111";
    String tipo = "C";
    int comparacao;

    String Mess, Anoo, Diaa;
    int diarestant;
    float ValorDia = 0, VALORCONT = 0;

    /**
     * Creates new form NewJDialog
     *
     * @param parent
     * @param modal
     */
    public TelaCadClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Con_cliente = new Conexao();
        Con_cliente.conecta();
//        Con_cliente.executaSQL("select * from clientemensal");

        Data mostra_data = new Data();
        mostra_data.le_data();
        datacadastro = (mostra_data.dia + "/" + mostra_data.mes + "/" + mostra_data.ano);
        Diaa = mostra_data.dia;
        Mess = mostra_data.mes;
        Anoo = mostra_data.ano;

        Con_preco = new Conexao();
        Con_preco.conecta();
        Con_preco.executaSQL("select * from preco");

        Con_contasareceber = new Conexao();
        Con_contasareceber.conecta();
        Con_contasareceber.executaSQL("select * from contasareceber");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntGroupTipo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        cboxUF = new javax.swing.JComboBox<>();
        lblCod = new javax.swing.JLabel();
        Cod = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        lblSexo = new javax.swing.JLabel();
        cbSexo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        rbntMoto = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();
        rbntCarro = new javax.swing.JRadioButton();
        lblPlaca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblCor = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JFormattedTextField();
        bntSalvar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO DE CLIENTES");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados pessoais"));

        lblNome.setText("Nome:");

        lblCelular.setText("Celular:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCPF.setText("CPF:");

        lblRG.setText("RG:");

        lblEndereco.setText("Endereço:");

        lblNumero.setText("N°");

        lblBairro.setText("Bairro:");

        lblCidade.setText("Cidade:");

        lblUF.setText("UF:");

        cboxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        lblCod.setText("Cod:");

        Cod.setText("0000");

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblSexo.setText("Sexo:");

        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblRG)
                        .addGap(23, 23, 23)
                        .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndereco)
                            .addComponent(lblCidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEndereco)
                            .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(lblCod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cod)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lblBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairro)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(lblRG)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexo)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCidade)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF)
                            .addComponent(cboxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCod)
                            .addComponent(Cod))
                        .addGap(19, 19, 19))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Veiculo"));

        bntGroupTipo.add(rbntMoto);
        rbntMoto.setText("Moto");
        rbntMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbntMotoActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo:");

        bntGroupTipo.add(rbntCarro);
        rbntCarro.setSelected(true);
        rbntCarro.setText("Carro");
        rbntCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbntCarroActionPerformed(evt);
            }
        });

        lblPlaca.setText("Placa:");

        lblModelo.setText("Modelo do veiculo:");

        lblCor.setText("Cor:");

        try {
            txtPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblModelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lblCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(lblTipo)
                        .addGap(36, 36, 36)
                        .addComponent(rbntCarro)
                        .addGap(18, 18, 18)
                        .addComponent(rbntMoto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(lblTipo)
                    .addComponent(rbntCarro)
                    .addComponent(rbntMoto)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCor)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(bntSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(bntSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbntCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbntCarroActionPerformed
        tipo = "C";
    }//GEN-LAST:event_rbntCarroActionPerformed

    private void rbntMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbntMotoActionPerformed
        tipo = "M";
    }//GEN-LAST:event_rbntMotoActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        if (comparacao == 1) {
            gravar();
            CADASTR.ExecutaMetodTelaPrincip();
            
        } else {
            alterar();
            CADASTR.ExecutaMetodTelaPrincip();
        }
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?");
        if (opcao == JOptionPane.YES_OPTION) {
            excluir();
            CADASTR.ExecutaMetodTelaPrincip();
        }
    }//GEN-LAST:event_bntExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadClientes dialog = new TelaCadClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cod;
    private javax.swing.JButton bntExcluir;
    private javax.swing.ButtonGroup bntGroupTipo;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> cboxUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblUF;
    private javax.swing.JRadioButton rbntCarro;
    private javax.swing.JRadioButton rbntMoto;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCor;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JFormattedTextField txtRG;
    // End of variables declaration//GEN-END:variables

    private TelaCliente CADASTR;

    public void mostrar(TelaCliente MostrarTelaTelaCliente) {
        this.CADASTR = MostrarTelaTelaCliente;
        setVisible(true);
        Limpa();

    }

    public void gravar() {
        Con_cliente.executaSQL("SELECT * FROM clientemensal");
        try {
            String sqlinsert = "insert into clientemensal (nome,fone,rg,"
                    + "cpf,sexo,rua,numero,bairro,cidade,uf,placa,tipo,modelo,cor,datacadastro) VALUES('"
                    + txtNome.getText() + "','"
                    + txtCelular.getText() + "','"
                    + txtRG.getText() + "','"
                    + txtCpf.getText() + "','"
                    + cbSexo.getSelectedItem() + "','"
                    + txtEndereco.getText() + "','"
                    + txtNumero.getText() + "','"
                    + txtBairro.getText() + "','"
                    + txtCidade.getText() + "','"
                    + cboxUF.getSelectedItem() + "','"
                    + txtPlaca.getText() + "','"
                    + tipo + "','"
                    + txtModelo.getText() + "','"
                    + txtCor.getText() + "','"
                    + datacadastro + "')";

            Con_cliente.statement.executeUpdate(sqlinsert);
//            JOptionPane.showMessageDialog(null, "Gravação Realizada!");

            GravarContasaReceber();

            CADASTR.PreencherTabela();

            Limpa();

            Con_cliente.executaSQL("SELECT * FROM clientemensal");
            Con_cliente.resultset.first();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na gravação dos dados, Verifique se existe um cadastro com a mesma placa!");
        }
    }

    public void exibir(TelaCliente LinhaPesquisa, int Linha, String Pesquisa) {
        Con_cliente.executaSQL("select * from clientemensal where nome like '%" + Pesquisa + "%' order by nome limit " + Linha + " , 1");
        try {
            Con_cliente.resultset.first();
            Cod.setText(Con_cliente.resultset.getString("cod"));
            txtNome.setText(Con_cliente.resultset.getString("nome"));
            txtCelular.setText(Con_cliente.resultset.getString("fone"));
            txtRG.setText(Con_cliente.resultset.getString("rg"));
            txtCpf.setText(Con_cliente.resultset.getString("cpf"));
            cbSexo.setSelectedItem(Con_cliente.resultset.getString("sexo"));
            txtEndereco.setText(Con_cliente.resultset.getString("rua"));
            txtNumero.setText(Con_cliente.resultset.getString("numero"));
            txtBairro.setText(Con_cliente.resultset.getString("bairro"));
            txtCidade.setText(Con_cliente.resultset.getString("cidade"));
            cboxUF.setSelectedItem(Con_cliente.resultset.getString("uf"));
            txtPlaca.setText(Con_cliente.resultset.getString("placa"));
            txtModelo.setText(Con_cliente.resultset.getString("modelo"));
            txtCor.setText(Con_cliente.resultset.getString("cor"));

            if (Con_cliente.resultset.getString("tipo").equals("C")) {
                rbntCarro.setSelected(true);
                tipo = "C";
            } else {
                rbntMoto.setSelected(true);
                tipo = "M";
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao localizar dados");
        }
    }

    public void alterar() {
        try {
            String sql = "UPDATE clientemensal SET "
                    + "nome = '" + txtNome.getText() + "',"
                    + "fone = '" + txtCelular.getText() + "',"
                    + "rg = '" + txtRG.getText() + "',"
                    + "cpf = '" + txtCpf.getText() + "',"
                    + "sexo = '" + cbSexo.getSelectedItem() + "',"
                    + "rua = '" + txtEndereco.getText() + "',"
                    + "numero = '" + txtNumero.getText() + "',"
                    + "bairro = '" + txtBairro.getText() + "',"
                    + "cidade = '" + txtCidade.getText() + "',"
                    + "uf = '" + cboxUF.getSelectedItem() + "',"
                    + "placa = '" + txtPlaca.getText() + "',"
                    + "tipo = '" + tipo + "',"
                    + "modelo = '" + txtModelo.getText() + "',"
                    + "cor = '" + txtCor.getText() + "'"
                    + "WHERE cod = " + Cod.getText();
            Con_cliente.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso!");
            CADASTR.PreencherTabela();
            Con_cliente.executaSQL("SELECT * FROM clientemensal");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar alteração");
        }
    }

    public void excluir() {
        try {
            String sqldeleta = "DELETE FROM clientemensal WHERE cod = " + Cod.getText();
            Con_cliente.statement.executeUpdate(sqldeleta);
            JOptionPane.showMessageDialog(null, "Exclusão Realizada!");
            Limpa();
            Cod.setText("");
            Con_cliente.executaSQL("SELECT * FROM clientemensal");
            Con_cliente.resultset.first();
            CADASTR.PreencherTabela();
            dispose();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar excluir");
        }
    }

    public void CorrigeBotao(TelaCliente cliente, int corrige) {
        if (corrige == 1) {
            bntSalvar.setText("Salvar");
            bntExcluir.setVisible(false);
            comparacao = 1;
        } else {
            bntSalvar.setText("Salvar Alterações");
            bntExcluir.setVisible(true);
            comparacao = 0;
        }

    }

    public void CalcularValor() {
        int ano = Integer.parseInt((Anoo));
        int mes = Integer.parseInt(Mess);
        int dia = Integer.parseInt(Diaa);
        int M = 0;
        int ResulDivisao = ano % 4;
        if (ResulDivisao == 0) {
            switch (mes) {

                case 1:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 2:
                    M = 29;
                    diarestant = M - dia;
                    break;
                case 3:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 4:
                    M = 30;
                    diarestant = M - dia;
                    break;
                case 5:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 6:
                    M = 30;
                    diarestant = M - dia;
                    break;
                case 7:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 8:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 9:
                    M = 30;
                    diarestant = M - dia;
                    break;
                case 10:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 11:
                    M = 30;
                    diarestant = M - dia;
                    break;
                case 12:
                    M = 31;
                    diarestant = M - dia;
                    break;
            }
        } else {
            switch (mes) {
                case 1:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 2:
                    M = 28;
                    diarestant = M - dia;
                    break;
                case 3:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 4:
                    M = 30;
                    diarestant = M - dia;
                    break;
                case 5:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 6:
                    M = 30;
                    diarestant = M - dia;
                    break;
                case 7:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 8:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 9:
                    M = 30;
                    diarestant = M - dia;
                    break;
                case 10:
                    M = 31;
                    diarestant = M - dia;
                    break;
                case 11:
                    M = 30;
                    diarestant = M - dia;
                    break;
                case 12:
                    M = 31;
                    diarestant = M - dia;
                    break;
            }

        }
        try {
            Con_preco.resultset.first();
            String MesCarro = Con_preco.resultset.getString("valorcarro");
            String MesMoto = Con_preco.resultset.getString("valormoto");

            float mc = Float.parseFloat(MesCarro);
            float mm = Float.parseFloat(MesMoto);

            if (tipo == "C") {
                ValorDia = mc / M;
            }
            if (tipo == "M") {
                ValorDia = mm / M;
            }
            VALORCONT = diarestant * ValorDia;
//            JOptionPane.showMessageDialog(null, VALORCONT);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular");
        }
    }

    public void GravarContasaReceber() {
        CalcularValor();
        try {
            String SQLINSERT = "insert into contasareceber (cliente,placa,"
                    + "mes,ano,tipo,valor,modelo,status) values('"
                    + txtNome.getText() + "','"
                    + txtPlaca.getText() + "','"
                    + Mess + "','"
                    + Anoo + "','"
                    + tipo + "','"
                    + VALORCONT + "','"
                    + txtModelo.getText() + "','"
                    + "PENDENTE" + "')";
            Con_contasareceber.statement.executeUpdate(SQLINSERT);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso");

            Con_contasareceber.executaSQL("select * from contasareceber");
            Con_contasareceber.resultset.first();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na gravação");
        }
    }

    public void Limpa() {
        txtNome.setText("");
        txtCelular.setText("");
        txtRG.setText("");
        txtCpf.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtPlaca.setText("");
        txtModelo.setText("");
        txtCor.setText("");
        rbntCarro.setSelected(true);
        tipo = "C";

    }

}
