package entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Postagem {
	
	private static DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	private List<Comentario> comentarios = new ArrayList<>();

	public Postagem() {
	}

	public Postagem(LocalDateTime momento, String titulo, String conteudo, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void adicionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}

	public void removerComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(titulo + "\n");
		builder.append(likes);
		builder.append(" Likes - ");
		builder.append(momento.format(FMT) + "\n");
		builder.append(conteudo + "\n");
		builder.append("Comentarios:\n");		
		for (Comentario c: comentarios) {
			builder.append(c.getTexto() + "\n");
		}		
		
		return builder.toString();
	}
	
	
}
