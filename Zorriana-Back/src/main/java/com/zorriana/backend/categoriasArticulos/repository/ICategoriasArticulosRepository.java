package com.zorriana.backend.categoriasArticulos.repository;

import com.zorriana.backend.categorias.entity.Categorias;
import com.zorriana.backend.categoriasArticulos.dto.INombresCategorias;
import com.zorriana.backend.categoriasArticulos.dto.IProductosCategoria;
import com.zorriana.backend.categoriasArticulos.entity.CategoriasArticulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoriasArticulosRepository extends JpaRepository<CategoriasArticulos, Long> {
    List<Categorias> findByCategoriaNombre(String nombre);
    List<INombresCategorias> findDistinctBy();

    @Query(value = "select a.Articulo_ID as articuloArticuloID, a.Nombre as articuloNombre,a.Descripcion as articuloDescripcion, a.Disponible as articuloDisponible, a.Precio as articuloPrecio, a.Num_Veces_Vendido as ArticuloNumVecesVendido, c.Categoria_ID as categoriaCategoriaID, c.Nombre_Categoria as categoriaNombre from Articulos a inner join CategoriasArticulos ca on a.Articulo_ID = ca.Articulo_ID inner join Categorias c on ca.Categoria_ID = c.Categoria_ID where c.Nombre_Categoria = ?;", nativeQuery = true)
    List<IProductosCategoria> findByArticulosXCategoria(String categoria);
}
