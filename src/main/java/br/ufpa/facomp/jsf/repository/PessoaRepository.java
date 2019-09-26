package br.ufpa.facomp.jsf.repository;

import br.ufpa.facomp.jsf.domain.Pessoa;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Pessoa entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
           
    List<Pessoa> findAllByNomeContaining(String nome);

    

}
