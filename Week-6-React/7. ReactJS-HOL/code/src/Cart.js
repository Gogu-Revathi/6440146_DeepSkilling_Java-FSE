import React, { Component } from 'react';

class Cart extends Component {
  render() {
    return (
      <div style={{
        border: "1px solid #ccc",
        borderRadius: "8px",
        padding: "15px",
        marginBottom: "10px",
        backgroundColor: "#f9f9f9"
      }}>
        <h3>{this.props.itemName}</h3>
        <p><strong>Price:</strong> ₹{this.props.price}</p>
      </div>
    );
  }
}

export default Cart;
