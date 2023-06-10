package DAO;

import DTO.Produto_DTO_Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mr-mendes
 */
public class Produto_DAO_Projeto {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs = null;
    ArrayList<Produto_DTO_Projeto> lista = new ArrayList<>();

    public void cadastrarProduto(Produto_DTO_Projeto objprodutodto) {

        String sql = " insert into produto (cod, situacao, nome, descricao"
                + ",qtd_estoque,estoque_minimo, estoque_maximo,"
                + " preco_compra, preco_venda,bar_code,ncm,fator,"
                + "data_cadastro) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?);";

        conn = new Conexao_DAO_Projeto().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getCod_produto());
            pstm.setString(2, objprodutodto.getSituacao_produto());
            pstm.setString(3, objprodutodto.getNome_produto());
            pstm.setString(4, objprodutodto.getDescricao_produto());
            pstm.setString(5, objprodutodto.getEstoque_total());
            pstm.setString(6, objprodutodto.getEstoque_minimo());
            pstm.setString(7, objprodutodto.getEstoque_maximo_produto());
            pstm.setString(8, objprodutodto.getPreco_compra_produto());
            pstm.setString(9, objprodutodto.getPreco_venda_produto());
            pstm.setString(10, objprodutodto.getCodigo_barra_produto());
            pstm.setString(11, objprodutodto.getNcm_produto());
            pstm.setString(12, objprodutodto.getLucro_produto());
            pstm.setString(13, objprodutodto.getData_cadastro__produto());
            // pstm.setString(14,obProdutosdto.getImagem_produto());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO-CADASTRAR" + e);
        }

    }

    public void alterarproduto(Produto_DTO_Projeto objprodutodto) {

        String sql = " update  bd_produto.produto set cod = ?, situacao = ?, nome = ?, descricao = ?"
                + ",qtd_estoque= ?,estoque_minimo = ?, estoque_maximo = ?,"
                + " preco_compra = ?, preco_venda = ?,bar_code= ?,ncm = ?,fator = ?,"
                + "data_cadastro = ? where id = ? ";

        conn = new Conexao_DAO_Projeto().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objprodutodto.getCod_produto());
            pstm.setString(2, objprodutodto.getSituacao_produto());
            pstm.setString(3, objprodutodto.getNome_produto());
            pstm.setString(4, objprodutodto.getDescricao_produto());
            pstm.setString(5, objprodutodto.getEstoque_total());
            pstm.setString(6, objprodutodto.getEstoque_minimo());
            pstm.setString(7, objprodutodto.getEstoque_maximo_produto());
            pstm.setString(8, objprodutodto.getPreco_compra_produto());
            pstm.setString(9, objprodutodto.getPreco_venda_produto());
            pstm.setString(10, objprodutodto.getCodigo_barra_produto());
            pstm.setString(11, objprodutodto.getNcm_produto());
            pstm.setString(12, objprodutodto.getLucro_produto());
            pstm.setString(13, objprodutodto.getData_cadastro__produto());
            pstm.setInt(14, objprodutodto.getId());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO-ALTERAR" + e);
        }

    }

    public void excluirproduto(Produto_DTO_Projeto objprodutodto) {

        String sql = " delete from  produto  where id = ?; ";

        conn = new Conexao_DAO_Projeto().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objprodutodto.getId());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO-Excluir" + e);
        }

    }


              

    /**public void updateBDw() {

        String sql = " SELECT * FROM bd_produto.produto; ";
        int q;
        conn = new Conexao_DAO_Projeto().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();
            
           // DefaultTableModel RecordTable = (DefaultTableModel)
            
            
            while (rs.next()) {

            }
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO-SELECT" + e);

        }

    
    }
     * @return 
    **/
    public ArrayList<Produto_DTO_Projeto> updateBD() {

        String sql = "SELECT * FROM bd_produto.produto;";

        conn = new Conexao_DAO_Projeto().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Produto_DTO_Projeto objprodutodto = new Produto_DTO_Projeto();
                objprodutodto.setId(rs.getInt("id"));
                objprodutodto.setCod_produto(rs.getString("cod"));
                objprodutodto.setSituacao_produto(rs.getString("situacao"));
                objprodutodto.setNome_produto(rs.getString("nome"));
                objprodutodto.setDescricao_produto(rs.getString("descricao"));
                objprodutodto.setEstoque_total(rs.getString("qtd_estoque"));
                objprodutodto.setEstoque_minimo(rs.getString("estoque_minimo"));
                objprodutodto.setEstoque_maximo_produto(rs.getString("estoque_maximo"));
                objprodutodto.setPreco_compra_produto(rs.getString("preco_compra"));
                objprodutodto.setPreco_venda_produto(rs.getString("preco_venda"));
                objprodutodto.setCodigo_barra_produto(rs.getString("bar_code"));
                objprodutodto.setNcm_produto(rs.getString("ncm"));
                objprodutodto.setLucro_produto(rs.getString("fator"));
                objprodutodto.setData_cadastro__produto(rs.getString("data_cadastro"));

                lista.add(objprodutodto);

            }
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO-SELECT" + e);

        }
        return lista;

    }

}
