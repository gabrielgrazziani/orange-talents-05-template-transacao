package br.com.zupacademy.transacao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartaoTransacao {
	@Id
	private String id;
	private String email;

	public CartaoTransacao(String id, String email) {
		this.id = id;
		this.email = email;
	}

	@Deprecated
	public CartaoTransacao() {
	}
}
