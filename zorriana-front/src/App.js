import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import ListarCategorias from "./componentes/ListarCategorias";
import ListarProductos from "./componentes/ListarProductos";
import Header from "./componentes/Header";

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Header />
        <div>
          <Routes>
            <Route
              exact
              path="/zorriana/tienda/productos"
              element={<ListarProductos />}></Route>
            <Route
              path="/zorriana/tienda/categorias"
              element={<ListarCategorias />}></Route>
          </Routes>
        </div>
      </BrowserRouter>
    </div>
  );
}

export default App;
