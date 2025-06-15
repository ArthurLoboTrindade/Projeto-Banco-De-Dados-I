package services;

public class ServicoMetodoPagamentoCredito implements ServicoMetodoPagamento {

	@Override
	public Double calcularTaxa(Double valorTotal) {
		double taxa = (valorTotal * 0.05) + 1.00;
		return taxa;
	}
}
