package com.projectf.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

	@RequestMapping(method = RequestMethod.GET, name = "/api/pessoas")
	public ResponseEntity<?> findAll() {
		List<Pessoa> pessoas = pessoaService.findAll();
		return ResponseEntity.ok(pessoas);
	}

	@RequestMapping(method = RequestMethod.POST, name = "/api/pessoas")
	public ResponseEntity<?> insert(@RequestBody Pessoa pessoa) {
		pessoaService.insert(pessoa);
		return ResponseEntity.ok().build();
	}

}
