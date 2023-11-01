import Home from "./assets/pages/home/Home"
import Card from "./components/card/Card"
import Contador from "./components/contador/Contador"
import Tarefa from "./components/tarefa/Tarefa"

function App() {

  return (
    <>
      <Card titulo="Titulo do teste 1" descricao="descricao do teste 1"/>
      <Card titulo="Titulo do teste 2" descricao="descricao do teste 2"/>
      <Card titulo="Titulo do teste 3" descricao="descricao do teste 3"/>
      <Contador/>
      <Tarefa />
    </>
  )
}

export default App
