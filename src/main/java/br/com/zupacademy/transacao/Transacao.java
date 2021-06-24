package br.com.zupacademy.transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transacao {
	
	@Id
	private String id;
	private BigDecimal valor;
	private LocalDateTime efetivadaEm;
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	private CartaoTransacao cartao;
	@Embedded
	private EstabelecimentoTransacao estabelecimento;
	
	public Transacao(String id, BigDecimal valor, LocalDateTime efetivadaEm, EstabelecimentoTransacao estabelecimento,CartaoTransacao cartao) {
		this.id = id;
		this.valor = valor;
		this.efetivadaEm = efetivadaEm;
		this.estabelecimento = estabelecimento;
		this.cartao = cartao;
	}
	
	@Deprecated
	public Transacao() {
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

@Embeddable
class EstabelecimentoTransacao{

	private String nome;
	private String cidade;
	private String endereco;
	
	public EstabelecimentoTransacao(String nome, String cidade, String endereco) {
		this.nome = nome;
		this.cidade = cidade;
		this.endereco = endereco;
	}
	
	@Deprecated
	public EstabelecimentoTransacao() {
	}
}
