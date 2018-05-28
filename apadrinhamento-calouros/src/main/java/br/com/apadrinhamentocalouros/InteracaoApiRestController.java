package br.com.apadrinhamentocalouros;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apadrinhamentocalouros.model.Interacao;
import br.com.apadrinhamentocalouros.service.InteracaoService;

@RestController
@RequestMapping(value = "/v1/interacao")
public class InteracaoApiRestController {

	@Autowired
	private InteracaoService interacaoService;

	@RequestMapping(value = "/salva", method = RequestMethod.POST, produces = "application/json")
	public Interacao salvarInteracao(@RequestBody Interacao interacao) {
		return interacaoService.save(interacao);
	}
	
	@RequestMapping(value = "/{idUsuarioVeterano}/{idUsuarioCalouro}", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Interacao> buscarTodas(@PathVariable Long idUsuarioVeterano, @PathVariable Long idUsuarioCalouro) {
		return interacaoService.findAllByIdsAlunos(Arrays.asList(idUsuarioVeterano, idUsuarioCalouro));
	}
}
