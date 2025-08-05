import React from 'react';

const IndianPlayers = () => {
  const team = ['Sachin1', 'Dhoni2', 'Virat3', 'Rohit4', 'Yuvaraj5', 'Raina6'];

  // Destructure based on index
  const [first, second, third, fourth, fifth, sixth] = team;

  const T20Players = [
    'Mr. First Player',
    'Mr. Second Player',
    'Mr. Third Player',
  ];

  const RanjiTrophyPlayers = [
    'Mr. Fourth Player',
    'Mr. Fifth Player',
    'Mr. Sixth Player',
  ];

  const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>

      <h2>Even Players</h2>
      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>

      <hr />

      <h2>List of Indian Players Merged:</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
