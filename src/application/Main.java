package application;

import java.time.Instant;

import entities.Pedido;
import entities.enums.StatusDoPedido;

public class Main {

	public static void main(String[] args) {
		Pedido p = new Pedido(10, Instant.now(), StatusDoPedido.CRIADO);
		
		System.out.println(p);
	}

}
