import React from 'react';
import { TrainersListData } from './TrainersMock';
import { Link } from 'react-router-dom';

function TrainerList() {
  return (
    <div>
      <h2>List of Trainers</h2>
      <ul>
        {TrainersListData.map(trainer => (
          <li key={trainer.trainerId}>
            <Link to={`/trainers/${trainer.trainerId}`}>{trainer.name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerList;
