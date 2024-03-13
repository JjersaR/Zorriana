package com.zorriana.backend.categorias.repositoy;

import com.zorriana.backend.categorias.entity.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoriasRepository extends JpaRepository<Categorias, Long> {
}
