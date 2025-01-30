package com.github.murilojatoba.unyleya_cidadao_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.murilojatoba.unyleya_cidadao_backend.model.Cidadao;

@Repository
public interface CidadaoRepository extends JpaRepository<Cidadao, Long> {

}
