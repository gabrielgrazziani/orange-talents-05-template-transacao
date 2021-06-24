package br.com.zupacademy.transacao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerTransacao {
	
	private Logger logger = LoggerFactory.getLogger(ConsumerTransacao.class);
	@Autowired
	private TransacaoRepository transacaoRepository;
	
	@KafkaListener(topics = "${topico.transacao}")
	public void lerTransacao(TransacaoForm transacao) {
		transacaoRepository.save(transacao.toMap());
		logger.info("Transacao = {}",transacao);
	}
}
