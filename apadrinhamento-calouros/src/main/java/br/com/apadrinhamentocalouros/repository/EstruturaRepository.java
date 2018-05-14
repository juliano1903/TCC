package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Estrutura;
import br.com.apadrinhamentocalouros.model.Evento;
import br.com.apadrinhamentocalouros.model.Usuario;

public interface EstruturaRepository extends JpaRepository<Estrutura, Long>  {

	public Iterable<Estrutura> findAllByOrderByNomeAsc();
}
