package br.com.dattasign.desafio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receitas")
public class Receita {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "publicado")
	private boolean publicado;
	
	public Receita() {
		
	}

	public Receita(String titulo, String descricao, boolean publicado) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.publicado = publicado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isPublicado() {
		return publicado;
	}

	public void setPublicado(boolean isPublicado) {
		this.publicado = isPublicado;
	}

	@Override
	public String toString() {
		return "Receita [id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", publicado=" + publicado
				+ "]";
	}
	
}
