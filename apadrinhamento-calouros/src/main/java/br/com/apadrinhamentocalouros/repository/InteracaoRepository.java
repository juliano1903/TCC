package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apadrinhamentocalouros.model.Interacao;
import br.com.apadrinhamentocalouros.model.Usuario;

public interface InteracaoRepository extends JpaRepository<Interacao, Long>  {

}
