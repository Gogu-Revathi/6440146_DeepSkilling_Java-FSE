import React from 'react';

const BlogDetails = () => {
  const blogs = [
    { id: 101, title: "React Basics", author: "John" },
    { id: 102, title: "Understanding JSX", author: "Sara" },
    { id: 103, title: "Props vs State", author: "Meera" }
  ];

  return (
    <div style={styles.card}>
      <h2>📝 Blog Details</h2>
      <ul>
        {blogs.map(blog => (
          <li key={blog.id}>{blog.title} - {blog.author}</li>
        ))}
      </ul>
    </div>
  );
};

const styles = {
  card: {
    padding: '20px',
    backgroundColor: '#ffffff',
    marginBottom: '20px',
    borderRadius: '10px',
    boxShadow: '0 2px 8px rgba(0,0,0,0.1)'
  }
};

export default BlogDetails;
