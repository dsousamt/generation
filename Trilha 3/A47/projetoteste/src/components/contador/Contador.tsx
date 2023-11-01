import { useState } from 'react'

function Contador() {
  const [valor, setValor] = useState(0);

  function somarMaisUm() {
    setValor(valor + 1)
  }
  return (
    <>
    <span>Curtidas: {valor} </span>
    <button onClick={somarMaisUm} style={{background: "black"}}>👍</button>
    </>
  )
}

export default Contador