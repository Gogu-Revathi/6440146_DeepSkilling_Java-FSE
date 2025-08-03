import React from 'react';

const BookDetails = () => {
  const books = [
    { id: 1, title: "Atomic Habits", author: "James Clear" },
    { id: 2, title: "The Alchemist", author: "Paulo Coelho" },
    { id: 3, title: "Ikigai", author: "Francesc Miralles" }
  ];

  return (
    <div style={styles.card}>
      <h2>📚 Book Details</h2>
      <ul>
        {books.map(book => (
          <li key={book.id}>{book.title} - {book.author}</li>
        ))}
      </ul>
    </div>
  );
};

const styles = {
  card: {
    padding: '20px',
    backgroundColor: '#f9f9f9',
    marginBottom: '20px',
    borderRadius: '10px',
    boxShadow: '0 2px 8px rgba(0,0,0,0.1)'
  }
};

export default BookDetails;
