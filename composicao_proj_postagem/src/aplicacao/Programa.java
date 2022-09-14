package aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entidades.Comentario;
import entidades.Postagem;

public class Programa {
	
	public static void main(String[] args) {
		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario("Wow that's awesome!");
		
		Postagem post1 = new Postagem(LocalDateTime.parse("21/06/2022 13:05:44", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
				"Trave to New Zealand", 
				"I'm going to visit this wonderful country!", 12);
		
		post1.adicionarComentario(c1);
		post1.adicionarComentario(c2);
		
		System.out.println(post1);
	}

}
