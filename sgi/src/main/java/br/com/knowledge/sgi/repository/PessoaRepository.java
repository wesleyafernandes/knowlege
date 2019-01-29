package br.com.knowledge.sgi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.knowledge.sgi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
