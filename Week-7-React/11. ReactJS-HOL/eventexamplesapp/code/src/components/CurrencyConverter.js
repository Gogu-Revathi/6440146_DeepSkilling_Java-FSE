import React, { useState } from 'react';

const CurrencyConverter = () => {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault(); // Prevent page refresh if inside a form

    const rupeeValue = parseFloat(rupees);
    if (isNaN(rupeeValue)) {
      alert("Please enter a valid number!");
      return;
    }

    const euroValue = rupeeValue / 90;
    setEuros(euroValue.toFixed(2)); // round to 2 decimal places
  };

  return (
    <div style={styles.card}>
      <h3>💱 Currency Converter</h3>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter amount in INR"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          style={styles.input}
        />
        <button type="submit" style={styles.button}>Convert</button>
      </form>
      {euros && (
        <p style={{ marginTop: '10px', fontWeight: 'bold' }}>Euro: €{euros}</p>
      )}
    </div>
  );
};

const styles = {
  card: {
    backgroundColor: '#fff',
    padding: '20px',
    borderRadius: '10px',
    maxWidth: '300px',
    margin: '20px auto',
    boxShadow: '0 2px 8px rgba(0,0,0,0.1)',
    textAlign: 'center'
  },
  input: {
    padding: '10px',
    marginBottom: '10px',
    width: '100%',
    borderRadius: '6px',
    border: '1px solid #ccc'
  },
  button: {
    padding: '8px 16px',
    backgroundColor: '#28a745',
    color: 'white',
    border: 'none',
    borderRadius: '6px',
    cursor: 'pointer'
  }
};

export default CurrencyConverter;
