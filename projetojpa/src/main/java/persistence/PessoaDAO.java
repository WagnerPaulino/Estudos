package persistence;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import domain.Pessoa;

@PersistenceController
public class PessoaDAO extends JPACrud<Pessoa, Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
