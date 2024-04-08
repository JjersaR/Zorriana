import { useEffect, useState } from "react";
import ProductosService from "../servicios/ProductosService";

export default function ListarCategorias() {
  const [categorias, setCategorias] = useState([]);

  useEffect(() => {
    ProductosService.getCategoriasAll()
      .then((response) => {
        setCategorias(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <div className="products">
      {categorias.map((categoria) => (
        <div key={categoria.categoriaID} className="card">
          <img />
          <div className="card-body product-card">
            <h5 className="card-title">{categoria.Nombre}</h5>
          </div>
        </div>
      ))}
    </div>
  );
}
