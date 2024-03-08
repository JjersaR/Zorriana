package com.zorriana.backend.generos.repository;

import com.zorriana.backend.generos.entity.Generos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenerosRepository extends JpaRepository<Generos,Long> {
}
