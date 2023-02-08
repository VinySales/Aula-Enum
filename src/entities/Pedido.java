package entities;

import java.time.Instant;
import java.time.LocalDate;

import entities.enums.StatusDoPedido;

public class Pedido {
	private Integer id;
	private Instant data;
	private StatusDoPedido status;
	
	public Pedido() {
	}

	public Pedido(Integer id, Instant data, StatusDoPedido status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Instant getData() {
		return data;
	}

	public void setData(Instant data) {
		this.data = data;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
}
