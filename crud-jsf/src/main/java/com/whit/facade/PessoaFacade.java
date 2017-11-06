package com.whit.facade;

import java.util.List;

import com.whit.dao.PessoaDAO;
import com.whit.domain.Pessoa;


public class PessoaFacade {
	private PessoaDAO pessoaDAO = new PessoaDAO();

	public void createPessoa(Pessoa message) {
		pessoaDAO.beginTransaction();
		pessoaDAO.save(message);
		pessoaDAO.commitAndCloseTransaction();
	}

	public void updatePessoa(Pessoa pessoa) {
		pessoaDAO.beginTransaction();
		Pessoa persistedPessoa = pessoaDAO.find(pessoa.getId());
		persistedPessoa.setMessage(pessoa.getMessage());
		pessoaDAO.commitAndCloseTransaction();
	}

	public void deletePessoa(Pessoa pessoa) {
		pessoaDAO.beginTransaction();
		Pessoa persistedMessageWithIdOnly = pessoaDAO.findReferenceOnly(pessoa.getId());
		pessoaDAO.delete(persistedMessageWithIdOnly);
		pessoaDAO.commitAndCloseTransaction();

	}

	public Pessoa findPessoa(Long id) {
		pessoaDAO.beginTransaction();
		Pessoa message = pessoaDAO.find(id);
		pessoaDAO.closeTransaction();
		return message;
	}

	public List<Pessoa> listAll() {
		pessoaDAO.beginTransaction();
		List<Pessoa> result = pessoaDAO.findAll();
		pessoaDAO.closeTransaction();

		return result;
	}
}
