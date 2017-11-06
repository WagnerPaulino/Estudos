package com.whit.dao;

import com.whit.domain.Pessoa;

public class PessoaDAO extends GenericDAO<Pessoa>{

	public PessoaDAO(Class<Pessoa> entityClass) {
		super(entityClass);
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PessoaDAO() {
		super(Pessoa.class);
	}

	public void delete(Pessoa pessoa) {
		super.delete(pessoa.getId(), Pessoa.class);
	}
}
