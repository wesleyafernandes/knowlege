package br.com.knowledge.sgi.model.tabela;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class SituacaoImovel {
	
	@Id
	@SequenceGenerator(name = "situacao_imovel_situacao_imovel_id_seq", sequenceName = "situacao_imovel_situacao_imovel_id_seq",initialValue=1,allocationSize=1) 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="situacao_imovel_situacao_imovel_id_seq")
	@Column(nullable=false,unique=true,name="situacao_imovel_id",columnDefinition="integer not null default nextval('situacao_imovel_situacao_imovel_id_seq')")
	private Integer situacaoImovelId;
	@Column(nullable=false,unique=true,length=20)
	private String descricao;
	public Integer getSituacaoImovelId() {
		return situacaoImovelId;
	}
	public void setSituacaoImovelId(Integer situacaoImovelId) {
		this.situacaoImovelId = situacaoImovelId;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
