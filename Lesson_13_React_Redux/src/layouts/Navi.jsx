import React, { useState } from "react";
import CartSummary from "./CartSummary";
import SignedOut from "./SignedOut";
import Signedin from "./Signedin";

import { Container, Menu } from "semantic-ui-react";
import { Link, useHistory } from "react-router-dom";
import { useSelector } from "react-redux";
export default function Navi() {
  const { cartItems } = useSelector((state) => state.cart);
  const [isAuthenticated, setIsAuthenticated] = useState(true);
  const history = useHistory();
  function handleSignOut() {
    setIsAuthenticated(false);
    history.push("/");
  }
  function handleSignIn() {
    setIsAuthenticated(true);
  }
  return (
    <div>
      <Menu inverted fixed="top">
        <Container>
          <Menu.Item as={Link} name="home" to="../" />
          {/* Araşdırma Menu.İtem`e nasıl link verilir. Örnek: */}
          {/* <Menu.Item as={Link} name="profile" to="profile"></Menu.Item> */}
          <Menu.Item name="messages" />

          <Menu.Menu position="right">
            {" "}
            {/* sepet əgər boş olarsa göstərmir navi  */}
            {cartItems.length>0&&<CartSummary />}{" "}
            {isAuthenticated ? (
              <Signedin signOut={handleSignOut} />
            ) : (
              <SignedOut signIn={handleSignIn} />
            )}
          </Menu.Menu>
        </Container>
      </Menu>
      Navi
    </div>
  );
}
