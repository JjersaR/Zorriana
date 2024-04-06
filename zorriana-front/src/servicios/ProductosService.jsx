import axios from "axios";

const BACK_LISTAR_PRODUCTOS = 'http://localhost:8080/zorriana/tienda/productos';
const BACK_LISTAR_CATEGORIAS = 'http://localhost:8080/zorriana/tienda/categorias';

class ProductosService {
  // listar todos los productos
  getFindAll() {
    return axios.get(BACK_LISTAR_PRODUCTOS);
  }

  // listar todas las categorias
  getCategoriasAll() {
    return axios.get(BACK_LISTAR_CATEGORIAS);
  }
}

export default new ProductosService();
