import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
  constructor(props) {
    super(props);

    this.cartItems = [
      { id: 1, itemName: "Laptop", price: 65000 },
      { id: 2, itemName: "Smartphone", price: 20000 },
      { id: 3, itemName: "Headphones", price: 3000 },
      { id: 4, itemName: "Keyboard", price: 1500 },
      { id: 5, itemName: "Smartwatch", price: 4500 }
    ];
  }

  render() {
    return (
      <div className="container">
        <h2>Online Shopping Cart</h2>
        {this.cartItems.map(item => (
          <Cart key={item.id} itemName={item.itemName} price={item.price} />
        ))}
      </div>
    );
  }
}

export default OnlineShopping;
