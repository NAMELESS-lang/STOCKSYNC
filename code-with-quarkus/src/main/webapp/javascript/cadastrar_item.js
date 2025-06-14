// Notifica o usuário do sucesso de cadastro
function notificacao(message){
    let body = document.getElementById('body');
    let form = document.getElementById('cadastro_item');
    let paragrafo_mensagem = document.createElement('p');
    paragrafo_mensagem.textContent = message;
    body.insertBefore(paragrafo_mensagem,form);
    return
}

// processo de envio das informações do formulário
function cadastrar(){
    // Cria um formData com o formulário de cadastro
    let form = new FormData(document.getElementById('cadastro_item'));

    // Cria o JSON a ser envia pelo body da requisição http
    let dados_produto = new Object();
    form.forEach((element,key) => {
        dados_produto[key] = element;        
    });

    const requisicao = { // criando minha requisição http
        method : 'POST',
        headers : {'Content-type': 'application/json'},
        body: JSON.stringify(dados_produto)
    };
    fetch('http://localhost:8080/cadastrar_item',requisicao) // envia para o endpoint a requisição http (requisicao)
    .then(response =>{ // caso dê certo, o que fazer com a resposta
        notificacao(response);
    })
    .catch(error=>{ // caso dê errado, o que fazer com a mensagem de erro
        notificacao(error);
    });
}


// Quando o formulário for enviado, intercepte, não recarregue a página, e em vez disso, execute a função cadastrar().
document.getElementById("cadastro_item").addEventListener('submit',function(event){
    event.preventDefault();
    cadastrar();
});
