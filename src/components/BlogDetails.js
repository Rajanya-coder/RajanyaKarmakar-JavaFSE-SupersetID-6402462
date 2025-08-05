import React from 'react';

function BlogDetails() {
  const blogs = [
    {
      title: 'React Learning',
      author: 'Stephen Biz',
      content: 'Welcome to learning React!'
    },
    {
      title: 'Installation',
      author: 'Schewzdenier',
      content: 'You can install React from npm.'
    }
  ];

  return (
    <div style={{ borderLeft: '5px solid green', paddingLeft: '20px' }}>
      <h2>Blog Details</h2>
      {blogs.length > 0 &&
        blogs.map((blog, index) => (
          <div key={index}>
            <h3>{blog.title}</h3>
            <p><strong>{blog.author}</strong></p>
            <p>{blog.content}</p>
          </div>
        ))}
    </div>
  );
}

export default BlogDetails;
