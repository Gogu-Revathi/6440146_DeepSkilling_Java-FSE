import React from 'react';
import './PlayerStyles.css';

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 67 },
    { name: "Gill", score: 45 },
    { name: "Rahul", score: 78 },
    { name: "Pant", score: 88 },
    { name: "Hardik", score: 59 },
    { name: "Jadeja", score: 74 },
    { name: "Bumrah", score: 60 },
    { name: "Shami", score: 40 },
    { name: "Surya", score: 91 },
    { name: "Kuldeep", score: 65 },
  ];

  const filtered = players.filter(player => player.score < 70);

  return (
    <div className="player-container">
      <h2>🌟 All Players</h2>
      <div className="card-grid">
        {players.map((player, index) => (
          <div className="player-card" key={index}>
            <h3>{player.name}</h3>
            <p className={`score ${player.score < 70 ? 'low' : 'high'}`}>Score: {player.score}</p>
          </div>
        ))}
      </div>

      <h2>❌ Players with score below 70</h2>
      <ul className="filtered-list">
        {filtered.map((player, index) => (
          <li key={index}>⚠️ {player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
