package br.com.zupacademy.transacao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartaoTransacaoForm {
	
	@JsonProperty
	private String id;
	@JsonProperty
	private String email;

	@Override
	public String toString() {
		return "Cartao [id=" + id + ", email=" + email + "]";
	}
	
}
