package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.lancamento.LancamentoRepositoryQurey;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQurey {
	
	public Lancamento findByCodigo(Long codigo);
}
