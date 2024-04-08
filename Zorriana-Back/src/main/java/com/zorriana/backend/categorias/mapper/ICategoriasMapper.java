package com.zorriana.backend.categorias.mapper;

import com.zorriana.backend.categorias.dto.ListarCategorias;
import com.zorriana.backend.categorias.entity.Categorias;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ICategoriasMapper {
    ICategoriasMapper INSTANCE = Mappers.getMapper(ICategoriasMapper.class);

    // listar categorias
    ListarCategorias map(Categorias categorias);
    @Mapping(source = "linkImagen", target = "linkImagen")
    List<ListarCategorias> toDTOListarCategorias(List<Categorias> categorias);
}
