package br.com.apadrinhamentocalouros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apadrinhamentocalouros.model.Curso;
import br.com.apadrinhamentocalouros.model.Interacao;
import br.com.apadrinhamentocalouros.model.Usuario;
import br.com.apadrinhamentocalouros.service.CursoService;
import br.com.apadrinhamentocalouros.service.InteracaoService;
import br.com.apadrinhamentocalouros.service.UsuarioService;

@RestController
@RequestMapping(value = "/v1/interacao")
public class InteracaoApiRestController {

	@Autowired
	private InteracaoService interacaoService;

	@RequestMapping(value = "/salva", method = RequestMethod.POST, produces = "application/json")
	public Interacao salvarInteracao(@RequestBody Interacao interacao) {
		return interacaoService.save(interacao);
	}
}
