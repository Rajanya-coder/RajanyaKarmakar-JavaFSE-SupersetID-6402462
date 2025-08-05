import React from 'react';

const OddPlayers = (team) => {
  const [first, , third, , fifth] = team;
  return (
    <ul>
      <li>First : {first}1</li>
      <li>Third : {third}3</li>
      <li>Fifth : {fifth}5</li>
    </ul>
  );
};

export default OddPlayers;
