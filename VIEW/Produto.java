/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Mr-mendes
 */
@Entity
@Table(name = "produto", catalog = "bd_produto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p")
    , @NamedQuery(name = "Produto.findById", query = "SELECT p FROM Produto p WHERE p.id = :id")
    , @NamedQuery(name = "Produto.findByCod", query = "SELECT p FROM Produto p WHERE p.cod = :cod")
    , @NamedQuery(name = "Produto.findBySituacao", query = "SELECT p FROM Produto p WHERE p.situacao = :situacao")
    , @NamedQuery(name = "Produto.findByNome", query = "SELECT p FROM Produto p WHERE p.nome = :nome")
    , @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao")
    , @NamedQuery(name = "Produto.findByQtdEstoque", query = "SELECT p FROM Produto p WHERE p.qtdEstoque = :qtdEstoque")
    , @NamedQuery(name = "Produto.findByEstoqueMinimo", query = "SELECT p FROM Produto p WHERE p.estoqueMinimo = :estoqueMinimo")
    , @NamedQuery(name = "Produto.findByEstoqueMaximo", query = "SELECT p FROM Produto p WHERE p.estoqueMaximo = :estoqueMaximo")
    , @NamedQuery(name = "Produto.findByPrecoCompra", query = "SELECT p FROM Produto p WHERE p.precoCompra = :precoCompra")
    , @NamedQuery(name = "Produto.findByPrecoVenda", query = "SELECT p FROM Produto p WHERE p.precoVenda = :precoVenda")
    , @NamedQuery(name = "Produto.findByBarCode", query = "SELECT p FROM Produto p WHERE p.barCode = :barCode")
    , @NamedQuery(name = "Produto.findByNcm", query = "SELECT p FROM Produto p WHERE p.ncm = :ncm")
    , @NamedQuery(name = "Produto.findByFator", query = "SELECT p FROM Produto p WHERE p.fator = :fator")
    , @NamedQuery(name = "Produto.findByDataCadastro", query = "SELECT p FROM Produto p WHERE p.dataCadastro = :dataCadastro")})
public class Produto implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cod")
    private String cod;
    @Basic(optional = false)
    @Column(name = "situacao")
    private String situacao;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "qtd_estoque")
    private String qtdEstoque;
    @Basic(optional = false)
    @Column(name = "estoque_minimo")
    private String estoqueMinimo;
    @Basic(optional = false)
    @Column(name = "estoque_maximo")
    private String estoqueMaximo;
    @Basic(optional = false)
    @Column(name = "preco_compra")
    private String precoCompra;
    @Basic(optional = false)
    @Column(name = "preco_venda")
    private String precoVenda;
    @Basic(optional = false)
    @Column(name = "bar_code")
    private String barCode;
    @Basic(optional = false)
    @Column(name = "ncm")
    private String ncm;
    @Basic(optional = false)
    @Column(name = "fator")
    private String fator;
    @Basic(optional = false)
    @Column(name = "data_cadastro")
    private String dataCadastro;

    public Produto() {
    }

    public Produto(Integer id) {
        this.id = id;
    }

    public Produto(Integer id, String cod, String situacao, String nome, String descricao, String qtdEstoque, String estoqueMinimo, String estoqueMaximo, String precoCompra, String precoVenda, String barCode, String ncm, String fator, String dataCadastro) {
        this.id = id;
        this.cod = cod;
        this.situacao = situacao;
        this.nome = nome;
        this.descricao = descricao;
        this.qtdEstoque = qtdEstoque;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.barCode = barCode;
        this.ncm = ncm;
        this.fator = fator;
        this.dataCadastro = dataCadastro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        String oldCod = this.cod;
        this.cod = cod;
        changeSupport.firePropertyChange("cod", oldCod, cod);
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        String oldSituacao = this.situacao;
        this.situacao = situacao;
        changeSupport.firePropertyChange("situacao", oldSituacao, situacao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(String qtdEstoque) {
        String oldQtdEstoque = this.qtdEstoque;
        this.qtdEstoque = qtdEstoque;
        changeSupport.firePropertyChange("qtdEstoque", oldQtdEstoque, qtdEstoque);
    }

    public String getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(String estoqueMinimo) {
        String oldEstoqueMinimo = this.estoqueMinimo;
        this.estoqueMinimo = estoqueMinimo;
        changeSupport.firePropertyChange("estoqueMinimo", oldEstoqueMinimo, estoqueMinimo);
    }

    public String getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(String estoqueMaximo) {
        String oldEstoqueMaximo = this.estoqueMaximo;
        this.estoqueMaximo = estoqueMaximo;
        changeSupport.firePropertyChange("estoqueMaximo", oldEstoqueMaximo, estoqueMaximo);
    }

    public String getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(String precoCompra) {
        String oldPrecoCompra = this.precoCompra;
        this.precoCompra = precoCompra;
        changeSupport.firePropertyChange("precoCompra", oldPrecoCompra, precoCompra);
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        String oldPrecoVenda = this.precoVenda;
        this.precoVenda = precoVenda;
        changeSupport.firePropertyChange("precoVenda", oldPrecoVenda, precoVenda);
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        String oldBarCode = this.barCode;
        this.barCode = barCode;
        changeSupport.firePropertyChange("barCode", oldBarCode, barCode);
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        String oldNcm = this.ncm;
        this.ncm = ncm;
        changeSupport.firePropertyChange("ncm", oldNcm, ncm);
    }

    public String getFator() {
        return fator;
    }

    public void setFator(String fator) {
        String oldFator = this.fator;
        this.fator = fator;
        changeSupport.firePropertyChange("fator", oldFator, fator);
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        String oldDataCadastro = this.dataCadastro;
        this.dataCadastro = dataCadastro;
        changeSupport.firePropertyChange("dataCadastro", oldDataCadastro, dataCadastro);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "VIEW.Produto[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
