import React from 'react';

const IndianPlayers = () => {
  const team = ["Virat", "Rohit", "Gill", "Rahul", "Pant", "Hardik"];
  const [oddPlayers, evenPlayers] = [
    team.filter((_, i) => i % 2 !== 0),
    team.filter((_, i) => i % 2 === 0)
  ];

  const T20players = ["Kohli", "Bumrah"];
  const RanjiTrophyPlayers = ["Rinku", "Sarfaraz"];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players:</h2>
      <ul>{oddPlayers.map((p, i) => <li key={i}>{p}</li>)}</ul>

      <h2>Even Team Players:</h2>
      <ul>{evenPlayers.map((p, i) => <li key={i}>{p}</li>)}</ul>

      <h2>Merged Player List (T20 + Ranji):</h2>
      <ul>{mergedPlayers.map((p, i) => <li key={i}>{p}</li>)}</ul>
    </div>
  );
};

export default IndianPlayers;
