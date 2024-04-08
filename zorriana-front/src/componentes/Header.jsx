import React from "react";
import { NavLink } from "react-router-dom";

const Header = () => {
  return (
    <header>
      <nav>
        <NavLink to={""}>Link</NavLink>
        <NavLink to={""}>Link</NavLink>
        <NavLink to={""}>Link</NavLink>
      </nav>
      <div>
        <h3>Zorriana</h3>
      </div>
      <nav>
        <img src="" alt="" />
        <NavLink to={""}>Link</NavLink>
        <img src="" alt="" />
      </nav>
    </header>
  );
};

export default Header;
