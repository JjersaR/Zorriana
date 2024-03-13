package com.zorriana.backend.articulos.repository;

import com.zorriana.backend.articulos.entity.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArticulosRepository extends JpaRepository<Articulos, Long> {
}
