package br.com.zupacademy.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransacaoForm {
	
	@JsonProperty
	private String id;
	@JsonProperty
	private BigDecimal valor;
	@JsonProperty
	private LocalDateTime efetivadaEm;
	@JsonProperty
	private EstabelecimentoTransacaoForm estabelecimento;
	@JsonProperty
	private CartaoTransacaoForm cartao;

	@Override
	public String toString() {
		return "Transacao [id=" + id + ", valor=" + valor + ", efetivadaEm=" + efetivadaEm + ", estabelecimento="
				+ estabelecimento + ", cartao=" + cartao + "]";
	}

}
