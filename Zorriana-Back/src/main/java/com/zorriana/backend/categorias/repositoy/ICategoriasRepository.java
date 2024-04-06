package com.zorriana.backend.categorias.repositoy;

import com.zorriana.backend.categorias.entity.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ICategoriasRepository extends JpaRepository<Categorias, Long> {

    @Transactional
    @Query("UPDATE Categorias c SET c.nombre = :#{#categoria.nombre} WHERE c.categoriaID = :#{#categoria.categoriaID}")
    @Modifying
    void update(Categorias categoria);
}
