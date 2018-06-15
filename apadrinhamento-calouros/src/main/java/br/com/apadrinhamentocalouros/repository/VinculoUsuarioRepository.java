package br.com.apadrinhamentocalouros.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.apadrinhamentocalouros.model.VinculoUsuario;

public interface VinculoUsuarioRepository extends JpaRepository<VinculoUsuario, Long>  {

	@Query("select vu from VinculoUsuario vu "
			+ "join fetch vu.usuarioCalouro "
			+ "join fetch vu.usuarioVeterano "
			+ "where vu.dataDesvinculacao = null "
			+ "and vu.dataVinculacao != null "
			+ "and vu.usuarioCalouro.idCurso = :idCurso "
			+ "and vu.usuarioVeterano.idCurso = :idCurso ")
	public Iterable<VinculoUsuario> findUsuariosVinculados(@Param("idCurso") Long idCurso);

	@Modifying
	@Query("update VinculoUsuario vu "
			+ "set vu.dataDesvinculacao = :dataDesvinculacao,"
			+ "vu.motivoDesvinculacao = :motivoDesvinculacao "
			+ "where vu.idVinculoUsuario = :idVinculoUsuario ")
	public void atualizaDataDesvinculacao(@Param("dataDesvinculacao") Date dataDesvinculacao,
										     @Param("idVinculoUsuario") Long idVinculoUsuario, 
										     @Param("motivoDesvinculacao") String motivoDesvinculacao);
	
	@Query("select vu from VinculoUsuario vu "
			+ "join fetch vu.usuarioCalouro "
			+ "join fetch vu.usuarioVeterano "
			+ "where vu.dataDesvinculacao = null "
			+ "and (vu.usuarioCalouro.idUsuario = :idUsuario "
			+ "or vu.usuarioVeterano.idUsuario = :idUsuario) ")
	public VinculoUsuario findVinculoUsuario(@Param("idUsuario") Long idUsuario);

}
