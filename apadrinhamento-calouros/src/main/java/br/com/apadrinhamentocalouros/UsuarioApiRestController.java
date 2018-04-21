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
import br.com.apadrinhamentocalouros.model.VinculoUsuario;
import br.com.apadrinhamentocalouros.service.UsuarioService;
import br.com.apadrinhamentocalouros.service.VinculoUsuarioService;

@RestController
@RequestMapping(value = "/v1/usuario")
public class UsuarioApiRestController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private VinculoUsuarioService vinculoUsuarioService;

	@RequestMapping(value = "/pendentes-aceite", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Usuario> findUsuariosPendentesDeAceite() {
		return usuarioService.findUsuariosPendentesDeAceite();
	}

	@RequestMapping(value = "/salva", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public Usuario salvaUsuario(HttpServletRequest request, @RequestBody Usuario usuario) {
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
	
	@RequestMapping(value = "/vincula", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public VinculoUsuario vincular(@RequestBody VinculoUsuario vinculoUsuario) {
		return vinculoUsuarioService.save(vinculoUsuario);
	}
	
	@RequestMapping(value = "/pendentes-vinculacao", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Usuario> findUsuariosPendentesVinculacao() {
		return usuarioService.findUsuariosPendentesVinculacao();
	}
	
	@RequestMapping(value = "/calouro/pendentes-vinculacao", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Usuario> findUsuariosCalourosPendentesVinculacao() {
		return usuarioService.findUsuariosCalourosPendentesVinculacao();
	}
	
	@RequestMapping(value = "/veterano/pendentes-vinculacao", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Usuario> findUsuariosVeteranosPendentesVinculacao() {
		return usuarioService.findUsuariosVeteranosPendentesVinculacao();
	}
}
