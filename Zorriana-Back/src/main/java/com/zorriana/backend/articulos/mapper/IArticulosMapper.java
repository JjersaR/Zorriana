package com.zorriana.backend.articulos.mapper;

import com.zorriana.backend.articulos.dto.ListarArticulos;
import com.zorriana.backend.articulos.entity.Articulos;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IArticulosMapper {

    IArticulosMapper INSTANCE = Mappers.getMapper(IArticulosMapper.class);

    // listar todos
    List<ListarArticulos> toDTOListarArt(List<Articulos> articulos);
    ListarArticulos map(Articulos articulos);
}
