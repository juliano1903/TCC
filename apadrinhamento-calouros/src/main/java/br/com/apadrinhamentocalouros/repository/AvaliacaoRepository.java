package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apadrinhamentocalouros.model.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long>  {

	Iterable<Avaliacao> findAllByOrderByDataAvaliacaoDesc();

}
