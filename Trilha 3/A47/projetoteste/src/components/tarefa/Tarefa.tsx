import { useState, useEffect} from 'react'

function Tarefa() {
  const [isCompleted, setCompleted] = useState(false);
  const [task, settask] = useState('');
  
  useEffect(() => {
    if (isCompleted) {
      settask('Parabéns! Você concluiu a tarefa!');
    }
  }), [isCompleted];
  
  return (
    <div>
      <h1>Tarefa</h1>
      <h3>{task}</h3>
      <button onClick={() => setCompleted(true)}>Concluir</button>
    </div>
  );
}

export default Tarefa;