package br.com.apadrinhamentocalouros.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.apadrinhamentocalouros.model.VinculoUsuario;
import br.com.apadrinhamentocalouros.repository.VinculoUsuarioRepository;

@Service
public class VinculoUsuarioService {
	
	@Autowired
	private VinculoUsuarioRepository vinculoUsuarioRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	public VinculoUsuario vincular(VinculoUsuario vinculoUsuario) {
		usuarioService.save(vinculoUsuario.getUsuarioCalouro());
		usuarioService.save(vinculoUsuario.getUsuarioVeterano());
		return vinculoUsuarioRepository.save(vinculoUsuario);
	}

	@Transactional
	public void desvincular(VinculoUsuario vinculoUsuario) {
		vinculoUsuarioRepository.atualizaDataDesvinculacao(new Date(), 
															vinculoUsuario.getIdVinculoUsuario(), 
															vinculoUsuario.getMotivoDesvinculacao());
	}

	public Iterable<VinculoUsuario> findUsuariosVinculados(Long idCurso) {
		return vinculoUsuarioRepository.findUsuariosVinculados(idCurso);
	}
	
	public VinculoUsuario findVinculoUsuario(Long idUsuario) {
		return vinculoUsuarioRepository.findVinculoUsuario(idUsuario);
	}
}