package br.com.apadrinhamentocalouros.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apadrinhamentocalouros.model.VinculoUsuario;
import br.com.apadrinhamentocalouros.repository.VinculoUsuarioRepository;

@Service
public class VinculoUsuarioService {
	
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
	private VinculoUsuarioRepository vinculoUsuarioRepository;
	
	public VinculoUsuario save (VinculoUsuario vinculoUsuario) {
		return vinculoUsuarioRepository.save(vinculoUsuario);
	}
}