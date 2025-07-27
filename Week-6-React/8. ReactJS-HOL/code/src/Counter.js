import React, { Component } from 'react';

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 0
    };
  }

  increment = () => {
    this.setState(prevState => ({
      counter: prevState.counter + 1
    }));
  }

  decrement = () => {
    this.setState(prevState => ({
      counter: prevState.counter - 1
    }));
  }

  reset = () => {
    this.setState({ counter: 0 });
  }

  render() {
    return (
      <div className="counter-box">
        <h2>Counter App</h2>
        <h3>Count: {this.state.counter}</h3>
        <div className="btn-group">
          <button onClick={this.increment}>➕ Increment</button>
          <button onClick={this.decrement}>➖ Decrement</button>
          <button onClick={this.reset}>🔁 Reset</button>
        </div>
      </div>
    );
  }
}

export default Counter;
