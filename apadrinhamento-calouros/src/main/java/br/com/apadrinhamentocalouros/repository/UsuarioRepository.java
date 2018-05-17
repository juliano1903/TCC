package br.com.apadrinhamentocalouros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.model.VinculoUsuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {

	@Query("select u from Usuario u "
			+ "where u.dataAceite = null "
			+ "and u.idCurso = :idCurso "
			+ "and u.justificativaNegativa = null "
			+ "and u.idTipoUsuario = 1")
	public Iterable<Usuario> findUsuariosPendentesDeAceite(@Param("idCurso") Long idCurso);
	
	public Usuario findByMatriculaAndSenha(Long matricula, String senha);
	
	@Query("select u from Usuario u "
			+ "where u.idCurso = :idCurso "
			+ "and u.idTipoUsuario = 2")	
	public Usuario findCoordenadorByIdCurso(@Param("idCurso") Long idCurso);


	@Query("select u from Usuario u where u.dataAceite != null "
			+ "and u.dataMatricula > (sysdate - 180) "
			+ "and u.idTipoUsuario = 1 "
			+ "and u.idCurso = :idCurso "
			+ "and u.idUsuario not in (select vu.usuarioCalouro.idUsuario from VinculoUsuario vu)")
	public List<Usuario> findUsuariosCalourosPendentesVinculacao(@Param("idCurso") Long idCurso);
	
	@Query("select u from Usuario u where u.dataAceite != null "
			+ "and u.dataMatricula < (sysdate - 180) "
			+ "and u.idTipoUsuario = 1 "
			+ "and u.idCurso = :idCurso "
			+ "and u.idUsuario not in (select vu.usuarioVeterano.idUsuario from VinculoUsuario vu)")
	public List<Usuario> findUsuariosVeteranosPendentesVinculacao(@Param("idCurso") Long idCurso);

	@Query("select u from Usuario u where u.dataAceite != null "
			+ "and u.idTipoUsuario = 1 "
			+ "and u.dataMatricula < (sysdate - 180)")
	public List<Usuario> findAllUsuariosCalouros();

	@Query("select u from Usuario u where u.dataAceite != null "
			+ "and u.idTipoUsuario = 1 "
			+ "and u.dataMatricula > (sysdate - 180)")
	public List<Usuario> findAllUsuariosVeteranos();
}
