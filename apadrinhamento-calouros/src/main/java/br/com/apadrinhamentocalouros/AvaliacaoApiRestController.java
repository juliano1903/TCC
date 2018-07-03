package br.com.apadrinhamentocalouros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apadrinhamentocalouros.model.Avaliacao;
import br.com.apadrinhamentocalouros.service.AvaliacaoService;

@RestController
@RequestMapping(value = "/v1/avaliacao")
public class AvaliacaoApiRestController {

	@Autowired
	private AvaliacaoService avaliacaoService;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Avaliacao> findAll() {
		return avaliacaoService.findAll();
	}
	
	@RequestMapping(value = "/avaliacao/salva", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json")
	public Avaliacao avaliar(@RequestBody Avaliacao avaliacao) {
		return avaliacaoService.avaliar(avaliacao);
	}

}
