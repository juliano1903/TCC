package br.com.apadrinhamentocalouros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apadrinhamentocalouros.model.VinculoUsuario;
import br.com.apadrinhamentocalouros.service.VinculoUsuarioService;

@RestController
@RequestMapping(value = "/v1/vinculo")
public class VinculoApiRestController {

	@Autowired
	private VinculoUsuarioService vinculoUsuarioService;
	
	@RequestMapping(value = "/vincula", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public VinculoUsuario vincular(@RequestBody VinculoUsuario vinculoUsuario) {
		return vinculoUsuarioService.vincular(vinculoUsuario);
	}
	
	@RequestMapping(value = "/desvincula", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public VinculoUsuario desvincular(@RequestBody VinculoUsuario vinculoUsuario) {
		vinculoUsuarioService.desvincular(vinculoUsuario);
		return vinculoUsuario;
	}
	
	@RequestMapping(value = "/vinculo-usuario/{idUsuario}", method = RequestMethod.GET, produces = "application/json")
	public VinculoUsuario findVinculoUsuario(@PathVariable Long idUsuario) {
		return vinculoUsuarioService.findVinculoUsuario(idUsuario);
	}
	
	@RequestMapping(value = "/vinculados/{idCurso}", method = RequestMethod.GET, produces = "application/json")
	public Iterable<VinculoUsuario> findUsuariosVinculados(@PathVariable Long idCurso) {
		return vinculoUsuarioService.findUsuariosVinculados(idCurso);
	}
}
