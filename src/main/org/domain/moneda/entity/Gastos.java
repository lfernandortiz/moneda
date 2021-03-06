package org.domain.moneda.entity;

// Generated 9/03/2012 07:06:26 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.validator.Length;

/**
 * Gastos generated by hbm2java
 */
@Entity
@Table(name = "gastos", schema = "public")
public class Gastos implements java.io.Serializable {

	private int consecutivo;
	private Tipogasto tipogasto;
	private Personal personal;
	private Date fecha;
	private Long valor;
	private String observacion;
	private Transferencia transferencia;
	private String usuariomod;
	private Date fechamod;

	public Gastos() {
	}

	public Gastos(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Gastos(int consecutivo, Tipogasto tipogasto, Personal personal,
			Date fecha, Long valor, String observacion,
			Transferencia transferencia, String usuariomod, Date fechamod) {
		this.consecutivo = consecutivo;
		this.tipogasto = tipogasto;
		this.personal = personal;
		this.fecha = fecha;
		this.valor = valor;
		this.observacion = observacion;
		this.transferencia = transferencia;
		this.usuariomod = usuariomod;
		this.fechamod = fechamod;
	}

	@Id
	@Column(name = "consecutivo", unique = true, nullable = false)
	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipogasto")
	public Tipogasto getTipogasto() {
		return this.tipogasto;
	}

	public void setTipogasto(Tipogasto tipogasto) {
		this.tipogasto = tipogasto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "documento")
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", length = 13)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "valor", precision = 14, scale = 0)
	public Long getValor() {
		return this.valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	@Column(name = "observacion", length = 200)
	@Length(max = 200)
	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "gastos")
	public Transferencia getTransferencia() {
		return this.transferencia;
	}

	public void setTransferencia(Transferencia transferencia) {
		this.transferencia = transferencia;
	}

	@Column(name = "usuariomod", nullable = true, length = 20)
	@Length(max = 20)
	public String getUsuariomod() {
		return usuariomod;
	}

	public void setUsuariomod(String usuariomod) {
		this.usuariomod = usuariomod;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechamod", length = 29)
	public Date getFechamod() {
		return fechamod;
	}

	
	public void setFechamod(Date fechamod) {
		this.fechamod = fechamod;
	}
	
	

}
