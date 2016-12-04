package view;

import java.io.Serializable;

import javax.inject.Inject;

import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import business.PessoaBC;
import domain.Pessoa;

@ViewController
public class PessoaEditMB extends AbstractEditPageBean<Pessoa, Long> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private PessoaBC bc;
	
	public String delete() {
		return null;
	}
	public String insert() {
		setBean(new Pessoa());
		bc.insert(getBean());
		return null;
	}
	public String update() {
		bc.update(getBean());
		return null;
	}
	@Override
	protected Pessoa handleLoad(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
