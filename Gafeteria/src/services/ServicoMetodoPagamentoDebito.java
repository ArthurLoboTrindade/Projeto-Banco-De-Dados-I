package services;

public class ServicoMetodoPagamentoDebito implements ServicoMetodoPagamento {

	@Override
	public Double calcularTaxa(Double valorTotal) {
		double taxa = (valorTotal * 0.02);
		return taxa;
	}

}