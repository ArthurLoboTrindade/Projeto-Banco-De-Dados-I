package entities;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

import services.ServicoMetodoPagamento;

public class Pagamento {
	
	private Integer id_pagamento;
	private Double valor;
	private	Integer id_conta;
	
	private ServicoMetodoPagamento metodoPagamento;
	
	public Pagamento(Integer id_pagamento, Double valor, Integer id_conta, ServicoMetodoPagamento metodoPagamento) {
		this.id_pagamento = id_pagamento;
		this.valor = valor;
		this.id_conta = id_conta;
		this.metodoPagamento = metodoPagamento;
	}

	public Integer getId_pagamento() {
		return id_pagamento;
	}

	public void setId_pagamento(Integer id_pagamento) {
		this.id_pagamento = id_pagamento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getId_conta() {
		return id_conta;
	}

	public void setId_conta(Integer id_conta) {
		this.id_conta = id_conta;
	}
	
	public NF processarNotaFiscal(Integer id_filial_cnpj, Conta conta) {
	    LocalDateTime dateTime = LocalDateTime.now();
	    int id_nf = ThreadLocalRandom.current().nextInt(10000, 99999);
	    Double valor_nf = (metodoPagamento.calcularTaxa(conta.getValor_total()))+conta.getValor_total();
	    
	    NF nf = new NF(id_nf, valor_nf, id_filial_cnpj, dateTime, id_pagamento);
	    return nf;
	}
	
	
}
