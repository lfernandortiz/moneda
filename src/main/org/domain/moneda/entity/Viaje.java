package org.domain.moneda.entity;

// Generated 30/12/2011 03:58:33 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Viaje generated by hbm2java
 */
@Entity
@Table(name = "viaje")
public class Viaje implements java.io.Serializable {

	private int consecutivo;
	private Date fechainicio;
	private Date fechafin;
	private Integer cupoinicialviajero; 
	private Integer cupoinicialinternet;
	private Integer cupoviajero;
	private Integer cupointernet;
	private String cedulatarjetahabiente;
	private Set<Tarjetaviaje> tarjetaviajes = new HashSet<Tarjetaviaje>(0);
	private Set<Activacion> activacions = new HashSet<Activacion>(0);

	public Viaje() {
	}

	public Viaje(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Viaje(int consecutivo, Date fechainicio, Date fechafin,
			Integer cupoinicialviajero, Integer cupoinicialinternet,
			Integer cupoviajero, Integer cupointernet,
			String cedulatarjetahabiente, Set<Tarjetaviaje> tarjetaviajes,
			Set<Activacion> activacions) {
		this.consecutivo = consecutivo;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.cupoinicialviajero = cupoinicialviajero;
		this.cupoinicialinternet = cupoinicialinternet;
		this.cupoviajero = cupoviajero;
		this.cupointernet = cupointernet;
		this.cedulatarjetahabiente = cedulatarjetahabiente;
		this.tarjetaviajes = tarjetaviajes;
		this.activacions = activacions;
	}

	@Id
	@Column(name = "consecutivo", unique = true, nullable = false)
	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechainicio", length = 13)
	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechafin", length = 13)
	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	@Column(name = "cupoinicialviajero", precision = 8, scale = 0)
	public Integer getCupoinicialviajero() {
		return this.cupoinicialviajero;
	}

	public void setCupoinicialviajero(Integer cupoinicialviajero) {
		this.cupoinicialviajero = cupoinicialviajero;
	}

	@Column(name = "cupoinicialinternet", precision = 8, scale = 0)
	public Integer getCupoinicialinternet() {
		return this.cupoinicialinternet;
	}

	public void setCupoinicialinternet(Integer cupoinicialinternet) {
		this.cupoinicialinternet = cupoinicialinternet;
	}

	@Column(name = "cupoviajero", precision = 8, scale = 0)
	public Integer getCupoviajero() {
		return this.cupoviajero;
	}

	public void setCupoviajero(Integer cupoviajero) {
		this.cupoviajero = cupoviajero;
	}

	@Column(name = "cupointernet", precision = 8, scale = 0)
	public Integer getCupointernet() {
		return this.cupointernet;
	}

	public void setCupointernet(Integer cupointernet) {
		this.cupointernet = cupointernet;
	}
	
	@Column(name = "cedulatarjetahabiente", nullable = false, length = 15)
	@NotNull
	@Length(max = 15)
	public String getCedulatarjetahabiente() {
		return this.cedulatarjetahabiente;
	}

	public void setCedulatarjetahabiente(String cedulatarjetahabiente) {
		this.cedulatarjetahabiente = cedulatarjetahabiente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "viaje")
	public Set<Tarjetaviaje> getTarjetaviajes() {
		return this.tarjetaviajes;
	}

	public void setTarjetaviajes(Set<Tarjetaviaje> tarjetaviajes) {
		this.tarjetaviajes = tarjetaviajes;
	}
	
	
	private Date fechamod;
	private String usuariomod;
	
	
	
	@Column(name = "usuariomod", nullable = true, length = 20)
	@Length(max = 20)
	public String getUsuariomod() {
		return this.usuariomod;
	}

	public void setUsuariomod(String usuariomod) {
		this.usuariomod = usuariomod;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechamod", length = 29)
	public Date getFechamod() {
		return this.fechamod;
	}

	public void setFechamod(Date fechamod) {
		this.fechamod = fechamod;
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "activaviaje", schema = "public", joinColumns = { @JoinColumn(name = "consviaje", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "consactivacion", nullable = false, updatable = false) })
	public Set<Activacion> getActivacions() {
		return this.activacions;
	}

	public void setActivacions(Set<Activacion> activacions) {
		this.activacions = activacions;
	}

}
