package br.com.knowledge.pcdf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Fields;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;

import br.com.knowledge.pcdf.model.enumeration.ConservacaoEnum;
import br.com.knowledge.pcdf.model.enumeration.SituacaoEnum;

@Indexed
@Entity
@Analyzer(impl=BrazilianAnalyzer.class)
public class Veiculo {
	@Id
	@DocumentId
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="veiculo_id")
	private Integer veiculoId;
	@Column(length=100)
	@Fields({
		@Field(name="all"),
		@Field(name="marca_modelo",store=Store.YES)
	})
	private String marcaModelo;
	@Column(length=100)
	@Fields({
		@Field(name="all"),
		@Field(name="secao",store=Store.YES)
	})
	private String secao;
	@Column(length=1)
	@Fields({
		@Field(name="all"),
		@Field(name="caracterizado",store=Store.YES)
	})
	private String caracterizado;
	@Column(length=10)
	@Fields({
		@Field(name="all"),
		@Field(name="prefixo",store=Store.YES)
	})
	private String prefixo;
	@Column(length=8)
	@Fields({
		@Field(name="all"),
		@Field(name="placa_oficial",store=Store.YES)
	})
	private String placaOficial;
	@Column(length=8)
	@Fields({
		@Field(name="all"),
		@Field(name="placa_ostentada",store=Store.YES)
	})
	private String placaOstentada;
	@Column(length=50)
	@Fields({
		@Field(name="all"),
		@Field(name="chassis",store=Store.YES)
	})
	private String chassis;
	@Column(length=50)
	@Fields({
		@Field(name="all"),
		@Field(name="ano_modelo",store=Store.YES)
	})
	private String anoModelo;
	@Column(length=50)
	@Fields({
		@Field(name="all"),
		@Field(name="cor",store=Store.YES)
	})
	private String cor;
	@Column(length=50)
	@Fields({
		@Field(name="all"),
		@Field(name="tombamento",store=Store.YES)
	})
	private String tombamento;
	@Column(length=50)
	@Fields({
		@Field(name="all"),
		@Field(name="combustivel",store=Store.YES)
	})
	private String combustivel;
	@Column
	@Fields({
		@Field(name="all"),
		@Field(name="odometro",store=Store.YES)
	})
	private Integer odometro;
	@Column(length=1)
	@Fields({
		@Field(name="all"),
		@Field(name="pernoite",store=Store.YES)
	})
	private String pernoite;
	@Column(length=20)
	@Enumerated(EnumType.STRING)
	@Fields({
		@Field(name="all"),
		@Field(name="conservacao",store=Store.YES)
	})
	private ConservacaoEnum conservacao;
	@Column(length=20)
	@Enumerated(EnumType.STRING)
	@Fields({
		@Field(name="all"),
		@Field(name="situacao",store=Store.YES)
	})
	private SituacaoEnum situacao;
	public Integer getVeiculoId() {
		return veiculoId;
	}
	public void setVeiculoId(Integer veiculoId) {
		this.veiculoId = veiculoId;
	}
	public String getMarcaModelo() {
		return marcaModelo;
	}
	public void setMarcaModelo(String marcaModelo) {
		this.marcaModelo = marcaModelo;
	}
	public String getSecao() {
		return secao;
	}
	public void setSecao(String secao) {
		this.secao = secao;
	}
	public String getCaracterizado() {
		return caracterizado;
	}
	public void setCaracterizado(String caracterizado) {
		this.caracterizado = caracterizado;
	}
	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public String getPlacaOficial() {
		return placaOficial;
	}
	public void setPlacaOficial(String placaOficial) {
		this.placaOficial = placaOficial;
	}
	public String getPlacaOstentada() {
		return placaOstentada;
	}
	public void setPlacaOstentada(String placaOstentada) {
		this.placaOstentada = placaOstentada;
	}
	public String getChassis() {
		return chassis;
	}
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	public String getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTombamento() {
		return tombamento;
	}
	public void setTombamento(String tombamento) {
		this.tombamento = tombamento;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public Integer getOdometro() {
		return odometro;
	}
	public void setOdometro(Integer odometro) {
		this.odometro = odometro;
	}
	public String getPernoite() {
		return pernoite;
	}
	public void setPernoite(String pernoite) {
		this.pernoite = pernoite;
	}
	public void setConservacao(ConservacaoEnum conservacao) {
		this.conservacao = conservacao;
	}
	public ConservacaoEnum getConservacao() {
		return this.conservacao;
	}
	public SituacaoEnum getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoEnum situacao) {
		this.situacao = situacao;
	}
}
