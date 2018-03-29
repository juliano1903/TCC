package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apadrinhamentocalouros.model.Avaliacao;
import br.com.apadrinhamentocalouros.model.Usuario;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long>  {

}
