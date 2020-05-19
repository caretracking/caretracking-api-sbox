package com.caretracking.ctapi.domain.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caretracking.ctapi.domain.model.Responsavel;

@Repository
public interface ResponsavelRepository extends JpaRepository<Responsavel, Long>{

}
