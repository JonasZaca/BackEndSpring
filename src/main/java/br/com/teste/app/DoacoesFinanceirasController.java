package br.com.teste.app;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoacoesFinanceirasController {

    private static java.lang.Long contadorId = 1l;
    private Map<java.lang.Long, DoacaoFinanceira> doacaoFinanceira = new TreeMap<>();
   // SimpleDateFormat formatador = new SimpleDateFormat ("dd/MM/yyyy");

    /*
     * NO CONTROLLER
     * VC SEMPRE CHAMA O SERVIÇO
     * */
    @Autowired
    private DoacaoFinanceiraService doacaoFinanceiraService;
    
//    @Id
//    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    /*public DoacoesFinanceirasController() {
        DoacaoFinanceira dF1 = new DoacaoFinanceira();
        dF1.setId(contadorId++);
        dF1.setValor(10);
        doacaoFinanceira.put(dF1.getId(), dF1);
    }*/

    /*
     * ESSAS ANOTAÇÕES EM CIMA DO MÉTODO SIGNIFICA QUAL MÉTODO HTTP
     * ELE VAI CHAMAR
     * 
     * OS VERBOS HTTP SÃO
     * - GET => BUSCA DE DADOS
     * - POST => SALVAR / LOGIN / PROCESSAR DADOS
     * - PUT => ATUALIZAR
     * - DELETE => DELETAR
     * */
    @GetMapping("/doacaoFinanceiras")
    List<DoacaoFinanceira> all() {
    	return doacaoFinanceiraService.findAll();
//        return new ArrayList<>(doacaoFinanceira.values());
    }
    
    @PostMapping("/doacaoFinanceiras")
    DoacaoFinanceira newDoacaoFinanceiras(@RequestBody DoacaoFinanceiraRequest novadoacaoFinanceiras) {
      DoacaoFinanceira doacaoFinanceira = new DoacaoFinanceira();
      doacaoFinanceira.setQtdProduto(novadoacaoFinanceiras.getQtdProduto());
      doacaoFinanceira.setTipoDoacao(novadoacaoFinanceiras.getTipoDoacao());
      doacaoFinanceira.setTipoProduto(novadoacaoFinanceiras.getTipoProduto());
      doacaoFinanceira.setValor(novadoacaoFinanceiras.getValor());
       return doacaoFinanceiraService.inserir(doacaoFinanceira);
    }
    @GetMapping("/doacaoFinanceiras/{id}")
    DoacaoFinanceira one(@PathVariable java.lang.Long id) {
        return doacaoFinanceiraService.buscarID(id);
    }
    @PutMapping("/doacaoFinanceiras/{id}")
    DoacaoFinanceira atualizar(@RequestBody DoacaoFinanceira doacaoFinanceiras, @PathVariable java.lang.Long id) {
        return doacaoFinanceiraService.atualizar(id , doacaoFinanceiras);
    }
    @DeleteMapping("/doacaoFinanceiras/{id}")
    void excluir(@PathVariable java.lang.Long id) {
        doacaoFinanceiraService.excluir(id);
    }
}