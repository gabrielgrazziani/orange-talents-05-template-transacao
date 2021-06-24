package br.com.zupacademy.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class UltimasTransacoes {

	@Autowired
	private TransacaoRepository transacaoRepository;
	
	@Autowired
	private CartaoTransacaoRepository cartaoTransacaoRepository;
	
	@GetMapping("/{idCartao}")
	public ResponseEntity<?> ultimasTransacoes(@PathVariable String idCartao) {
		return cartaoTransacaoRepository.findById(idCartao)
			.map(transacaoRepository::findTop10ByCartaoOrderByEfetivadaEmDesc)
			.map(transacoes -> transacoes.stream().map(TransacaoDto::new))
			.map(ResponseEntity::ok)
			.orElse(ResponseEntity.notFound().build());
	}
}
