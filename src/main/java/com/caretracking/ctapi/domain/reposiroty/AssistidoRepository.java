package com.caretracking.ctapi.domain.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caretracking.ctapi.domain.model.Assistido;

@Repository
public interface AssistidoRepository extends JpaRepository<Assistido, Long>{

}
