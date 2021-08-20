import React from "react";
import { NavLink } from "react-router-dom";
import { Dropdown,Label,Button } from "semantic-ui-react";
import { useSelector } from "react-redux";
import { removeFromCart } from "../store/actions/cartActions";
import { useDispatch } from "react-redux";
import { toast } from "react-toastify";
export default function CartSummary() {
  const dispatch = useDispatch()

  const handleRemoveFromCart=(product)=>{
    dispatch(removeFromCart(product))
    toast.error(`${product.productName} Sepetden Silindi`)
}
    const {cartItems} = useSelector(state => state.cart)

  return (
    <div>
      <Dropdown item text="Sepetiniz">
        <Dropdown.Menu>
            {
                cartItems.map((cartItem)=>(
                    <Dropdown.Item key={cartItem.product.id}>
                        {cartItem.product.productName} 
                        <Label>
                            {cartItem.quantity}
                        </Label>
                        <Button onClick={()=>handleRemoveFromCart(cartItem.product)}>
                          x
                        </Button>
                    </Dropdown.Item>
                ))
            }
          <Dropdown.Divider />
          <Dropdown.Item as={NavLink} to="/cart">
            Sepete git
          </Dropdown.Item>
        </Dropdown.Menu>
      </Dropdown>
    </div>
  );
}
