package aplicacao;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import entidades.Order;
import entidades.enums.OrderStatus;

public class TrabalhandoEnum {
	public static void main(String[] args) {
		
		Order order = new Order(1080, LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS) , OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1+"\n"+os2);
	}

}
