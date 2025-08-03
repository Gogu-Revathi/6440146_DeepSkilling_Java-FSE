import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const toggleLogin = () => setIsLoggedIn(!isLoggedIn);

  return (
    <div style={{ fontFamily: 'Segoe UI', padding: '20px', textAlign: 'center' }}>
      <h1>🛫 Ticket Booking Portal</h1>

      <button 
        onClick={toggleLogin}
        style={{
          padding: '10px 20px',
          backgroundColor: isLoggedIn ? '#dc3545' : '#28a745',
          color: 'white',
          border: 'none',
          borderRadius: '8px',
          marginBottom: '20px',
          cursor: 'pointer'
        }}
      >
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>

      {isLoggedIn ? <UserPage /> : <GuestPage />}
    </div>
  );
}

export default App;
