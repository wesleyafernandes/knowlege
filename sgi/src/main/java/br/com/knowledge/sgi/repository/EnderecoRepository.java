package br.com.knowledge.sgi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.knowledge.sgi.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
