import React from 'react';

const EvenPlayers = (team) => {
  const [, second, , fourth, , sixth] = team;
  return (
    <ul>
      <li>Second : {second}2</li>
      <li>Fourth : {fourth}4</li>
      <li>Sixth : {sixth}6</li>
    </ul>
  );
};

export default EvenPlayers;
