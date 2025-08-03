import React from 'react';

const UserPage = () => {
  return (
    <div style={styles.card}>
      <h2>🎫 Book Your Ticket</h2>
      <form>
        <input type="text" placeholder="Enter your name" style={styles.input} /><br />
        <input type="text" placeholder="Flight Number" style={styles.input} /><br />
        <button style={styles.button}>Book Ticket</button>
      </form>
    </div>
  );
};

const styles = {
  card: {
    backgroundColor: '#ffffff',
    padding: '20px',
    borderRadius: '12px',
    maxWidth: '400px',
    margin: '20px auto',
    boxShadow: '0 2px 10px rgba(0,0,0,0.1)',
    textAlign: 'center'
  },
  input: {
    padding: '10px',
    margin: '10px 0',
    width: '100%',
    border: '1px solid #ccc',
    borderRadius: '6px'
  },
  button: {
    padding: '10px 16px',
    backgroundColor: '#007bff',
    color: 'white',
    border: 'none',
    borderRadius: '6px',
    cursor: 'pointer'
  }
};

export default UserPage;
