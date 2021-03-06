package com.projectf.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projectf.domain.Pessoa;
import com.projectf.service.PessoaService;

@RestController
public class PessoaRest {

	@Autowired
	private PessoaService pessoaService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/api/pessoas/{id}")
	public ResponseEntity<?> load(@PathVariable("id") Long id) {
		Pessoa pessoa = pessoaService.findOne(id);
		return ResponseEntity.ok(pessoa);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/api/pessoas")
	public ResponseEntity<?> findAll() {
		List<Pessoa> pessoas = pessoaService.findAll();
		return ResponseEntity.ok(pessoas);
	}

	@RequestMapping(method = RequestMethod.POST, path = "/api/pessoas")
	public Pessoa insert(@RequestBody Pessoa pessoa) {
		pessoaService.insert(pessoa);ResponseEntity.ok().build();
		return pessoa;
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/api/pessoas/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		pessoaService.delete(id);
		return ResponseEntity.ok().build();
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/api/pessoas/{id}")
	public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Pessoa pessoa) {
		Pessoa pessoa2 = pessoaService.findOne(id);
		if (pessoa2 == null) {
			return ResponseEntity.notFound().build();
		}
		pessoaService.update(pessoa, pessoa2);
		return ResponseEntity.ok().build();
	}

}
