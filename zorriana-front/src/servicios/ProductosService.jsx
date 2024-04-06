import axios from "axios";

const BACK_LISTAR_PRODUCTOS = 'http://localhost:8080/zorriana/tienda/productos';
class ProductosService {
  getFindAll() {
    return axios.get(BACK_LISTAR_PRODUCTOS);
  }
}

export default new ProductosService();
