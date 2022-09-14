package entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entidades.enums.OrdemStatus;

public class Ordem {
	private static DateTimeFormatter FMT1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static DateTimeFormatter FMT2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private Cliente cliente;
	private OrdemStatus status;

	private LocalDateTime momento;
	private final List<OrdemItem> itens = new ArrayList<>();

	public Ordem() {
	}

	public Ordem(LocalDateTime momento, OrdemStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public List<OrdemItem> getItens() {
		return itens;
	}

	public void adicionaItem(OrdemItem item) {
		itens.add(item);
	}

	public void removeItem(OrdemItem item) {
		itens.remove(item);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		double total = 0;
		StringBuilder builder = new StringBuilder();
		
		builder.append("\nSUMARIO ORDEM:\n");
		builder.append("Momento da Ordem: ").append(momento.format(FMT2));
		builder.append("\nStatus da ordem: ").append(status);
		builder.append("\nCliente: ").append(cliente.getNome()).append(" (").append(cliente.getDataAniversario().format(FMT1)).append(") - ").append(cliente.getEmail());
		builder.append("\nOrdem itens:\n");
		
		for (OrdemItem item : itens) {
			builder.append(item.getProduto().getNome()).append(", ").append(item.getProduto().getPreco());
			builder.append(", Quantidade: ").append(item.getQuantidade());
			builder.append(", Subtotal: $").append(item.subTotal()).append("\n");
			total += item.subTotal();
		}
		builder.append("Preco total: $").append(total);
		
		return builder.toString();
	}

}
