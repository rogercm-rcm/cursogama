function validaLogin() {
    let userTxt = localStorage.getItem("userLogged")

    if(!userTxt){
        window.location = "index.html";
    }
    
    let user = JSON.parse(userTxt);

    document.getElementById("fotoUser").innerHTML = `<img src= "${user.linkFoto}">`;
    document.getElementById("dadosUser").innerHTML = `${user.nome} (<b>${user.racf}</b>)`;
}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "index.html";
}

function buscarUsuarios() {
    fetch("http://localhost:8080/user/all")
    .then(res => tratarRetorno(res))
    
}

function tratarRetorno(resposta) {
    if (resposta.status == 200) {
        resposta.json().then(res => exibirUsuarios(res));
    } else {
        document.getElementById("usuarios").innerHTML = "Nenhum usuario cadastrado";
    }  
    
       
}

function exibirUsuarios(lista) {
    let tabela = `<table class="table table-sm"> <tr><th>Nome</th> <th>e-mail</th> </tr>`;

    for(i=0; i < lista.length; i++){
        tabela += `<tr> <td>${lista[i].nome}</td> <td>${lista[i].email} </td> </tr>`

    }
    
    tabela += `</table>`
    document.getElementById("usuarios").innerHTML = tabela;
}