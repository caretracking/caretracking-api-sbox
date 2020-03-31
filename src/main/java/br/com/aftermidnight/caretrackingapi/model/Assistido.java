package br.com.aftermidnight.caretrackingapi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "assistido")
public class Assistido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name = "nm_nome")
	private String nome;	
	
	@OneToMany(mappedBy = "codigo")
	private List<Intercorrencia> intercorrencias;
	
	@OneToMany(mappedBy = "codigo")
	private List<Procedimento> procedimentos;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "assistido_assistente", joinColumns = @JoinColumn(name = "codigo_assistido")
		, inverseJoinColumns = @JoinColumn(name = "codigo_assistente"))
	private List<Assistente> assistentes;
	
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Intercorrencia> getIntercorrencias() {
		return intercorrencias;
	}

	public void setIntercorrencias(List<Intercorrencia> intercorrencias) {
		this.intercorrencias = intercorrencias;
	}

	public List<Procedimento> getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(List<Procedimento> procedimentos) {
		this.procedimentos = procedimentos;
	}

	public List<Assistente> getAssistentes() {
		return assistentes;
	}

	public void setAssistentes(List<Assistente> assistentes) {
		this.assistentes = assistentes;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assistido other = (Assistido) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
