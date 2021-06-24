package br.com.zupacademy.transacao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EstabelecimentoTransacaoForm {

	@JsonProperty
	private String nome;
	@JsonProperty
	private String cidade;
	@JsonProperty
	private String endereco;

	@Override
	public String toString() {
		return "Estabelecimento [nome=" + nome + ", cidade=" + cidade + ", endereco=" + endereco + "]";
	}

}
