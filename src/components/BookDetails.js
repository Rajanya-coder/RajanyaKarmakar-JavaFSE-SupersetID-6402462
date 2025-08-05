import React from 'react';

function BookDetails() {
  const books = [
    { title: 'Master React', price: 670 },
    { title: 'Deep Dive into Angular 11', price: 800 },
    { title: 'Mongo Essentials', price: 450 }
  ];

  let content;
  if (books.length > 0) {
    content = books.map((book, index) => (
      <div key={index}>
        <h3>{book.title}</h3>
        <p>{book.price}</p>
      </div>
    ));
  } else {
    content = <p>No books available</p>;
  }

  return (
    <div style={{ borderLeft: '5px solid green', paddingLeft: '20px' }}>
      <h2>Book Details</h2>
      {content}
    </div>
  );
}

export default BookDetails;
