package com.soflex.edm.dominio;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ZonedDateTime fecha;

    private String nroLicitacion;

    private String organizacion;

    private String nombreLicitacion;

    private String capitulo;

    private String titulo;

    private String titulo2;

    private String titulo3;

    private String observaciones;

    private String observaciones2;

    private String observaciones3;

    private String palabrasClaves;

    @Column(columnDefinition = "TEXT")
    private String pregunta;

    @Column(columnDefinition = "MEDIUMTEXT")
    private String texto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "madre")
    private Registro madre;

    private Boolean borrado = false;

    public Registro() {
    }

    public Registro(Long id, ZonedDateTime fecha, String nroLicitacion, String organizacion, String nombreLicitacion, String capitulo, String titulo, String titulo2, String titulo3, String observaciones, String observaciones2, String observaciones3, String palabrasClaves, String pregunta, String texto, Registro madre, Boolean borrado) {
        this.id = id;
        this.fecha = fecha;
        this.nroLicitacion = nroLicitacion;
        this.organizacion = organizacion;
        this.nombreLicitacion = nombreLicitacion;
        this.capitulo = capitulo;
        this.titulo = titulo;
        this.titulo2 = titulo2;
        this.titulo3 = titulo3;
        this.observaciones = observaciones;
        this.observaciones2 = observaciones2;
        this.observaciones3 = observaciones3;
        this.palabrasClaves = palabrasClaves;
        this.pregunta = pregunta;
        this.texto = texto;
        this.madre = madre;
        this.borrado = borrado;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getFecha() {
        return this.fecha;
    }

    public void setFecha(ZonedDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNroLicitacion() {
        return this.nroLicitacion;
    }

    public void setNroLicitacion(String nroLicitacion) {
        this.nroLicitacion = nroLicitacion;
    }

    public String getOrganizacion() {
        return this.organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }

    public String getNombreLicitacion() {
        return this.nombreLicitacion;
    }

    public void setNombreLicitacion(String nombreLicitacion) {
        this.nombreLicitacion = nombreLicitacion;
    }

    public String getCapitulo() {
        return this.capitulo;
    }

    public void setCapitulo(String capitulo) {
        this.capitulo = capitulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo2() {
        return this.titulo2;
    }

    public void setTitulo2(String titulo2) {
        this.titulo2 = titulo2;
    }

    public String getTitulo3() {
        return this.titulo3;
    }

    public void setTitulo3(String titulo3) {
        this.titulo3 = titulo3;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getObservaciones2() {
        return this.observaciones2;
    }

    public void setObservaciones2(String observaciones2) {
        this.observaciones2 = observaciones2;
    }

    public String getObservaciones3() {
        return this.observaciones3;
    }

    public void setObservaciones3(String observaciones3) {
        this.observaciones3 = observaciones3;
    }

    public String getPalabrasClaves() {
        return this.palabrasClaves;
    }

    public void setPalabrasClaves(String palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public String getPregunta() {
        return this.pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Registro getMadre() {
        return this.madre;
    }

    public void setMadre(Registro madre) {
        this.madre = madre;
    }

    public Boolean isBorrado() {
        return this.borrado;
    }

    public Boolean getBorrado() {
        return this.borrado;
    }

    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }

    public Registro id(Long id) {
        this.id = id;
        return this;
    }

    public Registro fecha(ZonedDateTime fecha) {
        this.fecha = fecha;
        return this;
    }

    public Registro nroLicitacion(String nroLicitacion) {
        this.nroLicitacion = nroLicitacion;
        return this;
    }

    public Registro organizacion(String organizacion) {
        this.organizacion = organizacion;
        return this;
    }

    public Registro nombreLicitacion(String nombreLicitacion) {
        this.nombreLicitacion = nombreLicitacion;
        return this;
    }

    public Registro capitulo(String capitulo) {
        this.capitulo = capitulo;
        return this;
    }

    public Registro titulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public Registro titulo2(String titulo2) {
        this.titulo2 = titulo2;
        return this;
    }

    public Registro titulo3(String titulo3) {
        this.titulo3 = titulo3;
        return this;
    }

    public Registro observaciones(String observaciones) {
        this.observaciones = observaciones;
        return this;
    }

    public Registro observaciones2(String observaciones2) {
        this.observaciones2 = observaciones2;
        return this;
    }

    public Registro observaciones3(String observaciones3) {
        this.observaciones3 = observaciones3;
        return this;
    }

    public Registro palabrasClaves(String palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
        return this;
    }

    public Registro pregunta(String pregunta) {
        this.pregunta = pregunta;
        return this;
    }

    public Registro texto(String texto) {
        this.texto = texto;
        return this;
    }

    public Registro madre(Registro madre) {
        this.madre = madre;
        return this;
    }

    public Registro borrado(Boolean borrado) {
        this.borrado = borrado;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fecha='" + getFecha() + "'" +
            ", nroLicitacion='" + getNroLicitacion() + "'" +
            ", organizacion='" + getOrganizacion() + "'" +
            ", nombreLicitacion='" + getNombreLicitacion() + "'" +
            ", capitulo='" + getCapitulo() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", titulo2='" + getTitulo2() + "'" +
            ", titulo3='" + getTitulo3() + "'" +
            ", observaciones='" + getObservaciones() + "'" +
            ", observaciones2='" + getObservaciones2() + "'" +
            ", observaciones3='" + getObservaciones3() + "'" +
            ", palabrasClaves='" + getPalabrasClaves() + "'" +
            ", pregunta='" + getPregunta() + "'" +
            ", texto='" + getTexto() + "'" +
            ", madre='" + getMadre() + "'" +
            ", borrado='" + isBorrado() + "'" +
            "}";
    }

}