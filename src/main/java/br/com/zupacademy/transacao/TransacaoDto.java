package br.com.zupacademy.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoDto {

	private String id;
	private BigDecimal valor;
	private LocalDateTime efetivadaEm;
	
	public TransacaoDto(Transacao transacao) {
		this.id = transacao.getId();
		this.valor = transacao.getValor();
		this.efetivadaEm = transacao.getEfetivadaEm();
	}

	public String getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public LocalDateTime getEfetivadaEm() {
		return efetivadaEm;
	}
	
}
