package br.com.treinaweb.ediaristas.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.ediaristas.core.models.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    
}
