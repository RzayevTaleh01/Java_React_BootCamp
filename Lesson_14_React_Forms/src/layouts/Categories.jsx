import React from "react";
import { Link } from "react-router-dom";
import { Menu } from "semantic-ui-react";

export default function Categories() {
  return (
    <div>
      <Menu pointing vertical>
        <Menu.Item as={Link} name="home" to="../" />
        <Menu.Item as={Link} name="products" to="/products" />
        <Menu.Item as={Link} name="add product" to="/product/add"/>
      </Menu>
    </div>
  );
}
