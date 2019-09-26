package br.ufpa.facomp.jsf.repository;

import br.ufpa.facomp.jsf.domain.Consultorio;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Consultorio entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio, Long> {

}
