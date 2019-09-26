package br.ufpa.facomp.jsf.repository;

import br.ufpa.facomp.jsf.domain.Consulta;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data  repository for the Consulta entity.
 */
@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    
    List<Consulta> findAllByPessoaNomeContaining(String nome);
}
