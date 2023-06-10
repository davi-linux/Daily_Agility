
package DAO;

import DTO.Produto_DTO_Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-mendes
 */
public class Produto_DAO_Projeto {
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarProduto(Produto_DTO_Projeto objprodutodto){
     
        String sql = " insert into produto (cod, situacao, nome, descricao"
                + ",qtd_estoque,estoque_minimo, estoque_maximo,"
                + " preco_compra, preco_venda,bar_code,ncm,fator,"
                + "data_cadastro) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
        
        conn = new Conexao_DAO_Projeto().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,objprodutodto.getCod_produto());
            pstm.setString(2,objprodutodto.getSituacao_produto());
            pstm.setString(3,objprodutodto.getNome_produto());
            pstm.setString(4,objprodutodto.getDescricao_produto());
            pstm.setString(5,objprodutodto.getEstoque_total());
            pstm.setString(6,objprodutodto.getEstoque_minimo());
            pstm.setString(7,objprodutodto.getEstoque_maximo_produto());
            pstm.setString(8,objprodutodto.getPreco_compra_produto());
            pstm.setString(9,objprodutodto.getPreco_venda_produto());
            pstm.setString(10,objprodutodto.getCodigo_barra_produto());
            pstm.setString(11,objprodutodto.getNcm_produto());
            pstm.setString(12,objprodutodto.getLucro_produto());
            pstm.setString(13,objprodutodto.getData_cadastro__produto());
           // pstm.setString(14,obProdutosdto.getImagem_produto());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,   "FuncionarioDAO-CADASTRAR"+ e);
        }
    
  
    
    
    }
    
        public void alterarproduto(Produto_DTO_Projeto objprodutodto){
     
        String sql = " update  bd_produto.produto set cod = ?, situacao = ?, nome = ?, descricao = ?"
                + ",qtd_estoque= ?,estoque_minimo = ?, estoque_maximo = ?,"
                + " preco_compra = ?, preco_venda = ?,bar_code= ?,ncm = ?,fator = ?,"
                + "data_cadastro = ? where id = ? ";
        
        conn = new Conexao_DAO_Projeto().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,objprodutodto.getCod_produto());
            pstm.setString(2,objprodutodto.getSituacao_produto());
            pstm.setString(3,objprodutodto.getNome_produto());
            pstm.setString(4,objprodutodto.getDescricao_produto());
            pstm.setString(5,objprodutodto.getEstoque_total());
            pstm.setString(6,objprodutodto.getEstoque_minimo());
            pstm.setString(7,objprodutodto.getEstoque_maximo_produto());
            pstm.setString(8,objprodutodto.getPreco_compra_produto());
            pstm.setString(9,objprodutodto.getPreco_venda_produto());
            pstm.setString(10,objprodutodto.getCodigo_barra_produto());
            pstm.setString(11,objprodutodto.getNcm_produto());
            pstm.setString(12,objprodutodto.getLucro_produto());
            pstm.setString(13,objprodutodto.getData_cadastro__produto());
            pstm.setInt(14,objprodutodto.getId());
            
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Alterado com sucesso");
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,   "FuncionarioDAO-ALTERAR"+ e);
        }
  
    
    
    }
    



}