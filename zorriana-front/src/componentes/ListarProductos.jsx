import { useEffect } from "react";
import { useState } from "react";
import ProductosService from "../servicios/ProductosService";

const myProducts = [
  {
    id: 1,
    nombre: "Producto 1",
    descripcion: "Descripción del producto 1",
    precio: 1000,
    disponible: true,
    numVecesVendido: 10,
  },
  {
    id: 2,
    nombre: "Producto 2",
    descripcion: "Descripción del producto 2",
    precio: 2000,
    disponible: false,
    numVecesVendido: 20,
  },
  {
    id: 3,
    nombre: "Producto 3",
    descripcion: "Descripción del producto 3",
    precio: 3000,
    disponible: true,
    numVecesVendido: 30,
  },
  {
    id: 4,
    nombre: "Producto 4",
    descripcion: "Descripción del producto 4",
    precio: 4000,
    disponible: false,
    numVecesVendido: 40,
  },
];

export default function ListarProductos() {
  const [productos, setProductos] = useState([]);

  useEffect(() => {
    ProductosService.getFindAll()
      .then((response) => {
        setProductos(response.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  return (
    <div className="products">
      {myProducts.map((producto) => (
        <div key={producto.ArticuloID} className="card ">
          <img
            src={producto.linkImagen}
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
