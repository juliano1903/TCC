package br.com.apadrinhamentocalouros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.apadrinhamentocalouros.model.Interacao;

public interface InteracaoRepository extends JpaRepository<Interacao, Long>  {

	@Query("select i from Interacao i "
			+ "where i.usuarioVeterano.idUsuario in (:idsAlunos) "
			+ "or i.usuarioCalouro.idUsuario in (:idsAlunos) ")
	Iterable<Interacao> findAllByIdsAlunos(@Param("idsAlunos") List<Long> idsAlunos);

}
