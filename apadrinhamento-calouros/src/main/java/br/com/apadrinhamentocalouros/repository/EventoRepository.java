package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Evento;
import br.com.apadrinhamentocalouros.model.Usuario;

public interface EventoRepository extends JpaRepository<Evento, Long>  {

	public Iterable<Evento> findAllByOrderByDataEventoAsc();

}
