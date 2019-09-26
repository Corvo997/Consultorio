package br.ufpa.facomp.jsf.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;



/**
 * Entidade abstrata que deve ser herdada por qualquer entidade que seja
 * meramente descritiva. Para esta entidade haverá um Conversor JSF genérico,
 * que irá evitar a criação de conversores específicos para cada entidade.
 * 
 */
@MappedSuperclass
public abstract class EntidadeDescritiva implements Entidade<Long>, Serializable {

	private static final long serialVersionUID = 1L;
	public static final String LISTAR_TODOS = "EntidadeDescritiva.listarTodos";


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	private Boolean ativo = true;
	
	public EntidadeDescritiva() {
		ativo = true;
	}

	public EntidadeDescritiva(Long id) {
		super();
		this.id = id;
		this.ativo = true;
	}

	public EntidadeDescritiva(Long id, Boolean ativo) {
		super();
		this.id = id;
		this.ativo = ativo;
	}


	public EntidadeDescritiva(Boolean ativo) {
		super();
		this.ativo = ativo;
	}

	public Boolean estaEmMemoria() {
		return (id == null);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	public String getTemplateListagemAtivos(Class classe){

		return "SELECT e FROM "+classe.getSimpleName()+" e WHERE e.ativo = TRUE ORDER BY e.id";

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntidadeDescritiva other = (EntidadeDescritiva) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
