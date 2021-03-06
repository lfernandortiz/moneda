package org.domain.moneda.entity;

// Generated 28/03/2013 11:43:43 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Activagestor generated by hbm2java
 */
@Entity
@Table(name = "activagestor")
public class Activagestor implements java.io.Serializable {

	private ActivagestorId id;
	private Gestor gestor;
	private Activacion activacion;
	private String observacion;

	public Activagestor() {
	}

	public Activagestor(ActivagestorId id, Gestor gestor, Activacion activacion) {
		this.id = id;
		this.gestor = gestor;
		this.activacion = activacion;
	}

	public Activagestor(ActivagestorId id, Gestor gestor,
			Activacion activacion, String observacion) {
		this.id = id;
		this.gestor = gestor;
		this.activacion = activacion;
		this.observacion = observacion;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "consecutivo", column = @Column(name = "consecutivo", nullable = false)),
			@AttributeOverride(name = "documento", column = @Column(name = "documento", nullable = false, length = 15)),
			@AttributeOverride(name = "fecha", column = @Column(name = "fecha", nullable = false, length = 15)) })
	@NotNull
	public ActivagestorId getId() {
		return this.id;
	}

	public void setId(ActivagestorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "documento", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Gestor getGestor() {
		return this.gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "consecutivo", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Activacion getActivacion() {
		return this.activacion;
	}

	public void setActivacion(Activacion activacion) {
		this.activacion = activacion;
	}

	@Column(name = "observacion", length = 2000)
	@Length(max = 2000)
	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
