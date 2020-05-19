package com.caretracking.ctapi.domain.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caretracking.ctapi.domain.model.Intercorrencia;

@Repository
public interface IntercorrenciaRepository extends JpaRepository<Intercorrencia, Long>{

}
