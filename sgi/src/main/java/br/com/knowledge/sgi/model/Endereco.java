package br.com.knowledge.sgi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import br.com.knowledge.sgi.model.tabela.SituacaoImovel;

@Entity
public class Endereco implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "endereco_endereco_id_seq", sequenceName = "endereco_endereco_id_seq") 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="endereco_endereco_id_seq")
	@Column(nullable=false,unique=true,name="endereco_id")
	private Integer enderecoId;
	@Column(nullable=false,length=8)
	private String cep;
	@Column(nullable=false,length=60)
	private String cidade;
	@Column(nullable=false,length=60)
	private String bairro;
	@Column(nullable=false,length=60)
	private String logradouro;
	@Column(length=15)
	private String numero;
	@Column(length=30)
	private String complemento;
	@Column
	private Double valorAluguel;
	@Column
	private Double valorVenda;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="situacao_imovel_id",referencedColumnName="situacao_imovel_id")
	//@org.hibernate.annotations.ForeignKey(name="fk_endereco_rf_situacao_imovel_id")
	private SituacaoImovel situacaoImovel;
	@Column
	private Integer diaPagamento;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="pessoa_id",referencedColumnName="pessoa_id")
	//@org.hibernate.annotations.ForeignKey(name="fk_endereco_rf_pessoa_id")
	private Pessoa pessoa;
	public Integer getEnderecoId() {
		return enderecoId;
	}
	public void setEnderecoId(Integer enderecoId) {
		this.enderecoId = enderecoId;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(Double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public Double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public SituacaoImovel getSituacaoImovel() {
		return situacaoImovel;
	}
	public void setSituacaoImovel(SituacaoImovel situacaoImovel) {
		this.situacaoImovel = situacaoImovel;
	}
	public Integer getDiaPagamento() {
		return diaPagamento;
	}
	public void setDiaPagamento(Integer diaPagamento) {
		this.diaPagamento = diaPagamento;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
