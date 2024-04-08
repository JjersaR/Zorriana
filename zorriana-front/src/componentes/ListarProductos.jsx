import { useEffect, useState } from "react";
import axios from "axios";

export default function ListarProductos() {
  const [productos, setProductos] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      const response = await axios.get(
        "http://localhost:8080/zorriana/tienda/productos"
      );
      setProductos(response.data);
    };
    fetchData();
  }, []);

  return (
    <div className="products">
      {productos.map((producto) => (
        <div key={producto.ArticuloID} className="card">
          <img
            src={producto.link_Imagen}
            className="card-img-top center"
            alt={producto.nombre}
          />
          <div className="card-body product-card">
            <h5 className="card-title">{producto.nombre}</h5>
            <p className="card-text">{producto.descripcion}</p>
            <p className="card-text">
              {producto.disponible ? "Disponible" : "NO Disponible"}
            </p>
            <p className="card-text">{producto.precio}</p>
            <h6 className="card-text">{producto.numVecesVendido}</h6>
            <a
              href={
                producto.disponible
                  ? "/zorriana/tienda/producto/{produto.ArticuloID}/comprar"
                  : "#"
              }
              className="btn btn-primary">
              {producto.disponible ? "Comprar" : "Agotado"}
            </a>
          </div>
        </div>
      ))}
    </div>
  );
}
