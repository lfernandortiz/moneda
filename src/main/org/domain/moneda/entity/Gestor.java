package org.domain.moneda.entity;

// Generated 28/03/2013 11:43:43 PM by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Gestor generated by hbm2java
 */
@Entity
@Table(name = "gestor")
public class Gestor implements java.io.Serializable {

	private String documento;
	private Personal personal;
	private Set<Activagestor> activagestors = new HashSet<Activagestor>(0);
	private Set<Activacion> activacions = new HashSet<Activacion>(0);

	public Gestor() {
	}

	public Gestor(Personal personal) {
		this.personal = personal;
	}

	public Gestor(Personal personal, Set<Activagestor> activagestors,
			Set<Activacion> activacions) {
		this.personal = personal;
		this.activagestors = activagestors;
		this.activacions = activacions;
	}

	//@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "personal"))
	@Id
	//@GeneratedValue(generator = "generator")
	@Column(name = "documento", unique = true, nullable = false, length = 15)
	@Length(max = 15)
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@NotNull
	//@Length(max = 15)
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gestor")
	public Set<Activagestor> getActivagestors() {
		return this.activagestors;
	}

	public void setActivagestors(Set<Activagestor> activagestors) {
		this.activagestors = activagestors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gestor")
	public Set<Activacion> getActivacions() {
		return this.activacions;
	}

	public void setActivacions(Set<Activacion> activacions) {
		this.activacions = activacions;
	}

}
