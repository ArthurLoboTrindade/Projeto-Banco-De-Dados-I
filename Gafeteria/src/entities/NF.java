package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NF {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
	private Integer id_nf;
	private Double valor_nf;
	private Integer id_filial_cnpj;
	private LocalDateTime data_emissao;
	private Integer id_pagamento;
	
	public NF(Integer id_nf, Double valor_nf, Integer id_filial_cnpj, LocalDateTime data_emissao, Integer id_pagamento) {
		this.id_nf = id_nf;
		this.valor_nf = valor_nf;
		this.id_filial_cnpj = id_filial_cnpj;
		this.data_emissao = data_emissao;
		this.id_pagamento = id_pagamento;
	}

	public Integer getId_nf() {
		return id_nf;
	}

	public void setId_nf(Integer id_nf) {
		this.id_nf = id_nf;
	}

	public Double getValor_nf() {
		return valor_nf;
	}

	public void setValor_nf(Double valor_nf) {
		this.valor_nf = valor_nf;
	}

	public Integer getId_filial_cnpj() {
		return id_filial_cnpj;
	}

	public void setId_filial_cnpj(Integer id_filial_cnpj) {
		this.id_filial_cnpj = id_filial_cnpj;
	}

	public LocalDateTime getData_emissao() {
		return data_emissao;
	}

	public void setData_emissao(LocalDateTime data_emissao) {
		this.data_emissao = data_emissao;
	}

	public Integer getId_pagamento() {
		return id_pagamento;
	}

	public void setId_pagamento(Integer id_pagamento) {
		this.id_pagamento = id_pagamento;
	}
	
	@Override
	public String toString() {
	    return "===== NOTA FISCAL =====\n"
	         + "Código da Nota:" + id_nf + "\n"
	         + "CNPJ:" + id_filial_cnpj + "\n"
	         + "Data/Hora da Compra:" + fmt.format(data_emissao) + "\n"
	         + "Valor Total:R$ " + String.format("%.2f", valor_nf) + "\n"
	         + "========================";
	}
	
	
	
}
