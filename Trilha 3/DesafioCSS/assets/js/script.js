let nome = document.getElementById("nome");
let email = document.getElementById("email");
let mensagem = document.getElementById("mensagem");

let nomeOk = false;
let emailOk = false;
let mensagemOk = false;

function validarNome() {
  let txtNome = document.querySelector("#txtNome");
  if (nome.value.length <= 2) {
    txtNome.innerHTML = 'Nome Inválido';
    txtNome.style.color = 'red';
  } else {
    txtNome.innerHTML = 'Nome Válido';
    txtNome.style.color = 'green';
    nomeOk = true;
  }
}

function validarEmail2() {
  let txtEmail = document.querySelector("#txtEmail");
  if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
    txtEmail.innerHTML = 'E-mail Inválido';
    txtEmail.style.color = 'red';
  } else {
    txtEmail.innerHTML = 'Email Válido';
    txtEmail.style.color = 'green';
    emailOk = true;
  }
}

function validarMensagem() {
  let txtMensagem = document.querySelector("#txtMensagem");
  if (mensagem.value.length >= 100) {
    txtMensagem.innerHTML = 'Limite de caracters atingido';
    txtMensagem.style.color = 'red';
    txtMensagem.style.display = 'block';
  } else {
    txtMensagem.style.display = 'none';
    mensagemOk = true;
  }
}

function enviarForm() {
    if (nomeOk == true && emailOk == true && mensagemOk == true) {
    alert("Formulário enviado com sucesso!");
  } else {
    alert("Houve um erro no preenchimento do seu formulário. Verifique e tente novamente");
  }
}