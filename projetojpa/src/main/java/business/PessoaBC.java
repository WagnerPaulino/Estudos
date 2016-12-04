package business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import domain.Pessoa;
import persistence.PessoaDAO;

@BusinessController
public class PessoaBC extends DelegateCrud<Pessoa, Long, PessoaDAO>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
