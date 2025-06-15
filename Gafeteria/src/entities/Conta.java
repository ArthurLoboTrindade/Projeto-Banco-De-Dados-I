package entities;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private Integer id_conta;
	private Double valor_total;
	
	private List<Pedido> itens_pedidos = new ArrayList<>();
	
	public Conta(Integer id_conta, Double valor_total) {
		this.id_conta = id_conta;
		this.valor_total = valor_total;
	}

	public Integer getId_conta() {
		return id_conta;
	}

	public void setId_conta(Integer id_conta) {
		this.id_conta = id_conta;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}

	public void addPedido(Pedido pedido) {
		itens_pedidos.add(new Pedido());
	}
	

	public void mostraPedidos() {
		
		for (Pedido p : itens_pedidos) {
            System.out.println(p.toString());
        }
		
	}

	
	
	
	
}
