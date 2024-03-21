package com.zorriana.backend.categoriasArticulos.repository;

import com.zorriana.backend.categoriasArticulos.entity.CategoriasArticulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriasArticulosRepository extends JpaRepository<CategoriasArticulos, Long> {
}
