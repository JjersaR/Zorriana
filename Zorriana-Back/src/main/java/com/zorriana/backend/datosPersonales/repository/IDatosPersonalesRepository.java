package com.zorriana.backend.datosPersonales.repository;

import com.zorriana.backend.datosPersonales.entity.DatosPersonales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDatosPersonalesRepository extends JpaRepository<DatosPersonales,Long> {
}
