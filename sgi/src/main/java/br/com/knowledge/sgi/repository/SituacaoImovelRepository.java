package br.com.knowledge.sgi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.knowledge.sgi.model.tabela.SituacaoImovel;

public interface SituacaoImovelRepository extends JpaRepository<SituacaoImovel, Integer> {
	SituacaoImovel findBySituacaoImovelId(Integer situacaoImovelId);
}
