import React from 'react';
import { useParams } from 'react-router-dom';
import { TrainersListData } from './TrainersMock';

function TrainerDetail() {
  const { id } = useParams();
  const trainer = TrainersListData.find(t => t.trainerId === parseInt(id));

  return trainer ? (
    <div>
      <h2>{trainer.name}'s Profile</h2>
      <p><strong>Email:</strong> {trainer.email}</p>
      <p><strong>Phone:</strong> {trainer.phone}</p>
      <p><strong>Technology:</strong> {trainer.technology}</p>
      <p><strong>Skills:</strong> {trainer.skills}</p>
    </div>
  ) : (
    <p>Trainer not found</p>
  );
}

export default TrainerDetail;
