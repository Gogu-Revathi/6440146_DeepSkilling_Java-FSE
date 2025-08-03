import React, { useState } from 'react';
import CurrencyConverter from './components/CurrencyConverter';

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    sayHello();
    setCount(count + 1);
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert('👋 Hello! You clicked increment');
  };

  const sayWelcome = (msg) => {
    alert(`🌟 ${msg}`);
  };

  const handleSyntheticEvent = (e) => {
    alert('🖱️ I was clicked!');
  };

  return (
    <div style={{ fontFamily: 'Segoe UI', padding: '20px', textAlign: 'center' }}>
      <h1>⚙️ React Event Handling</h1>

      <div style={{ marginBottom: '20px' }}>
        <h2>Counter: {count}</h2>
        <button onClick={increment} style={btnStyle}>Increment</button>
        <button onClick={decrement} style={btnStyle}>Decrement</button>
      </div>

      <div>
        <button onClick={() => sayWelcome("Welcome to React")} style={btnStyle}>Say Welcome</button>
      </div>

      <div style={{ marginTop: '20px' }}>
        <button onClick={handleSyntheticEvent} style={btnStyle}>Synthetic Event Click</button>
      </div>

      <CurrencyConverter />
    </div>
  );
}

const btnStyle = {
  padding: '10px 16px',
  margin: '10px',
  backgroundColor: '#007bff',
  color: 'white',
  border: 'none',
  borderRadius: '8px',
  cursor: 'pointer'
};

export default App;
