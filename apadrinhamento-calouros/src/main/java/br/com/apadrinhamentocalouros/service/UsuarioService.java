package br.com.apadrinhamentocalouros.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario save(Usuario usuario) {
		usuario.setDataAceite(new Date());
		return usuarioRepository.save(usuario);
	}
	
	public Usuario validarCadastro(Usuario usuario) {
		if(usuario.getJustificativaNegativa() == null) {
			usuario.setDataAceite(new Date());
		} else {
			usuario.setDataNegativa(new Date());
		}
		return usuarioRepository.save(usuario);
	}
	
	public Iterable<Usuario> findUsuariosPendentesDeAceite(Long idCurso) {
		return usuarioRepository.findUsuariosPendentesDeAceite(idCurso);
	}
	
	public Usuario login(Usuario usuario) {
		return usuarioRepository.findByMatriculaAndSenha(usuario.getMatricula(), usuario.getSenha());
	}

	public Iterable<Usuario> findUsuariosPendentesVinculacao(Long idCurso) {
		List<Usuario> calourosList = findUsuariosCalourosPendentesVinculacao(idCurso);
		calourosList.addAll(findUsuariosVeteranosPendentesVinculacao(idCurso));
		return calourosList;
	}
	
	public List<Usuario> findUsuariosCalourosPendentesVinculacao(Long idCurso) {
		return usuarioRepository.findUsuariosCalourosPendentesVinculacao(idCurso);
	}
	
	public List<Usuario> findUsuariosVeteranosPendentesVinculacao(Long idCurso) {
		return usuarioRepository.findUsuariosVeteranosPendentesVinculacao(idCurso);
	}

	public Usuario findCoordenadorByIdCurso(Long idCurso) {
		return usuarioRepository.findCoordenadorByIdCurso(idCurso);
	}

	public Iterable<Usuario> findUsuariosAceitos(Long idCurso) {
		return usuarioRepository.findUsuariosAceitos(idCurso);
	}
}
