package br.com.apadrinhamentocalouros.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
//	@Autowired
//	private UsuarioSession usuarioSession;
	
	/*
	 * Adicionar a escolha do curso np cadastro
	 * 
	 * Proxima semana
	 * 
	 * Vincular alunos - limitar alunos do seu curso Coord.
	 * 
	 * Enviar mensagem ao grupo do aluno
	 * 
	 * Marcar encontro
	 * 
	 * Aprimorar layout
	 */
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario save(Usuario usuario) {
		if(usuario.isCalouro()) {
			usuario.setDataAceite(new Date());
		}
		
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
	
	public Iterable<Usuario> findUsuariosPendentesDeAceite() {
		return usuarioRepository.findUsuariosPendentesDeAceite();
	}
	
//	public Usuario findByIdUsuario(Long idUsuario) {
//		return usuarioRepository.findByIdUsuario(idUsuario);
//	}
//	
//	public Usuario findByEmail(String email) {
//		return usuarioRepository.findByEmail(email);
//	}
//
//	public boolean logar(String email, String senha) {
//		usuarioSession.setUsuario(usuarioRepository.findByEmailAndSenha(email, senha));
//		if(usuarioSession.getUsuario() == null) {
//			return false;
//		}
//		return true;
//	}
//	
//	public void setUsuarioSessao (Usuario usuario) {
//		usuarioSession.setUsuario(usuario);
//	}
}
