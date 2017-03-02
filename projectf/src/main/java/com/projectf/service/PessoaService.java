package com.projectf.service;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectf.domain.Pessoa;
import com.projectf.repository.PessoaRepository;

@Service
public class PessoaService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Logger log = LoggerFactory.getLogger(PessoaService.class);

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<Pessoa> findAll() {
		log.info("[findAll] Buscando todas as pessoas");
		return pessoaRepository.findAll();
	}

	@Transactional
	public Pessoa insert(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@Transactional
	public void delete(Long id) {
		pessoaRepository.delete(id);
	}

	@Transactional
	public void update(Pessoa pessoa, Pessoa pessoaOld) {
		pessoaOld.setNome(pessoa.getNome());
		pessoaOld.setTipo(pessoa.getTipo());
		pessoaRepository.save(pessoaOld);
	}

	public Pessoa findOne(Long id) {
		return pessoaRepository.findOne(id);
	}

}
