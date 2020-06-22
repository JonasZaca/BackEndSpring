package br.com.teste.app;

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * INTERFACE QUE ESTENDE UM REPOSITORY JPA
 * O PRÓPRIO SPRING E O JPA CONTROLA ISSO
 * EXISTE VARIOS MÉTODOS JÁ CARREGADOS PRA MANIPULAÇÃO DE DADOS
 * 
 * NÃO PRECISA FAZER MAIS NADA NESSA INTERFACE
 * */
public interface DoacaoFinanceiraRepository extends JpaRepository<DoacaoFinanceira, Long> {

}
