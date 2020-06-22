package br.com.teste.app;

public enum EnumTipoDoacao {

	FINANCEIRA(1), PRODUTOS(2);
	
	
	private final Integer id;
	
	private EnumTipoDoacao(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
	
}
