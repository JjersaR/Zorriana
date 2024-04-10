import React from "react";
import { NavLink, useNavigate } from "react-router-dom";
import "./shoppingCart.css";
import "./profile.css";

const Header = () => {
  const navigate = useNavigate();

  const onShoppingCartClick = () => {
    navigate("/carrito");
  };

  return (
    <header className="header">
      <div className="header-wrapper ">
        <nav className="nav-info">
          <NavLink to="/informate">Informate</NavLink>
          <NavLink to="/acerca-de">Acerca de</NavLink>
          <NavLink to="/zorriana/tienda/categorias">Categorias</NavLink>
          <NavLink to="/zorriana/tienda/productos">Productos</NavLink>
        </nav>
        <div>
          <h3>
            <NavLink to={"/"}>Zorriana</NavLink>
          </h3>
        </div>
        <nav className="nav-personal">
          <div>
            <i className="gg-shopping-cart" onClick={onShoppingCartClick}></i>
            <NavLink to="/carrito">Carrito</NavLink>
          </div>
          <i className="gg-profile"></i>
        </nav>
      </div>
      <div className="header-search-bar">
        <input type="text" />
      </div>
    </header>
  );
};

export default Header;
