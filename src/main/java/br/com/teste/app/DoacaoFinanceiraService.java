package br.com.teste.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * ANOTAÇÃO PRO SPRING SABER QUE ESSA CLASSE
 * CONTROLA UMA TRANSAÇÃO NO BANCO DE DADOS
 * */
@Service
public class DoacaoFinanceiraService {

	/*
	 * ANOTAÇÃO PARA FAZER A INJEÇÃO DE DEPENDENCIA
	 * O SPRING CONTROLA A CRIAÇÃO DESSE OBJETO
	 * 
	 * É COMO SE FOSSE 
	 * DoacaoFinanceiraRepository repos = new DoacaoFinanceiraRepository();
	 * 
	 * ESSA DECLARACAO VC ACESSA OS MÉTODOS DO REPOSITÓRIO
	 * 
	 * - GET => BUSCA DE DADOS
     * - POST => SALVAR / LOGIN / PROCESSAR DADOS
     * - PUT => ATUALIZAR
     * - DELETE => DELETAR
     * 
	 * */
	@Autowired
	private DoacaoFinanceiraRepository doacaoFinanceiraRepository;
	
	public List<DoacaoFinanceira> findAll() {
		return doacaoFinanceiraRepository.findAll();
	}
	
	public void excluir(Long id) {
		doacaoFinanceiraRepository.deleteById(id);
	}
	
	public DoacaoFinanceira inserir(DoacaoFinanceira novadoacaoFinanceiras) {
		return doacaoFinanceiraRepository.save(novadoacaoFinanceiras);
	}
	
	public DoacaoFinanceira atualizar(Long id , DoacaoFinanceira novadoacaoFinanceiras) {
		if ( id == null) {
			return null;
		}
		return doacaoFinanceiraRepository.saveAndFlush(novadoacaoFinanceiras);
	}
	
	public DoacaoFinanceira buscarID(Long id) {
		return doacaoFinanceiraRepository.findById(id).get();
//		return doacaoFinanceiraRepository.getOne(id);
	}
}
