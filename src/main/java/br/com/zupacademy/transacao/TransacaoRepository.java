package br.com.zupacademy.transacao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao, String>{

	public List<Transacao> findTop10ByCartaoOrderByEfetivadaEmDesc(CartaoTransacao cartaoTransacao);
}
