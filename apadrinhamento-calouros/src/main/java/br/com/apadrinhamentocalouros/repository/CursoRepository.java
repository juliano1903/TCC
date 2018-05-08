package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Usuario;

public interface CursoRepository extends JpaRepository<Curso, Long>  {

	public Iterable<Curso> findAllByOrderByNomeAsc();

	public Iterable<Curso> findByIdCurso(Long idCurso);
}
