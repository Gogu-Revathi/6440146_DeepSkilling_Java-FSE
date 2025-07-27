import React from 'react';
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import TrainerList from './TrainerList';
import TrainerDetail from './TrainerDetail';

function App() {
  return (
    <Router>
      <div>
        <h1>Trainers App</h1>
        <nav>
          <Link to="/">Home</Link> | <Link to="/trainers">Trainers</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainerList />} />
          <Route path="/trainers/:id" element={<TrainerDetail />} />
        </Routes>
        <footer style={{ textAlign: 'center', padding: '20px', fontSize: '14px', color: '#888' }}>
  © 2025 Cognizant Trainers Portal
</footer>

      </div>
    </Router>
  );
}

export default App;
