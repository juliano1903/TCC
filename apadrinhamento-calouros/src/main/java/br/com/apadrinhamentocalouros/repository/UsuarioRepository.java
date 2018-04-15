package br.com.apadrinhamentocalouros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.apadrinhamentocalouros.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {

	@Query("select u from Usuario u where u.dataAceite = null "
			+ "and u.justificativaNegativa = null "
			+ "and u.idTipoUsuario = 1")
	public Iterable<Usuario> findUsuariosPendentesDeAceite();
	
	public Usuario findByMatriculaAndSenha(Long matricula, String senha);
}
