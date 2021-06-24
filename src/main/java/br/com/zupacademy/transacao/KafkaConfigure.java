package br.com.zupacademy.transacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.MessageConverter;

@Configuration
public class KafkaConfigure {

	@Bean
	public MessageConverter converter() {
		return new JsonMessageConverter();
	}
}
