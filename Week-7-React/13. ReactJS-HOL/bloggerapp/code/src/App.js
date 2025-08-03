import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [active, setActive] = useState("books");

  const renderComponent = () => {
    if (active === "books") return <BookDetails />;
    else if (active === "blogs") return <BlogDetails />;
    else if (active === "courses") return <CourseDetails />;
    else return null;
  };

  return (
    <div style={{ fontFamily: 'Segoe UI', padding: '20px', textAlign: 'center' }}>
      <h1>🧠 Blogger Portal</h1>

      <div style={{ marginBottom: '20px' }}>
        <button onClick={() => setActive("books")} style={btnStyle}>Show Books</button>
        <button onClick={() => setActive("blogs")} style={btnStyle}>Show Blogs</button>
        <button onClick={() => setActive("courses")} style={btnStyle}>Show Courses</button>
      </div>

      {/* Rendering using if-else method */}
      {renderComponent()}

      {/* Rendering using ternary */}
      {/* {active === "books" ? <BookDetails /> : active === "blogs" ? <BlogDetails /> : <CourseDetails />} */}

      {/* Rendering using logical AND */}
      {/* {active === "books" && <BookDetails />}
          {active === "blogs" && <BlogDetails />}
          {active === "courses" && <CourseDetails />} */}
    </div>
  );
}

const btnStyle = {
  padding: '10px 15px',
  margin: '5px',
  border: 'none',
  backgroundColor: '#007bff',
  color: 'white',
  borderRadius: '8px',
  cursor: 'pointer'
};

export default App;
