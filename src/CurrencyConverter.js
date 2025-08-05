import React, { useState } from 'react';

function CurrencyConverter() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState(null);

  const handleSubmit = () => {
    const conversionRate = 0.011; // Example rate: ₹1 = €0.011
    const converted = (rupees * conversionRate).toFixed(2);
    setEuro(converted);
  };

  return (
    <div style={{ marginTop: '30px' }}>
      <h2>Currency Converter</h2>
      <input
        type="number"
        placeholder="Enter amount in INR"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />
      <button onClick={handleSubmit}>Convert</button>
      {euro && <h3>€ {euro}</h3>}
    </div>
  );
}

export default CurrencyConverter;
