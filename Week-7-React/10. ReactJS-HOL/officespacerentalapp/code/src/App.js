import React from 'react';
import officeImage from './office.jpeg'; // adjust path if inside a subfolder

function App() {
  

  const office = {
    name: "Prime Tower",
    rent: 58000,
    address: "MG Road, Bangalore"
  };

  const officeList = [
    { id: 1, name: "Sky Hub", rent: 72000, address: "Andheri, Mumbai" },
    { id: 2, name: "Tech Plaza", rent: 45000, address: "Hitech City, Hyderabad" },
    { id: 3, name: "Smart Tower", rent: 61000, address: "Baner, Pune" },
    { id: 4, name: "Infinity Spaces", rent: 39000, address: "Salt Lake, Kolkata" }
  ];

  const rentStyle = (rent) => ({
    color: rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  });

  return (
    <div style={{ fontFamily: 'Segoe UI', padding: '20px', backgroundColor: '#f7f9fc' }}>
      <h1 style={{ color: '#002244', textAlign: 'center' }}>🏢 Office Space Rental Portal</h1>

      <img 
  src={officeImage} 
  alt="Office Space" 
  style={{ 
    display: 'block', 
    width: '300px',      
    height: '180px',       
    objectFit: 'cover',     
    borderRadius: '10px',
    margin: '20px auto',
    boxShadow: '0 4px 10px rgba(0,0,0,0.2)'
  }} 
/>



      <div style={{ background: '#fff', padding: '15px', borderRadius: '10px', boxShadow: '0 2px 8px rgba(0,0,0,0.1)', marginBottom: '20px' }}>
        <h2>Featured Office</h2>
        <p><strong>Name:</strong> {office.name}</p>
        <p><strong>Address:</strong> {office.address}</p>
        <p><strong>Rent:</strong> <span style={rentStyle(office.rent)}>₹{office.rent}</span></p>
      </div>

      <h2 style={{ marginTop: '30px' }}>📋 Available Offices</h2>
      <div style={{ display: 'flex', flexWrap: 'wrap', gap: '15px', marginTop: '10px' }}>
        {officeList.map((item) => (
          <div key={item.id} style={{
            backgroundColor: '#ffffff',
            padding: '15px',
            borderRadius: '10px',
            width: '250px',
            boxShadow: '0 2px 10px rgba(0,0,0,0.1)'
          }}>
            <h3>{item.name}</h3>
            <p><strong>Address:</strong> {item.address}</p>
            <p><strong>Rent:</strong> <span style={rentStyle(item.rent)}>₹{item.rent}</span></p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
