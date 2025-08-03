import React from 'react';

const CourseDetails = () => {
  const courses = [
    { id: 'c1', name: "ReactJS", duration: "4 weeks" },
    { id: 'c2', name: "NodeJS", duration: "6 weeks" },
    { id: 'c3', name: "MongoDB", duration: "5 weeks" }
  ];

  return (
    <div style={styles.card}>
      <h2>📘 Course Details</h2>
      <ul>
        {courses.map(course => (
          <li key={course.id}>{course.name} - {course.duration}</li>
        ))}
      </ul>
    </div>
  );
};

const styles = {
  card: {
    padding: '20px',
    backgroundColor: '#eef6ff',
    marginBottom: '20px',
    borderRadius: '10px',
    boxShadow: '0 2px 8px rgba(0,0,0,0.1)'
  }
};

export default CourseDetails;
