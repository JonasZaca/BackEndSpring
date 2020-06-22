package br.com.teste.app;

public class DoacaoFinanceiraRequest {

	private String tipoDoacao;
	private Double valor;
	private Long qtdProduto;
	private String tipoProduto;
	
	public String getTipoDoacao() {
		return tipoDoacao;
	}
	public void setTipoDoacao(String tipoDoacao) {
		this.tipoDoacao = tipoDoacao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Long getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(Long qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
}
