package br.com.teste.app;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DoacaoFinanceira implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String tipoDoacao;
	private Double valor;
	private Long qtdProduto;
	private String tipoProduto;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getTipoDoacao() {
		return tipoDoacao;
	}

	public void setTipoDoacao(String tipoDoacao) {
		this.tipoDoacao = tipoDoacao;
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
