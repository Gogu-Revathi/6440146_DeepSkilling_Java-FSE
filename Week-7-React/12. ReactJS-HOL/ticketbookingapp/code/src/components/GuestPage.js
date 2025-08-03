import React from 'react';

const GuestPage = () => {
  return (
    <div style={styles.card}>
      <h2>✈️ Flight Details</h2>
      <p><strong>Flight:</strong> Indigo 6E-123</p>
      <p><strong>From:</strong> Hyderabad</p>
      <p><strong>To:</strong> Delhi</p>
      <p><strong>Time:</strong> 9:00 AM</p>
    </div>
  );
};

const styles = {
  card: {
    backgroundColor: '#f9f9f9',
    padding: '20px',
    borderRadius: '12px',
    maxWidth: '400px',
    margin: '20px auto',
    boxShadow: '0 2px 8px rgba(0,0,0,0.1)',
    textAlign: 'center'
  }
};

export default GuestPage;
