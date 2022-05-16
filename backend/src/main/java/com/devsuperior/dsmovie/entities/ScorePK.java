package com.devsuperior.dsmovie.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Embeddable
public class ScorePK implements Serializable{
		
	private static final long serialVersionUID = 1L;

	@ManyToOne // Bean que fará a configuração das chaves estrangeiras
	@JoinColumn(name="movie_id") // Configuração que nomeará a chave estrangeira na tabela de ligação 
	private Movie movie; // Chave Estrangeira

	@ManyToOne // Bean que fará a configuração das chaves estrangeiras
	@JoinColumn(name="user_id") // Configuração que nomeará a chave estrangeira na tabela de ligação
	private User user; // Chave Estrangeira
	
	public ScorePK() {		
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(movie, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScorePK other = (ScorePK) obj;
		return Objects.equals(movie, other.movie) && Objects.equals(user, other.user);
	}
	
	
}
