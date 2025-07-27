import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <h1>Student Score Portal</h1>
      <CalculateScore name="Revathi" school="MRECW" total={470} goal={5} />
    </div>
  );
}

export default App;
