package br.com.apadrinhamentocalouros;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.service.AvaliacaoService;
import br.com.apadrinhamentocalouros.service.UsuarioService;
import br.com.apadrinhamentocalouros.service.VinculoUsuarioService;

@RestController
@RequestMapping(value = "/v1/usuario")
public class UsuarioApiRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private VinculoUsuarioService vinculoUsuarioService;
	
	@Autowired
	private AvaliacaoService avaliacaoService;
	
	@RequestMapping(value = "/pendentes-aceite/{idCurso}", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Usuario> findUsuariosPendentesDeAceite(@PathVariable Long idCurso) {
		return usuarioService.findUsuariosPendentesDeAceite(idCurso);
	}

	@RequestMapping(value = "/aceitos/{idCurso}", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Usuario> findUsuariosAceitos(@PathVariable Long idCurso) {
		return usuarioService.findUsuariosAceitos(idCurso);
	}

	@RequestMapping(value = "/salva", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public Usuario save(HttpServletRequest request, @RequestBody Usuario usuario) {
	    String userAgent = request.getHeader("x-access-token");
		return usuarioService.save(usuario);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public Usuario login(@RequestBody Usuario usuario) {
		return usuarioService.login(usuario);
	}

	@RequestMapping(value = "/aprova-cadastro", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public Usuario aprovaCadastro(@RequestBody Usuario usuario) {
		return usuarioService.validarCadastro(usuario);
	}
	
	@RequestMapping(value = "/pendentes-vinculacao/{idCurso}", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Usuario> findUsuariosPendentesVinculacao(@PathVariable Long idCurso) {
		return usuarioService.findUsuariosPendentesVinculacao(idCurso);
	}
	
	@RequestMapping(value = "/calouro/pendentes-vinculacao/{idCurso}", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Usuario> findUsuariosCalourosPendentesVinculacao(@PathVariable Long idCurso) {
		return usuarioService.findUsuariosCalourosPendentesVinculacao(idCurso);
	}
	
	@RequestMapping(value = "/veterano/pendentes-vinculacao/{idCurso}", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Usuario> findUsuariosVeteranosPendentesVinculacao(@PathVariable Long idCurso) {
		return usuarioService.findUsuariosVeteranosPendentesVinculacao(idCurso);
	}
}
