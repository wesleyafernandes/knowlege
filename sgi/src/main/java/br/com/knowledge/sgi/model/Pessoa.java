package br.com.knowledge.sgi.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import br.com.knowledge.sgi.model.enumeration.TipoPessoa;

@Entity
public class Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "pessoa_pessoa_id_seq", sequenceName = "pessoa_pessoa_id_seq") 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pessoa_pessoa_id_seq")
	@Column(nullable=false,unique=true,name="pessoa_id")
	private Integer PessoaId;
	@Column(nullable=false,length=255)
	private String nome;
	@Column(nullable=false,length=14)
	private String cpfCnpj;
	private String rg;
	private String login;
	private String senha;
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
	@Column(nullable=false,length=30)
	private String complemento;
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipoPessoa;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true,mappedBy="pessoa")
	private List<Endereco> enderecos;
	public Integer getPessoaId() {
		return PessoaId;
	}
	public void setPessoaId(Integer pessoaId) {
		PessoaId = pessoaId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
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
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
}
